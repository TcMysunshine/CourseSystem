package com.nju.entity;

import java.util.Date;

public class TbCourse {
    private Integer courseId;

    private String courseEncoding;

    private String courseName;

    private Integer courseIsuse;

    private Date courseCreatetime;

    private Date courseLastedittime;

    private Integer courseCredit;

    private String courseClassroom;

    private String courseInfomation;

    private String courseQuailty;

    private String courseModule;

    private String courseClassify;

    private Integer courseWeektime;

    private String courseSession;

    private String courseType;

    private String courseTime;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseEncoding() {
        return courseEncoding;
    }

    public void setCourseEncoding(String courseEncoding) {
        this.courseEncoding = courseEncoding == null ? null : courseEncoding.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseIsuse() {
        return courseIsuse;
    }

    public void setCourseIsuse(Integer courseIsuse) {
        this.courseIsuse = courseIsuse;
    }

    public Date getCourseCreatetime() {
        return courseCreatetime;
    }

    public void setCourseCreatetime(Date courseCreatetime) {
        this.courseCreatetime = courseCreatetime;
    }

    public Date getCourseLastedittime() {
        return courseLastedittime;
    }

    public void setCourseLastedittime(Date courseLastedittime) {
        this.courseLastedittime = courseLastedittime;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseClassroom() {
        return courseClassroom;
    }

    public void setCourseClassroom(String courseClassroom) {
        this.courseClassroom = courseClassroom == null ? null : courseClassroom.trim();
    }

    public String getCourseInfomation() {
        return courseInfomation;
    }

    public void setCourseInfomation(String courseInfomation) {
        this.courseInfomation = courseInfomation == null ? null : courseInfomation.trim();
    }

    public String getCourseQuailty() {
        return courseQuailty;
    }

    public void setCourseQuailty(String courseQuailty) {
        this.courseQuailty = courseQuailty == null ? null : courseQuailty.trim();
    }

    public String getCourseModule() {
        return courseModule;
    }

    public void setCourseModule(String courseModule) {
        this.courseModule = courseModule == null ? null : courseModule.trim();
    }

    public String getCourseClassify() {
        return courseClassify;
    }

    public void setCourseClassify(String courseClassify) {
        this.courseClassify = courseClassify == null ? null : courseClassify.trim();
    }

    public Integer getCourseWeektime() {
        return courseWeektime;
    }

    public void setCourseWeektime(Integer courseWeektime) {
        this.courseWeektime = courseWeektime;
    }

    public String getCourseSession() {
        return courseSession;
    }

    public void setCourseSession(String courseSession) {
        this.courseSession = courseSession == null ? null : courseSession.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }
}