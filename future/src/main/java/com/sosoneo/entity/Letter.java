package com.sosoneo.entity;

import java.util.Date;

/**
 * Created by sosoneo on 2018/2/12.
 */
public class Letter {
    // 信件ID
    private long letterId;
    // 信件内容
    private String content;
    // 信件目标邮箱
    private String email;
    // 信件目标送达时间
    private Date deliveryTime;
    // 信件创建时间
    private Date createTime;
    // 信件状态
    private Integer state;

    // 信件权限
    private Integer jurisdiction;

    @Override
    public String toString() {
        return "Letter{" +
                "letterId=" + letterId +
                ", content='" + content + '\'' +
                ", email='" + email + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", createTime=" + createTime +
                ", state=" + state +
                ", jurisdiction=" + jurisdiction +
                '}';
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Letter() {

    }
    public Letter(String content, String email, Date deliveryTime, Date createTime, int state, int jurisdiction) {
        this.content = content;
        this.email = email;
        this.deliveryTime = deliveryTime;
        this.createTime = createTime;
        this.state = state;
        this.jurisdiction = jurisdiction;
    }

    public long getLetterId() {
        return letterId;
    }

    public void setLetterId(long letterId) {
        this.letterId = letterId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
