package com.nju.entity;

public class TbTeacherCourse {
    private Integer tcid;

    private Integer teacherId;

    private Integer courseId;

    private Integer courseConcreteId;

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseConcreteId() {
        return courseConcreteId;
    }

    public void setCourseConcreteId(Integer courseConcreteId) {
        this.courseConcreteId = courseConcreteId;
    }
}