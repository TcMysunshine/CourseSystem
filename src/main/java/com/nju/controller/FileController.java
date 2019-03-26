package com.nju.controller;

import com.nju.Util.DateUtil;
import com.nju.Util.Image2Base64;
import com.nju.entity.TbImg;
import com.nju.entity.TbStudent;
import com.nju.entity.TbTeacher;
import com.nju.service.FileService;
import com.nju.service.StudentService;
import com.nju.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * created by Sammi_wang
 * function : used for files upload
 */
@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherServiceImpl teacherService;

    @ResponseBody
    @RequestMapping(value = "/ImageUpload",method = RequestMethod.POST)
    public String ImageUpload(@RequestParam("file")MultipartFile file,
                              @RequestParam Integer lx,
                              HttpSession session){
        if(file.isEmpty()){
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        Date date = new Date();
        String dataForm =DateUtil.format(date,DateUtil.shortFormat);
//        String filePath = "D:/上传文件/Files/"+dataForm+"/";
        String filePath="image/"+dataForm+"/";
        String destName = filePath + System.currentTimeMillis()
                +fileName.substring(fileName.lastIndexOf("."),fileName.length());
        File f = new File(filePath);
        //如果文件夹不存在则创建
        if(!f.exists()){
            f.mkdirs();
        }
        File dest = new File(destName);
        try {
            file.transferTo(dest);
            //先往TBImg里面插入一条记录
            TbImg img = new TbImg();
            img.setImgDesc(destName);
            img.setCreateTime(date);
            fileService.insertImage(img);
            //依据不同的人员类别往对应的表里面进行信息关联
            if (lx==0){
                //学生
                TbStudent student = (TbStudent)session.getAttribute("user");
                student.setStudentImg(img.getImgId());
                studentService.editStudentInfo(student);
            }else if (lx==1){
                //老师
                TbTeacher teacher = (TbTeacher)session.getAttribute("user");
                teacher.setTeacherImg(img.getImgId());
                teacherService.editTeacherInfo(teacher);
            }
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "文件流写入失败";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getAvatar",method = RequestMethod.POST)
    public String getAvatar(@RequestParam Integer lx,HttpSession session){
        TbImg img ;
        if(lx==0){
            TbStudent student = (TbStudent)session.getAttribute("user");
            img = fileService.selectByPrimaryKey(student.getStudentImg());
        }else {
            TbTeacher teacher = (TbTeacher)session.getAttribute("user");
            img = fileService.selectByPrimaryKey(teacher.getTeacherImg());
        }
        String str = Image2Base64.getImageStr(img.getImgDesc());
        return str;
    }
}
