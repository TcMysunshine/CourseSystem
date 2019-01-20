package com.nju.entity;

public class TbSemester {
    private Integer semesterId;

    private String semesterName;

    private Integer semesterIsCurrent;

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName == null ? null : semesterName.trim();
    }

    public Integer getSemesterIsCurrent() {
        return semesterIsCurrent;
    }

    public void setSemesterIsCurrent(Integer semesterIsCurrent) {
        this.semesterIsCurrent = semesterIsCurrent;
    }
}