package com.nju.entity;

import java.util.ArrayList;
import java.util.List;

public class TbTccHomeworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTccHomeworkExample() {
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

        public Criteria andTcchIdIsNull() {
            addCriterion("tcch_id is null");
            return (Criteria) this;
        }

        public Criteria andTcchIdIsNotNull() {
            addCriterion("tcch_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcchIdEqualTo(Integer value) {
            addCriterion("tcch_id =", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdNotEqualTo(Integer value) {
            addCriterion("tcch_id <>", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdGreaterThan(Integer value) {
            addCriterion("tcch_id >", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcch_id >=", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdLessThan(Integer value) {
            addCriterion("tcch_id <", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdLessThanOrEqualTo(Integer value) {
            addCriterion("tcch_id <=", value, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdIn(List<Integer> values) {
            addCriterion("tcch_id in", values, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdNotIn(List<Integer> values) {
            addCriterion("tcch_id not in", values, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdBetween(Integer value1, Integer value2) {
            addCriterion("tcch_id between", value1, value2, "tcchId");
            return (Criteria) this;
        }

        public Criteria andTcchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tcch_id not between", value1, value2, "tcchId");
            return (Criteria) this;
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