package com.nju.entity;

import java.util.ArrayList;
import java.util.List;

public class TbCourseConcreteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCourseConcreteExample() {
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

        public Criteria andCourseConcreteIdIsNull() {
            addCriterion("course_concrete_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdIsNotNull() {
            addCriterion("course_concrete_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdEqualTo(Integer value) {
            addCriterion("course_concrete_id =", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdNotEqualTo(Integer value) {
            addCriterion("course_concrete_id <>", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdGreaterThan(Integer value) {
            addCriterion("course_concrete_id >", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_id >=", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdLessThan(Integer value) {
            addCriterion("course_concrete_id <", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_id <=", value, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdIn(List<Integer> values) {
            addCriterion("course_concrete_id in", values, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdNotIn(List<Integer> values) {
            addCriterion("course_concrete_id not in", values, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_id between", value1, value2, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_id not between", value1, value2, "courseConcreteId");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeIsNull() {
            addCriterion("course_concrete_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeIsNotNull() {
            addCriterion("course_concrete_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeEqualTo(Integer value) {
            addCriterion("course_concrete_createtime =", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeNotEqualTo(Integer value) {
            addCriterion("course_concrete_createtime <>", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeGreaterThan(Integer value) {
            addCriterion("course_concrete_createtime >", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_createtime >=", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeLessThan(Integer value) {
            addCriterion("course_concrete_createtime <", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_createtime <=", value, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeIn(List<Integer> values) {
            addCriterion("course_concrete_createtime in", values, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeNotIn(List<Integer> values) {
            addCriterion("course_concrete_createtime not in", values, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_createtime between", value1, value2, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_createtime not between", value1, value2, "courseConcreteCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeIsNull() {
            addCriterion("course_concrete_weektime is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeIsNotNull() {
            addCriterion("course_concrete_weektime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeEqualTo(Integer value) {
            addCriterion("course_concrete_weektime =", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeNotEqualTo(Integer value) {
            addCriterion("course_concrete_weektime <>", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeGreaterThan(Integer value) {
            addCriterion("course_concrete_weektime >", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_weektime >=", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeLessThan(Integer value) {
            addCriterion("course_concrete_weektime <", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeLessThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_weektime <=", value, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeIn(List<Integer> values) {
            addCriterion("course_concrete_weektime in", values, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeNotIn(List<Integer> values) {
            addCriterion("course_concrete_weektime not in", values, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_weektime between", value1, value2, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteWeektimeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_weektime not between", value1, value2, "courseConcreteWeektime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationIsNull() {
            addCriterion("course_concrete_information is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationIsNotNull() {
            addCriterion("course_concrete_information is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationEqualTo(String value) {
            addCriterion("course_concrete_information =", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationNotEqualTo(String value) {
            addCriterion("course_concrete_information <>", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationGreaterThan(String value) {
            addCriterion("course_concrete_information >", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationGreaterThanOrEqualTo(String value) {
            addCriterion("course_concrete_information >=", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationLessThan(String value) {
            addCriterion("course_concrete_information <", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationLessThanOrEqualTo(String value) {
            addCriterion("course_concrete_information <=", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationLike(String value) {
            addCriterion("course_concrete_information like", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationNotLike(String value) {
            addCriterion("course_concrete_information not like", value, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationIn(List<String> values) {
            addCriterion("course_concrete_information in", values, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationNotIn(List<String> values) {
            addCriterion("course_concrete_information not in", values, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationBetween(String value1, String value2) {
            addCriterion("course_concrete_information between", value1, value2, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteInformationNotBetween(String value1, String value2) {
            addCriterion("course_concrete_information not between", value1, value2, "courseConcreteInformation");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestIsNull() {
            addCriterion("course_concrete_request is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestIsNotNull() {
            addCriterion("course_concrete_request is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestEqualTo(String value) {
            addCriterion("course_concrete_request =", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestNotEqualTo(String value) {
            addCriterion("course_concrete_request <>", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestGreaterThan(String value) {
            addCriterion("course_concrete_request >", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestGreaterThanOrEqualTo(String value) {
            addCriterion("course_concrete_request >=", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestLessThan(String value) {
            addCriterion("course_concrete_request <", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestLessThanOrEqualTo(String value) {
            addCriterion("course_concrete_request <=", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestLike(String value) {
            addCriterion("course_concrete_request like", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestNotLike(String value) {
            addCriterion("course_concrete_request not like", value, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestIn(List<String> values) {
            addCriterion("course_concrete_request in", values, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestNotIn(List<String> values) {
            addCriterion("course_concrete_request not in", values, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestBetween(String value1, String value2) {
            addCriterion("course_concrete_request between", value1, value2, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteRequestNotBetween(String value1, String value2) {
            addCriterion("course_concrete_request not between", value1, value2, "courseConcreteRequest");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditIsNull() {
            addCriterion("course_concrete_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditIsNotNull() {
            addCriterion("course_concrete_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditEqualTo(Integer value) {
            addCriterion("course_concrete_credit =", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditNotEqualTo(Integer value) {
            addCriterion("course_concrete_credit <>", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditGreaterThan(Integer value) {
            addCriterion("course_concrete_credit >", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_credit >=", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditLessThan(Integer value) {
            addCriterion("course_concrete_credit <", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditLessThanOrEqualTo(Integer value) {
            addCriterion("course_concrete_credit <=", value, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditIn(List<Integer> values) {
            addCriterion("course_concrete_credit in", values, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditNotIn(List<Integer> values) {
            addCriterion("course_concrete_credit not in", values, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_credit between", value1, value2, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("course_concrete_credit not between", value1, value2, "courseConcreteCredit");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomIsNull() {
            addCriterion("course_concrete_classroom is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomIsNotNull() {
            addCriterion("course_concrete_classroom is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomEqualTo(String value) {
            addCriterion("course_concrete_classroom =", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomNotEqualTo(String value) {
            addCriterion("course_concrete_classroom <>", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomGreaterThan(String value) {
            addCriterion("course_concrete_classroom >", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomGreaterThanOrEqualTo(String value) {
            addCriterion("course_concrete_classroom >=", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomLessThan(String value) {
            addCriterion("course_concrete_classroom <", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomLessThanOrEqualTo(String value) {
            addCriterion("course_concrete_classroom <=", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomLike(String value) {
            addCriterion("course_concrete_classroom like", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomNotLike(String value) {
            addCriterion("course_concrete_classroom not like", value, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomIn(List<String> values) {
            addCriterion("course_concrete_classroom in", values, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomNotIn(List<String> values) {
            addCriterion("course_concrete_classroom not in", values, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomBetween(String value1, String value2) {
            addCriterion("course_concrete_classroom between", value1, value2, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteClassroomNotBetween(String value1, String value2) {
            addCriterion("course_concrete_classroom not between", value1, value2, "courseConcreteClassroom");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeIsNull() {
            addCriterion("course_concrete_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeIsNotNull() {
            addCriterion("course_concrete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeEqualTo(String value) {
            addCriterion("course_concrete_time =", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeNotEqualTo(String value) {
            addCriterion("course_concrete_time <>", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeGreaterThan(String value) {
            addCriterion("course_concrete_time >", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("course_concrete_time >=", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeLessThan(String value) {
            addCriterion("course_concrete_time <", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeLessThanOrEqualTo(String value) {
            addCriterion("course_concrete_time <=", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeLike(String value) {
            addCriterion("course_concrete_time like", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeNotLike(String value) {
            addCriterion("course_concrete_time not like", value, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeIn(List<String> values) {
            addCriterion("course_concrete_time in", values, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeNotIn(List<String> values) {
            addCriterion("course_concrete_time not in", values, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeBetween(String value1, String value2) {
            addCriterion("course_concrete_time between", value1, value2, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andCourseConcreteTimeNotBetween(String value1, String value2) {
            addCriterion("course_concrete_time not between", value1, value2, "courseConcreteTime");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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