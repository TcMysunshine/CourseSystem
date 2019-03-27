package com.nju.entity;

import java.util.ArrayList;
import java.util.List;

public class TbWeekExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWeekExample() {
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

        public Criteria andWeekIdIsNull() {
            addCriterion("week_id is null");
            return (Criteria) this;
        }

        public Criteria andWeekIdIsNotNull() {
            addCriterion("week_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeekIdEqualTo(Integer value) {
            addCriterion("week_id =", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotEqualTo(Integer value) {
            addCriterion("week_id <>", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThan(Integer value) {
            addCriterion("week_id >", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_id >=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThan(Integer value) {
            addCriterion("week_id <", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThanOrEqualTo(Integer value) {
            addCriterion("week_id <=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdIn(List<Integer> values) {
            addCriterion("week_id in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotIn(List<Integer> values) {
            addCriterion("week_id not in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdBetween(Integer value1, Integer value2) {
            addCriterion("week_id between", value1, value2, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotBetween(Integer value1, Integer value2) {
            addCriterion("week_id not between", value1, value2, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNull() {
            addCriterion("week_day is null");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNotNull() {
            addCriterion("week_day is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDayEqualTo(String value) {
            addCriterion("week_day =", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotEqualTo(String value) {
            addCriterion("week_day <>", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThan(String value) {
            addCriterion("week_day >", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThanOrEqualTo(String value) {
            addCriterion("week_day >=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThan(String value) {
            addCriterion("week_day <", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThanOrEqualTo(String value) {
            addCriterion("week_day <=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLike(String value) {
            addCriterion("week_day like", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotLike(String value) {
            addCriterion("week_day not like", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayIn(List<String> values) {
            addCriterion("week_day in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotIn(List<String> values) {
            addCriterion("week_day not in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayBetween(String value1, String value2) {
            addCriterion("week_day between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotBetween(String value1, String value2) {
            addCriterion("week_day not between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekOrderIsNull() {
            addCriterion("week_order is null");
            return (Criteria) this;
        }

        public Criteria andWeekOrderIsNotNull() {
            addCriterion("week_order is not null");
            return (Criteria) this;
        }

        public Criteria andWeekOrderEqualTo(String value) {
            addCriterion("week_order =", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderNotEqualTo(String value) {
            addCriterion("week_order <>", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderGreaterThan(String value) {
            addCriterion("week_order >", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderGreaterThanOrEqualTo(String value) {
            addCriterion("week_order >=", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderLessThan(String value) {
            addCriterion("week_order <", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderLessThanOrEqualTo(String value) {
            addCriterion("week_order <=", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderLike(String value) {
            addCriterion("week_order like", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderNotLike(String value) {
            addCriterion("week_order not like", value, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderIn(List<String> values) {
            addCriterion("week_order in", values, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderNotIn(List<String> values) {
            addCriterion("week_order not in", values, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderBetween(String value1, String value2) {
            addCriterion("week_order between", value1, value2, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekOrderNotBetween(String value1, String value2) {
            addCriterion("week_order not between", value1, value2, "weekOrder");
            return (Criteria) this;
        }

        public Criteria andWeekTimeIsNull() {
            addCriterion("week_time is null");
            return (Criteria) this;
        }

        public Criteria andWeekTimeIsNotNull() {
            addCriterion("week_time is not null");
            return (Criteria) this;
        }

        public Criteria andWeekTimeEqualTo(String value) {
            addCriterion("week_time =", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeNotEqualTo(String value) {
            addCriterion("week_time <>", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeGreaterThan(String value) {
            addCriterion("week_time >", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeGreaterThanOrEqualTo(String value) {
            addCriterion("week_time >=", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeLessThan(String value) {
            addCriterion("week_time <", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeLessThanOrEqualTo(String value) {
            addCriterion("week_time <=", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeLike(String value) {
            addCriterion("week_time like", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeNotLike(String value) {
            addCriterion("week_time not like", value, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeIn(List<String> values) {
            addCriterion("week_time in", values, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeNotIn(List<String> values) {
            addCriterion("week_time not in", values, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeBetween(String value1, String value2) {
            addCriterion("week_time between", value1, value2, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekTimeNotBetween(String value1, String value2) {
            addCriterion("week_time not between", value1, value2, "weekTime");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonIsNull() {
            addCriterion("week_season is null");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonIsNotNull() {
            addCriterion("week_season is not null");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonEqualTo(String value) {
            addCriterion("week_season =", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonNotEqualTo(String value) {
            addCriterion("week_season <>", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonGreaterThan(String value) {
            addCriterion("week_season >", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("week_season >=", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonLessThan(String value) {
            addCriterion("week_season <", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonLessThanOrEqualTo(String value) {
            addCriterion("week_season <=", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonLike(String value) {
            addCriterion("week_season like", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonNotLike(String value) {
            addCriterion("week_season not like", value, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonIn(List<String> values) {
            addCriterion("week_season in", values, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonNotIn(List<String> values) {
            addCriterion("week_season not in", values, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonBetween(String value1, String value2) {
            addCriterion("week_season between", value1, value2, "weekSeason");
            return (Criteria) this;
        }

        public Criteria andWeekSeasonNotBetween(String value1, String value2) {
            addCriterion("week_season not between", value1, value2, "weekSeason");
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