package com.nju.entity;

import java.util.Date;

public class TbStudent {
    private Integer studentId;

    private Integer studentType;

    private String studentCount;

    private String studentPassword;

    private String studentName;

    private String studentAddress;

    private Integer studentSex;

    private Integer studentAge;

    private String studentPhone;

    private String studentEmail;

    private String studentNationality;

    private Date studentCreatetime;

    private Date studentLastedittime;

    private String studentSifnature;

    private String studentIntroduce;

    private String studentStatus;

    private String studentBlog;

    private Integer studentImg;

    private Integer studentDepartment;

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

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
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

    public String getStudentSifnature() {
        return studentSifnature;
    }

    public void setStudentSifnature(String studentSifnature) {
        this.studentSifnature = studentSifnature == null ? null : studentSifnature.trim();
    }

    public String getStudentIntroduce() {
        return studentIntroduce;
    }

    public void setStudentIntroduce(String studentIntroduce) {
        this.studentIntroduce = studentIntroduce == null ? null : studentIntroduce.trim();
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus == null ? null : studentStatus.trim();
    }

    public String getStudentBlog() {
        return studentBlog;
    }

    public void setStudentBlog(String studentBlog) {
        this.studentBlog = studentBlog == null ? null : studentBlog.trim();
    }

    public Integer getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(Integer studentImg) {
        this.studentImg = studentImg;
    }

    public Integer getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Integer studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
}