package com.nju.entity;

import java.util.Date;

public class TbStudent {
    private Integer studentId;

    private Integer studentType;

    private String studentCount;

    private String studentPassword;

    private String studentName;

    private Integer studentAddress;

    private Integer studentSex;

    private Integer studentAge;

    private String studentPhone;

    private String studentEmail;

    private String studentNationality;

    private Date studentCreatetime;

    private Date studentLastedittime;

    private Integer courseId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentType() {
        return studentType;
    }

    public void setStudentType(Integer studentType) {
        this.studentType = studentType;
    }

    public String getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(String studentCount) {
        this.studentCount = studentCount == null ? null : studentCount.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Integer studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality == null ? null : studentNationality.trim();
    }

    public Date getStudentCreatetime() {
        return studentCreatetime;
    }

    public void setStudentCreatetime(Date studentCreatetime) {
        this.studentCreatetime = studentCreatetime;
    }

    public Date getStudentLastedittime() {
        return studentLastedittime;
    }

    public void setStudentLastedittime(Date studentLastedittime) {
        this.studentLastedittime = studentLastedittime;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}