package com.wx.controller;

import com.wx.dto.ArticleDTO;
import com.wx.mapper.ArticleMapper;
import com.wx.mapper.UserMapper;
import com.wx.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WHJ
 * @description 首页Controller
 * @create 2021-03-31 16:46
 **/
@RestController
@RequestMapping("/wx/index")
public class IndexController {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/allArticles")
    public List<ArticleDTO> getArticles() {
        ArticleExample example = new ArticleExample();
        List<ArticleWithBLOBs> articles = articleMapper.selectByExampleWithBLOBs(example);

        List<ArticleDTO> res = new ArrayList<>();

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        for (ArticleWithBLOBs article :articles) {
            String creator = article.getCreator();
            criteria.andOpenIdEqualTo(creator);
            User user = userMapper.selectByExample(userExample).get(0);
            String[] images = null;
            if (article.getImages() != null) {
                images = article.getImages().split(",");
            }
            ArticleDTO articleDTO = new ArticleDTO(article, user, images);
            res.add(articleDTO);
        }

        return res;
    }
}
