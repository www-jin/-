package com.galaxy.springboot.entity;

public class Dishes {
    private Integer dishesId;

    private String dishesName;

    private String dishesIntroduce;

    private String dishesEvaluation;

    private Integer dishesCode;

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
    }

    public String getDishesIntroduce() {
        return dishesIntroduce;
    }

    public void setDishesIntroduce(String dishesIntroduce) {
        this.dishesIntroduce = dishesIntroduce == null ? null : dishesIntroduce.trim();
    }

    public String getDishesEvaluation() {
        return dishesEvaluation;
    }

    public void setDishesEvaluation(String dishesEvaluation) {
        this.dishesEvaluation = dishesEvaluation == null ? null : dishesEvaluation.trim();
    }

    public Integer getDishesCode() {
        return dishesCode;
    }

    public void setDishesCode(Integer dishesCode) {
        this.dishesCode = dishesCode;
    }
}