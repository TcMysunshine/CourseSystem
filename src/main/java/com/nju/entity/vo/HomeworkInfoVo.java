package com.nju.entity.vo;



public class HomeworkInfoVo {
	
	private String homeworkTitle;
	private String homeworkContent;
	private String homeworkStartTime;
	private String homeworkEndTime;
	private String homeworkRemark;
	private Integer courseId;
	public String getHomeworkTitle() {
		return homeworkTitle;
	}
	
	public void setHomeworkTitle(String homeworkTitle) {
		this.homeworkTitle = homeworkTitle;
	}
	
	public String getHomeworkContent() {
		return homeworkContent;
	}
	
	public void setHomeworkContent(String homeworkContent) {
		this.homeworkContent = homeworkContent;
	}
	
	public String getHomeworkRemark() {
		return homeworkRemark;
	}
	
	public void setHomeworkRemark(String homeworkRemark) {
		this.homeworkRemark = homeworkRemark;
	}
	
	public String getHomeworkStartTime() {
		return homeworkStartTime;
	}
	
	public void setHomeworkStartTime(String homeworkStartTime) {
		this.homeworkStartTime = homeworkStartTime;
	}
	
	public String getHomeworkEndTime() {
		return homeworkEndTime;
	}
	
	public void setHomeworkEndTime(String homeworkEndTime) {
		this.homeworkEndTime = homeworkEndTime;
	}
	public Integer getCourseId() {
		return courseId;
	}
	
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
}
