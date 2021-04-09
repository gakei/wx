package com.wx.Result;

import com.wx.dto.ArticleDTO;
import com.wx.dto.UserInfoDTO;

/**
 * @author WHJ
 * @description 获取文章详情Result
 * @create 2021-04-06 13:56
 **/
public class GetArticleDetailResult extends Result<ArticleDTO> {
    public GetArticleDetailResult(ResultStatus status, String msg, ArticleDTO data) {
        super(status, msg, data);
    }
    public static GetArticleDetailResult success(String msg, ArticleDTO articleDTO) {
        return new GetArticleDetailResult(ResultStatus.OK, msg, articleDTO);
    }
}
