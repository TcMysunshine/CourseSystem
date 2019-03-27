package com.nju.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nju.dao.mapper.TbHomeworkMapper;
import com.nju.dao.mapper.TbTccHomeworkMapper;
import com.nju.entity.TbCourseConcrete;
import com.nju.entity.TbHomework;
import com.nju.entity.TbTccHomework;
import com.nju.entity.vo.HomeworkInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeworkController {
	@Autowired
	TbHomeworkMapper homeworkMapper;
	@Autowired
	TbTccHomeworkMapper tccHomeworkMapper;
	
	@RequestMapping("/HomeworkInsertInfo")
	public TbTccHomework HomeworkInsertInfo(HttpServletRequest request, HttpServletResponse response)throws Exception{
		ObjectMapper mapper=new ObjectMapper();
		HomeworkInfoVo homeworkInfoVo=mapper.readValue(request.getInputStream(), HomeworkInfoVo.class);
		int id=homeworkMapper.getMaxid()+1;
		TbHomework tbHomework=new TbHomework();
		tbHomework.setHomeworkId(id);
		tbHomework.setHomeworkTitle(homeworkInfoVo.getHomeworkTitle());
		tbHomework.setHomeworkContent(homeworkInfoVo.getHomeworkContent());
		tbHomework.setHomeworkRemark(homeworkInfoVo.getHomeworkTitle());
		SimpleDateFormat sf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = sf.parse(homeworkInfoVo.getHomeworkStartTime());
		tbHomework.setHomeworkStarttime(d1);
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sf1.parse(homeworkInfoVo.getHomeworkEndTime());
		tbHomework.setHomeworkEndtime(d2);
		homeworkMapper.insert(tbHomework);
		if(id==homeworkMapper.getMaxid()){
			int tccId=tccHomeworkMapper.getMaxid()+1;
			TbTccHomework tbTccHomework=new TbTccHomework();
			tbTccHomework.setTcchId(tccId);
			tbTccHomework.setCourseConcreteId(homeworkInfoVo.getCourseId());
			tbTccHomework.setHomeworkId(id);
			tccHomeworkMapper.insert(tbTccHomework);
			if(tccId==tccHomeworkMapper.getMaxid()){
				return tbTccHomework;
			}
			else{
				homeworkMapper.deleteByPrimaryKey(id);
				return null;
			}
		}else{
			return null;
		}
	}
}
