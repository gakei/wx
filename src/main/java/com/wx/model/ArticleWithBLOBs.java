package com.wx.model;

public class ArticleWithBLOBs extends Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.images
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    private String images;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.images
     *
     * @return the value of article.images
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.images
     *
     * @param images the value for article.images
     *
     * @mbg.generated Thu Apr 08 20:29:52 CST 2021
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}