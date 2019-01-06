package com.nju.entity;

import java.util.Date;

public class TbTeacher {
    private Integer teacherId;

    private String teacherAccount;

    private String teacherPassword;

    private String teacherProfessionalTitle;

    private String teacherDegree;

    private String teacherName;

    private Integer teacherAddress;

    private Integer teacherSex;

    private Integer teacherAge;

    private String teacherPhone;

    private String teacherEmail;

    private String teacherNationality;

    private Date teacherCreatetime;

    private Date teacherLastedittime;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount == null ? null : teacherAccount.trim();
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public String getTeacherProfessionalTitle() {
        return teacherProfessionalTitle;
    }

    public void setTeacherProfessionalTitle(String teacherProfessionalTitle) {
        this.teacherProfessionalTitle = teacherProfessionalTitle == null ? null : teacherProfessionalTitle.trim();
    }

    public String getTeacherDegree() {
        return teacherDegree;
    }

    public void setTeacherDegree(String teacherDegree) {
        this.teacherDegree = teacherDegree == null ? null : teacherDegree.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(Integer teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public Integer getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Integer teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherNationality() {
        return teacherNationality;
    }

    public void setTeacherNationality(String teacherNationality) {
        this.teacherNationality = teacherNationality == null ? null : teacherNationality.trim();
    }

    public Date getTeacherCreatetime() {
        return teacherCreatetime;
    }

    public void setTeacherCreatetime(Date teacherCreatetime) {
        this.teacherCreatetime = teacherCreatetime;
    }

    public Date getTeacherLastedittime() {
        return teacherLastedittime;
    }

    public void setTeacherLastedittime(Date teacherLastedittime) {
        this.teacherLastedittime = teacherLastedittime;
    }
}