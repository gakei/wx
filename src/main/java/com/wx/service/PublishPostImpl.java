package com.wx.service;

import com.wx.Result.PublishResult;
import com.wx.dto.TagDTO;
import com.wx.mapper.ArticleMapper;
import com.wx.model.Article;
import com.wx.model.ArticleWithBLOBs;
import com.wx.util.TurnIntoTagDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WHJ
 * @description 实现发布动态接口
 * @create 2021-04-01 18:25
 **/
@Service
public class PublishPostImpl implements PublishPost {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public PublishResult insertPost(Map<String, Object> param) {
        String content = (String) param.get("content");
        //每一个list项是LinkedHashMap
        List<Object> tagsMap = (List<Object>) param.get("tags");
        List<TagDTO> tags = TurnIntoTagDTO.turn(tagsMap);
        List<String> upLoadImgs = (List<String>) param.get("upLoadImgs");
        StringBuilder urls = new StringBuilder();
        //将图片url拼接成字符串
        for (String url : upLoadImgs) {
            if (url != null) {
                url += ",";
                urls.append(url);
            }
        }
        //去除拼接字符串后最后一个逗号
        if (urls.length() > 0) {
            urls.deleteCharAt(urls.length() - 1);
        }
        ArticleWithBLOBs articleBLOBS = new ArticleWithBLOBs();
        int count = 0;  //统计选中标签数
        for(TagDTO tag : tags) {
            if (tag.isActive()) {
                count++;
            }
            if (count > 1) {
                return PublishResult.fail("发布失败，最多只能选中一个标签");
            } else if(tag.isActive()) {
                articleBLOBS.setTag(tag.getValue());
            }
        }
        if (count == 0) {
            return PublishResult.fail("发布失败，你没有选择标签");
        }
        try {
            String creator = (String) param.get("creator");
            articleBLOBS.setContent(content);
            articleBLOBS.setCreator(creator);
            articleBLOBS.setCommentNum(0);
            articleBLOBS.setIsDeleted(0);
            articleBLOBS.setLikeNum(0);
            articleBLOBS.setCreateTime(new Date().getTime());
            articleBLOBS.setImages(urls.toString());
            articleMapper.insert(articleBLOBS);
            return PublishResult.success("发布成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return PublishResult.fail("发布失败");
        }
    }
}
