package com.nju.entity;

public class TbDepartment {
    private Integer departmentId;

    private String departmentName;

    private String departmentPerfession;

    private String departmentGrade;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentPerfession() {
        return departmentPerfession;
    }

    public void setDepartmentPerfession(String departmentPerfession) {
        this.departmentPerfession = departmentPerfession == null ? null : departmentPerfession.trim();
    }

    public String getDepartmentGrade() {
        return departmentGrade;
    }

    public void setDepartmentGrade(String departmentGrade) {
        this.departmentGrade = departmentGrade == null ? null : departmentGrade.trim();
    }
}