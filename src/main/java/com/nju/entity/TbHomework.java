package com.nju.entity;

import java.util.Date;

public class TbHomework {
    private Integer homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private Date homeworkStarttime;

    private Date homeworkEndtime;

    private String homeworkSubmitState;

    private String homeworkGradeState;

    private Date homeworkLastEditTime;

    private String homeworkRemark;

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getHomeworkTitle() {
        return homeworkTitle;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homeworkTitle = homeworkTitle == null ? null : homeworkTitle.trim();
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent == null ? null : homeworkContent.trim();
    }

    public Date getHomeworkStarttime() {
        return homeworkStarttime;
    }

    public void setHomeworkStarttime(Date homeworkStarttime) {
        this.homeworkStarttime = homeworkStarttime;
    }

    public Date getHomeworkEndtime() {
        return homeworkEndtime;
    }

    public void setHomeworkEndtime(Date homeworkEndtime) {
        this.homeworkEndtime = homeworkEndtime;
    }

    public String getHomeworkSubmitState() {
        return homeworkSubmitState;
    }

    public void setHomeworkSubmitState(String homeworkSubmitState) {
        this.homeworkSubmitState = homeworkSubmitState == null ? null : homeworkSubmitState.trim();
    }

    public String getHomeworkGradeState() {
        return homeworkGradeState;
    }

    public void setHomeworkGradeState(String homeworkGradeState) {
        this.homeworkGradeState = homeworkGradeState == null ? null : homeworkGradeState.trim();
    }

    public Date getHomeworkLastEditTime() {
        return homeworkLastEditTime;
    }

    public void setHomeworkLastEditTime(Date homeworkLastEditTime) {
        this.homeworkLastEditTime = homeworkLastEditTime;
    }

    public String getHomeworkRemark() {
        return homeworkRemark;
    }

    public void setHomeworkRemark(String homeworkRemark) {
        this.homeworkRemark = homeworkRemark == null ? null : homeworkRemark.trim();
    }
}