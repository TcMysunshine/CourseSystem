package com.nju.Model;

import com.nju.entity.TbTeacher;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;
@Data
public class TeacherModel {
    private Integer teacherId;
    private String teacherCount;
    private String teacherProfessionalTitle;
    private String teacherDegree;
    private String teacherName;
    private String teacherAddress;
    private Integer teacherSex;
    private Integer teacherAge;
    private String teacherPhone;
    private String teacherEmail;
    private String teacherNationality;
    private Date teacherCreatetime;
    private Date teacherLastedittime;
    private String teacherStatus;
    private String teacherBlog;
    private String teacherSifnature;
    private String teacherIntroduce;
    private String teacherPersonhomepage;
    private String teacherDepartment;
    private String teacherOffice;
    private Integer teacherImg;
    public static TeacherModel convert(TbTeacher tbTeacher){
        TeacherModel teacherModel=new TeacherModel();
        if(tbTeacher==null) {
            return null;
        }
        BeanUtils.copyProperties(tbTeacher,teacherModel);
        return teacherModel;
    }
}
