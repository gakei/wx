package com.wx.dto;

import com.wx.model.Article;
import com.wx.model.User;
import lombok.Data;

import java.util.List;

/**
 * @author WHJ
 * @description ArticleDTO
 * @create 2021-03-31 16:48
 **/
@Data
public class ArticleDTO {
    private Article article;
    private User user;
    private String[] imageUrls;

    public ArticleDTO(Article article, User user, String[] imageUrls) {
        this.article = article;
        this.user = user;
        this.imageUrls = imageUrls;
    }
}
