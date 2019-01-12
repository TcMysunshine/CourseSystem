package com.nju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbImgExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgAddrIsNull() {
            addCriterion("img_addr is null");
            return (Criteria) this;
        }

        public Criteria andImgAddrIsNotNull() {
            addCriterion("img_addr is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddrEqualTo(String value) {
            addCriterion("img_addr =", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotEqualTo(String value) {
            addCriterion("img_addr <>", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrGreaterThan(String value) {
            addCriterion("img_addr >", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrGreaterThanOrEqualTo(String value) {
            addCriterion("img_addr >=", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLessThan(String value) {
            addCriterion("img_addr <", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLessThanOrEqualTo(String value) {
            addCriterion("img_addr <=", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLike(String value) {
            addCriterion("img_addr like", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotLike(String value) {
            addCriterion("img_addr not like", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrIn(List<String> values) {
            addCriterion("img_addr in", values, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotIn(List<String> values) {
            addCriterion("img_addr not in", values, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrBetween(String value1, String value2) {
            addCriterion("img_addr between", value1, value2, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotBetween(String value1, String value2) {
            addCriterion("img_addr not between", value1, value2, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNull() {
            addCriterion("img_desc is null");
            return (Criteria) this;
        }

        public Criteria andImgDescIsNotNull() {
            addCriterion("img_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImgDescEqualTo(String value) {
            addCriterion("img_desc =", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotEqualTo(String value) {
            addCriterion("img_desc <>", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThan(String value) {
            addCriterion("img_desc >", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescGreaterThanOrEqualTo(String value) {
            addCriterion("img_desc >=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThan(String value) {
            addCriterion("img_desc <", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLessThanOrEqualTo(String value) {
            addCriterion("img_desc <=", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescLike(String value) {
            addCriterion("img_desc like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotLike(String value) {
            addCriterion("img_desc not like", value, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescIn(List<String> values) {
            addCriterion("img_desc in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotIn(List<String> values) {
            addCriterion("img_desc not in", values, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescBetween(String value1, String value2) {
            addCriterion("img_desc between", value1, value2, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andImgDescNotBetween(String value1, String value2) {
            addCriterion("img_desc not between", value1, value2, "imgDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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