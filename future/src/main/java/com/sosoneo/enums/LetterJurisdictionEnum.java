package com.sosoneo.enums;

/**
 * Created by sosoneo on 2018/2/12.
 */
public enum LetterJurisdictionEnum {
    PUBLIC(1, "公开"), PRIVATE(0, "私密");

    private int jurisdiction;
    private String jurisdictionInfo;
    private LetterJurisdictionEnum(int state, String stateInfo) {
        this.jurisdiction = state;
        this.jurisdictionInfo = stateInfo;
    }

    public int getState() {
        return jurisdiction;
    }

    public String getStateInfo() {
        return jurisdictionInfo;
    }

    public static LetterJurisdictionEnum stateOf (int index) {
        for (LetterJurisdictionEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
