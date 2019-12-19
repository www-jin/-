package com.galaxy.springboot.entity;

public class Right {
    private Integer rightCode;

    private String rightText;

    private String rightFlag;

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText == null ? null : rightText.trim();
    }

    public String getRightFlag() {
        return rightFlag;
    }

    public void setRightFlag(String rightFlag) {
        this.rightFlag = rightFlag == null ? null : rightFlag.trim();
    }
}