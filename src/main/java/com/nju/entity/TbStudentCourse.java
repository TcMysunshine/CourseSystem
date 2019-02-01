package com.nju.entity;

public class TbStudentCourse {
    private Integer scid;

    private Integer studentId;

    private Integer courseId;

    private Integer sorce;

    private Integer createYear;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getSorce() {
        return sorce;
    }

    public void setSorce(Integer sorce) {
        this.sorce = sorce;
    }

    public Integer getCreateYear() {
        return createYear;
    }

    public void setCreateYear(Integer createYear) {
        this.createYear = createYear;
    }
}