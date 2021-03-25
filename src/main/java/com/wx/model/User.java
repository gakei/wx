package com.wx.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nick_name
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.language
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.city
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.provinces
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String provinces;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.country
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nick_name
     *
     * @return the value of user.nick_name
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nick_name
     *
     * @param nickName the value for user.nick_name
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.language
     *
     * @return the value of user.language
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.language
     *
     * @param language the value for user.language
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.city
     *
     * @return the value of user.city
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.city
     *
     * @param city the value for user.city
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.provinces
     *
     * @return the value of user.provinces
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getProvinces() {
        return provinces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.provinces
     *
     * @param provinces the value for user.provinces
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setProvinces(String provinces) {
        this.provinces = provinces == null ? null : provinces.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.country
     *
     * @return the value of user.country
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.country
     *
     * @param country the value for user.country
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Thu Mar 25 09:28:27 CST 2021
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}