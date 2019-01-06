package com.nju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingIsNull() {
            addCriterion("course_encoding is null");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingIsNotNull() {
            addCriterion("course_encoding is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingEqualTo(String value) {
            addCriterion("course_encoding =", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingNotEqualTo(String value) {
            addCriterion("course_encoding <>", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingGreaterThan(String value) {
            addCriterion("course_encoding >", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingGreaterThanOrEqualTo(String value) {
            addCriterion("course_encoding >=", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingLessThan(String value) {
            addCriterion("course_encoding <", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingLessThanOrEqualTo(String value) {
            addCriterion("course_encoding <=", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingLike(String value) {
            addCriterion("course_encoding like", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingNotLike(String value) {
            addCriterion("course_encoding not like", value, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingIn(List<String> values) {
            addCriterion("course_encoding in", values, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingNotIn(List<String> values) {
            addCriterion("course_encoding not in", values, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingBetween(String value1, String value2) {
            addCriterion("course_encoding between", value1, value2, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseEncodingNotBetween(String value1, String value2) {
            addCriterion("course_encoding not between", value1, value2, "courseEncoding");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseIsNull() {
            addCriterion("course_isuse is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseIsNotNull() {
            addCriterion("course_isuse is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseEqualTo(Integer value) {
            addCriterion("course_isuse =", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseNotEqualTo(Integer value) {
            addCriterion("course_isuse <>", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseGreaterThan(Integer value) {
            addCriterion("course_isuse >", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_isuse >=", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseLessThan(Integer value) {
            addCriterion("course_isuse <", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseLessThanOrEqualTo(Integer value) {
            addCriterion("course_isuse <=", value, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseIn(List<Integer> values) {
            addCriterion("course_isuse in", values, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseNotIn(List<Integer> values) {
            addCriterion("course_isuse not in", values, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseBetween(Integer value1, Integer value2) {
            addCriterion("course_isuse between", value1, value2, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseIsuseNotBetween(Integer value1, Integer value2) {
            addCriterion("course_isuse not between", value1, value2, "courseIsuse");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIsNull() {
            addCriterion("course_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIsNotNull() {
            addCriterion("course_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeEqualTo(Date value) {
            addCriterion("course_createTime =", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotEqualTo(Date value) {
            addCriterion("course_createTime <>", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeGreaterThan(Date value) {
            addCriterion("course_createTime >", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_createTime >=", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeLessThan(Date value) {
            addCriterion("course_createTime <", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("course_createTime <=", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIn(List<Date> values) {
            addCriterion("course_createTime in", values, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotIn(List<Date> values) {
            addCriterion("course_createTime not in", values, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeBetween(Date value1, Date value2) {
            addCriterion("course_createTime between", value1, value2, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("course_createTime not between", value1, value2, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeIsNull() {
            addCriterion("course_lasteditTime is null");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeIsNotNull() {
            addCriterion("course_lasteditTime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeEqualTo(Date value) {
            addCriterion("course_lasteditTime =", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeNotEqualTo(Date value) {
            addCriterion("course_lasteditTime <>", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeGreaterThan(Date value) {
            addCriterion("course_lasteditTime >", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_lasteditTime >=", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeLessThan(Date value) {
            addCriterion("course_lasteditTime <", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeLessThanOrEqualTo(Date value) {
            addCriterion("course_lasteditTime <=", value, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeIn(List<Date> values) {
            addCriterion("course_lasteditTime in", values, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeNotIn(List<Date> values) {
            addCriterion("course_lasteditTime not in", values, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeBetween(Date value1, Date value2) {
            addCriterion("course_lasteditTime between", value1, value2, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseLastedittimeNotBetween(Date value1, Date value2) {
            addCriterion("course_lasteditTime not between", value1, value2, "courseLastedittime");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNull() {
            addCriterion("course_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNotNull() {
            addCriterion("course_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditEqualTo(Integer value) {
            addCriterion("course_credit =", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotEqualTo(Integer value) {
            addCriterion("course_credit <>", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThan(Integer value) {
            addCriterion("course_credit >", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_credit >=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThan(Integer value) {
            addCriterion("course_credit <", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThanOrEqualTo(Integer value) {
            addCriterion("course_credit <=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIn(List<Integer> values) {
            addCriterion("course_credit in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotIn(List<Integer> values) {
            addCriterion("course_credit not in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditBetween(Integer value1, Integer value2) {
            addCriterion("course_credit between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("course_credit not between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIsNull() {
            addCriterion("course_classroom is null");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIsNotNull() {
            addCriterion("course_classroom is not null");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomEqualTo(Integer value) {
            addCriterion("course_classroom =", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotEqualTo(Integer value) {
            addCriterion("course_classroom <>", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomGreaterThan(Integer value) {
            addCriterion("course_classroom >", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_classroom >=", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomLessThan(Integer value) {
            addCriterion("course_classroom <", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomLessThanOrEqualTo(Integer value) {
            addCriterion("course_classroom <=", value, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomIn(List<Integer> values) {
            addCriterion("course_classroom in", values, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotIn(List<Integer> values) {
            addCriterion("course_classroom not in", values, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomBetween(Integer value1, Integer value2) {
            addCriterion("course_classroom between", value1, value2, "courseClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseClassroomNotBetween(Integer value1, Integer value2) {
            addCriterion("course_classroom not between", value1, value2, "courseClassroom");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}