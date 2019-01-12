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

    private Integer courseClassroom;

    private String courseInfomation;

    private String courseQuailty;

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

    public Integer getCourseClassroom() {
        return courseClassroom;
    }

    public void setCourseClassroom(Integer courseClassroom) {
        this.courseClassroom = courseClassroom;
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
}