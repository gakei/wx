package com.wx.controller;

import com.wx.Result.PublishResult;
import com.wx.dto.ArticleDTO;
import com.wx.mapper.ArticleMapper;
import com.wx.mapper.UserMapper;
import com.wx.model.Article;
import com.wx.model.ArticleExample;
import com.wx.model.User;
import com.wx.service.PublishPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author WHJ
 * @description 发布动态controller
 * @create 2021-04-01 18:12
 **/
@RestController
@RequestMapping("/wx/index")
public class PublicshController {
    @Autowired
    private PublishPost publishPost;
    @PostMapping("/publish")
    public PublishResult getArticles(@RequestBody Map<String, Object> param) {
        return publishPost.insertPost(param);
    }
}
