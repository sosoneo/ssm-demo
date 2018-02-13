package com.sosoneo.enums;

/**
 * Created by sosoneo on 2018/2/12.
 */
public enum LetterStateEnum {
    SUCCESS(1, "送达成功"), WAIT_SEND(0, "等待发送");

    private int state;
    private String stateInfo;
    private LetterStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static LetterStateEnum stateOf (int index) {
        for (LetterStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
