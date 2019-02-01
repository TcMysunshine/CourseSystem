package com.nju.entity;

public class TbCourseConcrete {
    private Integer courseConcreteId;

    private Integer courseConcreteCreatetime;

    private Integer courseConcreteWeektime;

    private String courseConcreteInformation;

    private String courseConcreteRequest;

    private Integer courseConcreteCredit;

    private String courseConcreteClassroom;

    private String courseConcreteTime;

    public Integer getCourseConcreteId() {
        return courseConcreteId;
    }

    public void setCourseConcreteId(Integer courseConcreteId) {
        this.courseConcreteId = courseConcreteId;
    }

    public Integer getCourseConcreteCreatetime() {
        return courseConcreteCreatetime;
    }

    public void setCourseConcreteCreatetime(Integer courseConcreteCreatetime) {
        this.courseConcreteCreatetime = courseConcreteCreatetime;
    }

    public Integer getCourseConcreteWeektime() {
        return courseConcreteWeektime;
    }

    public void setCourseConcreteWeektime(Integer courseConcreteWeektime) {
        this.courseConcreteWeektime = courseConcreteWeektime;
    }

    public String getCourseConcreteInformation() {
        return courseConcreteInformation;
    }

    public void setCourseConcreteInformation(String courseConcreteInformation) {
        this.courseConcreteInformation = courseConcreteInformation == null ? null : courseConcreteInformation.trim();
    }

    public String getCourseConcreteRequest() {
        return courseConcreteRequest;
    }

    public void setCourseConcreteRequest(String courseConcreteRequest) {
        this.courseConcreteRequest = courseConcreteRequest == null ? null : courseConcreteRequest.trim();
    }

    public Integer getCourseConcreteCredit() {
        return courseConcreteCredit;
    }

    public void setCourseConcreteCredit(Integer courseConcreteCredit) {
        this.courseConcreteCredit = courseConcreteCredit;
    }

    public String getCourseConcreteClassroom() {
        return courseConcreteClassroom;
    }

    public void setCourseConcreteClassroom(String courseConcreteClassroom) {
        this.courseConcreteClassroom = courseConcreteClassroom == null ? null : courseConcreteClassroom.trim();
    }

    public String getCourseConcreteTime() {
        return courseConcreteTime;
    }

    public void setCourseConcreteTime(String courseConcreteTime) {
        this.courseConcreteTime = courseConcreteTime == null ? null : courseConcreteTime.trim();
    }
}