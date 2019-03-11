package com.nju.entity;

public class TbStudentCourseConcrete {
    private Integer scId;

    private Integer studentId;

    private Integer courseConcreteId;

    private Integer sorce;

    private Integer createYear;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseConcreteId() {
        return courseConcreteId;
    }

    public void setCourseConcreteId(Integer courseConcreteId) {
        this.courseConcreteId = courseConcreteId;
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