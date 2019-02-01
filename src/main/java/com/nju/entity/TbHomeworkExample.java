package com.nju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbHomeworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHomeworkExample() {
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

        public Criteria andHomeworkIdIsNull() {
            addCriterion("homework_id is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIsNotNull() {
            addCriterion("homework_id is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdEqualTo(Integer value) {
            addCriterion("homework_id =", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotEqualTo(Integer value) {
            addCriterion("homework_id <>", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThan(Integer value) {
            addCriterion("homework_id >", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("homework_id >=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThan(Integer value) {
            addCriterion("homework_id <", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThanOrEqualTo(Integer value) {
            addCriterion("homework_id <=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIn(List<Integer> values) {
            addCriterion("homework_id in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotIn(List<Integer> values) {
            addCriterion("homework_id not in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdBetween(Integer value1, Integer value2) {
            addCriterion("homework_id between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("homework_id not between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleIsNull() {
            addCriterion("homework_title is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleIsNotNull() {
            addCriterion("homework_title is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleEqualTo(String value) {
            addCriterion("homework_title =", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleNotEqualTo(String value) {
            addCriterion("homework_title <>", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleGreaterThan(String value) {
            addCriterion("homework_title >", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("homework_title >=", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleLessThan(String value) {
            addCriterion("homework_title <", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleLessThanOrEqualTo(String value) {
            addCriterion("homework_title <=", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleLike(String value) {
            addCriterion("homework_title like", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleNotLike(String value) {
            addCriterion("homework_title not like", value, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleIn(List<String> values) {
            addCriterion("homework_title in", values, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleNotIn(List<String> values) {
            addCriterion("homework_title not in", values, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleBetween(String value1, String value2) {
            addCriterion("homework_title between", value1, value2, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkTitleNotBetween(String value1, String value2) {
            addCriterion("homework_title not between", value1, value2, "homeworkTitle");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIsNull() {
            addCriterion("homework_content is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIsNotNull() {
            addCriterion("homework_content is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentEqualTo(String value) {
            addCriterion("homework_content =", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotEqualTo(String value) {
            addCriterion("homework_content <>", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentGreaterThan(String value) {
            addCriterion("homework_content >", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentGreaterThanOrEqualTo(String value) {
            addCriterion("homework_content >=", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLessThan(String value) {
            addCriterion("homework_content <", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLessThanOrEqualTo(String value) {
            addCriterion("homework_content <=", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentLike(String value) {
            addCriterion("homework_content like", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotLike(String value) {
            addCriterion("homework_content not like", value, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentIn(List<String> values) {
            addCriterion("homework_content in", values, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotIn(List<String> values) {
            addCriterion("homework_content not in", values, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentBetween(String value1, String value2) {
            addCriterion("homework_content between", value1, value2, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkContentNotBetween(String value1, String value2) {
            addCriterion("homework_content not between", value1, value2, "homeworkContent");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeIsNull() {
            addCriterion("homework_starttime is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeIsNotNull() {
            addCriterion("homework_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeEqualTo(Date value) {
            addCriterion("homework_starttime =", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeNotEqualTo(Date value) {
            addCriterion("homework_starttime <>", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeGreaterThan(Date value) {
            addCriterion("homework_starttime >", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("homework_starttime >=", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeLessThan(Date value) {
            addCriterion("homework_starttime <", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("homework_starttime <=", value, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeIn(List<Date> values) {
            addCriterion("homework_starttime in", values, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeNotIn(List<Date> values) {
            addCriterion("homework_starttime not in", values, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeBetween(Date value1, Date value2) {
            addCriterion("homework_starttime between", value1, value2, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("homework_starttime not between", value1, value2, "homeworkStarttime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeIsNull() {
            addCriterion("homework_endtime is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeIsNotNull() {
            addCriterion("homework_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeEqualTo(Date value) {
            addCriterion("homework_endtime =", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeNotEqualTo(Date value) {
            addCriterion("homework_endtime <>", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeGreaterThan(Date value) {
            addCriterion("homework_endtime >", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("homework_endtime >=", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeLessThan(Date value) {
            addCriterion("homework_endtime <", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("homework_endtime <=", value, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeIn(List<Date> values) {
            addCriterion("homework_endtime in", values, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeNotIn(List<Date> values) {
            addCriterion("homework_endtime not in", values, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeBetween(Date value1, Date value2) {
            addCriterion("homework_endtime between", value1, value2, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("homework_endtime not between", value1, value2, "homeworkEndtime");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateIsNull() {
            addCriterion("homework_submit_state is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateIsNotNull() {
            addCriterion("homework_submit_state is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateEqualTo(String value) {
            addCriterion("homework_submit_state =", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateNotEqualTo(String value) {
            addCriterion("homework_submit_state <>", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateGreaterThan(String value) {
            addCriterion("homework_submit_state >", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateGreaterThanOrEqualTo(String value) {
            addCriterion("homework_submit_state >=", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateLessThan(String value) {
            addCriterion("homework_submit_state <", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateLessThanOrEqualTo(String value) {
            addCriterion("homework_submit_state <=", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateLike(String value) {
            addCriterion("homework_submit_state like", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateNotLike(String value) {
            addCriterion("homework_submit_state not like", value, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateIn(List<String> values) {
            addCriterion("homework_submit_state in", values, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateNotIn(List<String> values) {
            addCriterion("homework_submit_state not in", values, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateBetween(String value1, String value2) {
            addCriterion("homework_submit_state between", value1, value2, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkSubmitStateNotBetween(String value1, String value2) {
            addCriterion("homework_submit_state not between", value1, value2, "homeworkSubmitState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateIsNull() {
            addCriterion("homework_grade_state is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateIsNotNull() {
            addCriterion("homework_grade_state is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateEqualTo(String value) {
            addCriterion("homework_grade_state =", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateNotEqualTo(String value) {
            addCriterion("homework_grade_state <>", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateGreaterThan(String value) {
            addCriterion("homework_grade_state >", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateGreaterThanOrEqualTo(String value) {
            addCriterion("homework_grade_state >=", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateLessThan(String value) {
            addCriterion("homework_grade_state <", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateLessThanOrEqualTo(String value) {
            addCriterion("homework_grade_state <=", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateLike(String value) {
            addCriterion("homework_grade_state like", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateNotLike(String value) {
            addCriterion("homework_grade_state not like", value, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateIn(List<String> values) {
            addCriterion("homework_grade_state in", values, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateNotIn(List<String> values) {
            addCriterion("homework_grade_state not in", values, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateBetween(String value1, String value2) {
            addCriterion("homework_grade_state between", value1, value2, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradeStateNotBetween(String value1, String value2) {
            addCriterion("homework_grade_state not between", value1, value2, "homeworkGradeState");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeIsNull() {
            addCriterion("homework_last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeIsNotNull() {
            addCriterion("homework_last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeEqualTo(Date value) {
            addCriterion("homework_last_edit_time =", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeNotEqualTo(Date value) {
            addCriterion("homework_last_edit_time <>", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeGreaterThan(Date value) {
            addCriterion("homework_last_edit_time >", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("homework_last_edit_time >=", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeLessThan(Date value) {
            addCriterion("homework_last_edit_time <", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("homework_last_edit_time <=", value, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeIn(List<Date> values) {
            addCriterion("homework_last_edit_time in", values, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeNotIn(List<Date> values) {
            addCriterion("homework_last_edit_time not in", values, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeBetween(Date value1, Date value2) {
            addCriterion("homework_last_edit_time between", value1, value2, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("homework_last_edit_time not between", value1, value2, "homeworkLastEditTime");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkIsNull() {
            addCriterion("homework_remark is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkIsNotNull() {
            addCriterion("homework_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkEqualTo(String value) {
            addCriterion("homework_remark =", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkNotEqualTo(String value) {
            addCriterion("homework_remark <>", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkGreaterThan(String value) {
            addCriterion("homework_remark >", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("homework_remark >=", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkLessThan(String value) {
            addCriterion("homework_remark <", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkLessThanOrEqualTo(String value) {
            addCriterion("homework_remark <=", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkLike(String value) {
            addCriterion("homework_remark like", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkNotLike(String value) {
            addCriterion("homework_remark not like", value, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkIn(List<String> values) {
            addCriterion("homework_remark in", values, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkNotIn(List<String> values) {
            addCriterion("homework_remark not in", values, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkBetween(String value1, String value2) {
            addCriterion("homework_remark between", value1, value2, "homeworkRemark");
            return (Criteria) this;
        }

        public Criteria andHomeworkRemarkNotBetween(String value1, String value2) {
            addCriterion("homework_remark not between", value1, value2, "homeworkRemark");
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