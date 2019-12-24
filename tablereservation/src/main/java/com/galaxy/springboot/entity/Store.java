package com.galaxy.springboot.entity;

public class Store {
    private Integer storeId;

    private String storeName;

    private String storeAddress;

    private String storeImgurl;

    private String score;

    private String salemonth;

    private String mindelprice;

    private String delprice;

    private String averageprice;

    private String deltime;

    private String publicmsg;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStoreImgurl() {
        return storeImgurl;
    }

    public void setStoreImgurl(String storeImgurl) {
        this.storeImgurl = storeImgurl == null ? null : storeImgurl.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getSalemonth() {
        return salemonth;
    }

    public void setSalemonth(String salemonth) {
        this.salemonth = salemonth == null ? null : salemonth.trim();
    }

    public String getMindelprice() {
        return mindelprice;
    }

    public void setMindelprice(String mindelprice) {
        this.mindelprice = mindelprice == null ? null : mindelprice.trim();
    }

    public String getDelprice() {
        return delprice;
    }

    public void setDelprice(String delprice) {
        this.delprice = delprice == null ? null : delprice.trim();
    }

    public String getAverageprice() {
        return averageprice;
    }

    public void setAverageprice(String averageprice) {
        this.averageprice = averageprice == null ? null : averageprice.trim();
    }

    public String getDeltime() {
        return deltime;
    }

    public void setDeltime(String deltime) {
        this.deltime = deltime == null ? null : deltime.trim();
    }

    public String getPublicmsg() {
        return publicmsg;
    }

    public void setPublicmsg(String publicmsg) {
        this.publicmsg = publicmsg == null ? null : publicmsg.trim();
    }
}