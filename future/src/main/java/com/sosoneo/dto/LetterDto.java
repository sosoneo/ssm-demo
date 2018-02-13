package com.sosoneo.dto;

import com.sosoneo.entity.Letter;
import com.sosoneo.enums.LetterJurisdictionEnum;
import com.sosoneo.enums.LetterStateEnum;

/**
 * Created by sosoneo on 2018/2/12.
 */
public class LetterDto {
    // 信件id
    private long letterId;
    // 信件状态
    private int state;
    // 信件状态描述
    private String stateInfo;
    // 信件权限
    private int jurisdiction;
    // 信件权限描述
    private  String jurisdictionInfo;
    // 信件实体
    private Letter letter;

    // 插入成功构造器
    public LetterDto(long letterId, LetterStateEnum stateEnum, LetterJurisdictionEnum jurisdictionEnum, Letter letter) {
        this.letterId = letterId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.jurisdiction = jurisdictionEnum.getState();
        this.jurisdictionInfo = jurisdictionEnum.getStateInfo();
        this.letter = letter;
    }

    public long getLetterId() {
        return letterId;
    }

    public void setLetterId(long letterId) {
        this.letterId = letterId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(int jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdictionInfo() {
        return jurisdictionInfo;
    }

    public void setJurisdictionInfo(String jurisdictionInfo) {
        this.jurisdictionInfo = jurisdictionInfo;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "LetterDto{" +
                "letterId=" + letterId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", jurisdiction=" + jurisdiction +
                ", jurisdictionInfo='" + jurisdictionInfo + '\'' +
                ", letter=" + letter +
                '}';
    }
}
