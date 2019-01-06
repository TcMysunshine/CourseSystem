package com.nju.entity;

import java.util.Date;

public class TbTeacherCourse {
    private Integer tcid;

    private Integer teacherId;

    private Integer courseId;

    private Date createYear;

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

    public Date getCreateYear() {
        return createYear;
    }

    public void setCreateYear(Date createYear) {
        this.createYear = createYear;
    }
}