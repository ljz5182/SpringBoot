package com.ljz.domain;

import java.util.Date;

/**
 *
 * 用户实体类    用于Mybatis
 *
 * Created by liangjiazhang on 2017/7/13.
 */
public class User {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public Date getResigterDate() {
        return resigterDate;
    }

    public void setResigterDate(Date resigterDate) {
        this.resigterDate = resigterDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     *  用户id
     *
     */
    private  Long id;


    /**
     *  用户名
     */
    private  String userName;


    /**
     * 用户密码
     */
    private  String userPassWord;


    /**
     *  注册时间
     */
    private Date  resigterDate;


    /**
     *  更新时间
     */
    private  String updateTime;


    /**
     * 删除状态
     */
    private Integer deleteState;


    /**
     * 用户昵称
     */
    private String nickName;


    /**
     * 用户头像
     */
    private String userHead;

    /**
     * 谁创建改用户
     */
    private String createBy;

    /**
     * 谁更新该用户
     */
    private String updateBy;



}
