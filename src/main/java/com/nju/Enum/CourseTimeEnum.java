package com.nju.Enum;

public enum CourseTimeEnum {
    Mon_One("周一1、2节","MonOne"),
    Mon_Three("周一3、4节","MonThree"),
    Mon_Five("周一5,6、2节","MonFive"),
    Mon_Seven("周一7、8节","MonSeven"),
    Mon_Nine("周一9、10节","MonNine"),
    Tues_One("周二1、2节","TuesOne"),
    Tues_Three("周二3、4节","TuesThree"),
    Tues_Five("周二5,6、2节","TuesFive"),
    Tues_Seven("周二7、8节","TuesSeven"),
    Tues_Nine("周二9、10节","TuesNine"),
    Wed_One("周三1、2节","WedOne"),
    Wed_Three("周三3、4节","WedThree"),
    Wed_Five("周三5,6、2节","WedFive"),
    Wed_Seven("周三7、8节","WedSeven"),
    Wed_Nine("周三9、10节","WedNine"),
    Thurs_One("周四1、2节","ThursOne"),
    Thurs_Three("周四3、4节","ThursThree"),
    Thurs_Five("周四5,6、2节","ThursFive"),
    Thurs_Seven("周四7、8节","ThursSeven"),
    Thurs_Nine("周四9、10节","ThursNine"),
    Fri_One("周五1、2节","FriOne"),
    Fri_Three("周五3、4节","FriThree"),
    Fri_Five("周五5,6、2节","FriFive"),
    Fri_Seven("周五7、8节","FriSeven"),
    Fri_Nine("周五9、10节","FriNine"),
    Sat_One("周六1、2节","FriOne"),
    Sat_Three("周六3、4节","FriThree"),
    Sat_Five("周六5,6、2节","FriFive"),
    Sat_Seven("周六7、8节","FriSeven"),
    Sat_Nine("周六9、10节","FriNine"),
    Sun_One("周日1、2节","FriOne"),
    Sun_Three("周日3、4节","FriThree"),
    Sun_Five("周日5,6、2节","FriFive"),
    Sun_Seven("周日7、8节","FriSeven"),
    Sun_Nine("周日9、10节","FriNine");
    private String courseTime;
    private String timeType;

    public String getCourseTime(){return courseTime;}
    public String getTimeType(){return timeType;}
    CourseTimeEnum(String courseTime,String timeType){
        this.courseTime=courseTime;
        this.timeType=timeType;
    }

    public static String getTimeTypeByCourseTime(String courseTime){
        for (CourseTimeEnum time:CourseTimeEnum.values()){
            if(courseTime.equals(time.courseTime)){
                return time.timeType;
            }
        }
        return null;
    }
}
