package com.wx.controller;

import com.wx.Result.GetArticleDetailResult;
import com.wx.dto.ArticleDTO;
import com.wx.mapper.ArticleMapper;
import com.wx.mapper.UserMapper;
import com.wx.model.Article;
import com.wx.model.User;
import com.wx.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WHJ
 * @description 文章详情Controller
 * @create 2021-04-06 13:55
 **/
@RestController
@RequestMapping("/wx/index")
public class ArticleDetailController {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/articleDetail/{articleId}")
    public GetArticleDetailResult getArticleDetail(@PathVariable(name = "articleId") Integer articleId) {
        Article article = articleMapper.selectByPrimaryKey(articleId);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andOpenIdEqualTo(article.getCreator());
        List<User> users = userMapper.selectByExample(userExample);


        User user = users.get(0);
        ArticleDTO articleDTO = new ArticleDTO(article, user, null);

        return GetArticleDetailResult.success("请求成功", articleDTO);
    }
}
