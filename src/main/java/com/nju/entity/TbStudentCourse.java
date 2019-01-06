package com.nju.entity;

public class TbStudentCourse {
    private Integer scid;

    private Integer studentId;

    private Integer courseId;

    private Integer sorce;

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
}