package com.nju.entity;

public class TbWeek {
    private Integer weekId;

    private String weekDay;

    private String weekOrder;

    private String weekTime;

    private String weekSeason;

    public Integer getWeekId() {
        return weekId;
    }

    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay == null ? null : weekDay.trim();
    }

    public String getWeekOrder() {
        return weekOrder;
    }

    public void setWeekOrder(String weekOrder) {
        this.weekOrder = weekOrder == null ? null : weekOrder.trim();
    }

    public String getWeekTime() {
        return weekTime;
    }

    public void setWeekTime(String weekTime) {
        this.weekTime = weekTime == null ? null : weekTime.trim();
    }

    public String getWeekSeason() {
        return weekSeason;
    }

    public void setWeekSeason(String weekSeason) {
        this.weekSeason = weekSeason == null ? null : weekSeason.trim();
    }
}