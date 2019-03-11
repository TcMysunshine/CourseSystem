package com.nju.entity;

import java.util.ArrayList;
import java.util.List;

public class TbStudentCourseConcreteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentCourseConcreteExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("SC_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("SC_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("SC_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("SC_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("SC_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SC_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("SC_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("SC_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("SC_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("SC_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("SC_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SC_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andSorceIsNull() {
            addCriterion("sorce is null");
            return (Criteria) this;
        }

        public Criteria andSorceIsNotNull() {
            addCriterion("sorce is not null");
            return (Criteria) this;
        }

        public Criteria andSorceEqualTo(Integer value) {
            addCriterion("sorce =", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceNotEqualTo(Integer value) {
            addCriterion("sorce <>", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceGreaterThan(Integer value) {
            addCriterion("sorce >", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorce >=", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceLessThan(Integer value) {
            addCriterion("sorce <", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceLessThanOrEqualTo(Integer value) {
            addCriterion("sorce <=", value, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceIn(List<Integer> values) {
            addCriterion("sorce in", values, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceNotIn(List<Integer> values) {
            addCriterion("sorce not in", values, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceBetween(Integer value1, Integer value2) {
            addCriterion("sorce between", value1, value2, "sorce");
            return (Criteria) this;
        }

        public Criteria andSorceNotBetween(Integer value1, Integer value2) {
            addCriterion("sorce not between", value1, value2, "sorce");
            return (Criteria) this;
        }

        public Criteria andCreateYearIsNull() {
            addCriterion("create_year is null");
            return (Criteria) this;
        }

        public Criteria andCreateYearIsNotNull() {
            addCriterion("create_year is not null");
            return (Criteria) this;
        }

        public Criteria andCreateYearEqualTo(Integer value) {
            addCriterion("create_year =", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotEqualTo(Integer value) {
            addCriterion("create_year <>", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearGreaterThan(Integer value) {
            addCriterion("create_year >", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_year >=", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearLessThan(Integer value) {
            addCriterion("create_year <", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearLessThanOrEqualTo(Integer value) {
            addCriterion("create_year <=", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearIn(List<Integer> values) {
            addCriterion("create_year in", values, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotIn(List<Integer> values) {
            addCriterion("create_year not in", values, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearBetween(Integer value1, Integer value2) {
            addCriterion("create_year between", value1, value2, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotBetween(Integer value1, Integer value2) {
            addCriterion("create_year not between", value1, value2, "createYear");
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