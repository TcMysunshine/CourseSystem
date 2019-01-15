package com.nju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTeacherExample() {
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

        public Criteria andTeacherCountIsNull() {
            addCriterion("teacher_count is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCountIsNotNull() {
            addCriterion("teacher_count is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCountEqualTo(String value) {
            addCriterion("teacher_count =", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountNotEqualTo(String value) {
            addCriterion("teacher_count <>", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountGreaterThan(String value) {
            addCriterion("teacher_count >", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_count >=", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountLessThan(String value) {
            addCriterion("teacher_count <", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountLessThanOrEqualTo(String value) {
            addCriterion("teacher_count <=", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountLike(String value) {
            addCriterion("teacher_count like", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountNotLike(String value) {
            addCriterion("teacher_count not like", value, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountIn(List<String> values) {
            addCriterion("teacher_count in", values, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountNotIn(List<String> values) {
            addCriterion("teacher_count not in", values, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountBetween(String value1, String value2) {
            addCriterion("teacher_count between", value1, value2, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherCountNotBetween(String value1, String value2) {
            addCriterion("teacher_count not between", value1, value2, "teacherCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNull() {
            addCriterion("teacher_password is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNotNull() {
            addCriterion("teacher_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordEqualTo(String value) {
            addCriterion("teacher_password =", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotEqualTo(String value) {
            addCriterion("teacher_password <>", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThan(String value) {
            addCriterion("teacher_password >", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_password >=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThan(String value) {
            addCriterion("teacher_password <", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThanOrEqualTo(String value) {
            addCriterion("teacher_password <=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLike(String value) {
            addCriterion("teacher_password like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotLike(String value) {
            addCriterion("teacher_password not like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIn(List<String> values) {
            addCriterion("teacher_password in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotIn(List<String> values) {
            addCriterion("teacher_password not in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordBetween(String value1, String value2) {
            addCriterion("teacher_password between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotBetween(String value1, String value2) {
            addCriterion("teacher_password not between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleIsNull() {
            addCriterion("teacher_professional_title is null");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleIsNotNull() {
            addCriterion("teacher_professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleEqualTo(String value) {
            addCriterion("teacher_professional_title =", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleNotEqualTo(String value) {
            addCriterion("teacher_professional_title <>", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleGreaterThan(String value) {
            addCriterion("teacher_professional_title >", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_professional_title >=", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleLessThan(String value) {
            addCriterion("teacher_professional_title <", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_professional_title <=", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleLike(String value) {
            addCriterion("teacher_professional_title like", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleNotLike(String value) {
            addCriterion("teacher_professional_title not like", value, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleIn(List<String> values) {
            addCriterion("teacher_professional_title in", values, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleNotIn(List<String> values) {
            addCriterion("teacher_professional_title not in", values, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleBetween(String value1, String value2) {
            addCriterion("teacher_professional_title between", value1, value2, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalTitleNotBetween(String value1, String value2) {
            addCriterion("teacher_professional_title not between", value1, value2, "teacherProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNull() {
            addCriterion("teacher_degree is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNotNull() {
            addCriterion("teacher_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeEqualTo(String value) {
            addCriterion("teacher_degree =", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotEqualTo(String value) {
            addCriterion("teacher_degree <>", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThan(String value) {
            addCriterion("teacher_degree >", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_degree >=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThan(String value) {
            addCriterion("teacher_degree <", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThanOrEqualTo(String value) {
            addCriterion("teacher_degree <=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLike(String value) {
            addCriterion("teacher_degree like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotLike(String value) {
            addCriterion("teacher_degree not like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIn(List<String> values) {
            addCriterion("teacher_degree in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotIn(List<String> values) {
            addCriterion("teacher_degree not in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeBetween(String value1, String value2) {
            addCriterion("teacher_degree between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotBetween(String value1, String value2) {
            addCriterion("teacher_degree not between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNull() {
            addCriterion("teacher_address is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNotNull() {
            addCriterion("teacher_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressEqualTo(String value) {
            addCriterion("teacher_address =", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotEqualTo(String value) {
            addCriterion("teacher_address <>", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThan(String value) {
            addCriterion("teacher_address >", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_address >=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThan(String value) {
            addCriterion("teacher_address <", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThanOrEqualTo(String value) {
            addCriterion("teacher_address <=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLike(String value) {
            addCriterion("teacher_address like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotLike(String value) {
            addCriterion("teacher_address not like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIn(List<String> values) {
            addCriterion("teacher_address in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotIn(List<String> values) {
            addCriterion("teacher_address not in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressBetween(String value1, String value2) {
            addCriterion("teacher_address between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotBetween(String value1, String value2) {
            addCriterion("teacher_address not between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(Integer value) {
            addCriterion("teacher_sex =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(Integer value) {
            addCriterion("teacher_sex <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(Integer value) {
            addCriterion("teacher_sex >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_sex >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(Integer value) {
            addCriterion("teacher_sex <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_sex <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<Integer> values) {
            addCriterion("teacher_sex in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<Integer> values) {
            addCriterion("teacher_sex not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(Integer value1, Integer value2) {
            addCriterion("teacher_sex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_sex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNull() {
            addCriterion("teacher_age is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNotNull() {
            addCriterion("teacher_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeEqualTo(Integer value) {
            addCriterion("teacher_age =", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotEqualTo(Integer value) {
            addCriterion("teacher_age <>", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThan(Integer value) {
            addCriterion("teacher_age >", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_age >=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThan(Integer value) {
            addCriterion("teacher_age <", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_age <=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIn(List<Integer> values) {
            addCriterion("teacher_age in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotIn(List<Integer> values) {
            addCriterion("teacher_age not in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeBetween(Integer value1, Integer value2) {
            addCriterion("teacher_age between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_age not between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacher_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacher_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacher_phone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacher_phone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacher_phone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_phone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacher_phone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_phone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacher_phone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacher_phone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacher_phone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacher_phone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacher_phone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacher_phone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityIsNull() {
            addCriterion("teacher_nationality is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityIsNotNull() {
            addCriterion("teacher_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityEqualTo(String value) {
            addCriterion("teacher_nationality =", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityNotEqualTo(String value) {
            addCriterion("teacher_nationality <>", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityGreaterThan(String value) {
            addCriterion("teacher_nationality >", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_nationality >=", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityLessThan(String value) {
            addCriterion("teacher_nationality <", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityLessThanOrEqualTo(String value) {
            addCriterion("teacher_nationality <=", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityLike(String value) {
            addCriterion("teacher_nationality like", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityNotLike(String value) {
            addCriterion("teacher_nationality not like", value, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityIn(List<String> values) {
            addCriterion("teacher_nationality in", values, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityNotIn(List<String> values) {
            addCriterion("teacher_nationality not in", values, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityBetween(String value1, String value2) {
            addCriterion("teacher_nationality between", value1, value2, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherNationalityNotBetween(String value1, String value2) {
            addCriterion("teacher_nationality not between", value1, value2, "teacherNationality");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeIsNull() {
            addCriterion("teacher_createTime is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeIsNotNull() {
            addCriterion("teacher_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeEqualTo(Date value) {
            addCriterion("teacher_createTime =", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeNotEqualTo(Date value) {
            addCriterion("teacher_createTime <>", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeGreaterThan(Date value) {
            addCriterion("teacher_createTime >", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_createTime >=", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeLessThan(Date value) {
            addCriterion("teacher_createTime <", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_createTime <=", value, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeIn(List<Date> values) {
            addCriterion("teacher_createTime in", values, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeNotIn(List<Date> values) {
            addCriterion("teacher_createTime not in", values, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeBetween(Date value1, Date value2) {
            addCriterion("teacher_createTime between", value1, value2, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_createTime not between", value1, value2, "teacherCreatetime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeIsNull() {
            addCriterion("teacher_lasteditTime is null");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeIsNotNull() {
            addCriterion("teacher_lasteditTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeEqualTo(Date value) {
            addCriterion("teacher_lasteditTime =", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeNotEqualTo(Date value) {
            addCriterion("teacher_lasteditTime <>", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeGreaterThan(Date value) {
            addCriterion("teacher_lasteditTime >", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_lasteditTime >=", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeLessThan(Date value) {
            addCriterion("teacher_lasteditTime <", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_lasteditTime <=", value, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeIn(List<Date> values) {
            addCriterion("teacher_lasteditTime in", values, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeNotIn(List<Date> values) {
            addCriterion("teacher_lasteditTime not in", values, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeBetween(Date value1, Date value2) {
            addCriterion("teacher_lasteditTime between", value1, value2, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherLastedittimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_lasteditTime not between", value1, value2, "teacherLastedittime");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNull() {
            addCriterion("teacher_status is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNotNull() {
            addCriterion("teacher_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusEqualTo(String value) {
            addCriterion("teacher_status =", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotEqualTo(String value) {
            addCriterion("teacher_status <>", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThan(String value) {
            addCriterion("teacher_status >", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_status >=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThan(String value) {
            addCriterion("teacher_status <", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThanOrEqualTo(String value) {
            addCriterion("teacher_status <=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLike(String value) {
            addCriterion("teacher_status like", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotLike(String value) {
            addCriterion("teacher_status not like", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIn(List<String> values) {
            addCriterion("teacher_status in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotIn(List<String> values) {
            addCriterion("teacher_status not in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusBetween(String value1, String value2) {
            addCriterion("teacher_status between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotBetween(String value1, String value2) {
            addCriterion("teacher_status not between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogIsNull() {
            addCriterion("teacher_blog is null");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogIsNotNull() {
            addCriterion("teacher_blog is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogEqualTo(String value) {
            addCriterion("teacher_blog =", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogNotEqualTo(String value) {
            addCriterion("teacher_blog <>", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogGreaterThan(String value) {
            addCriterion("teacher_blog >", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_blog >=", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogLessThan(String value) {
            addCriterion("teacher_blog <", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogLessThanOrEqualTo(String value) {
            addCriterion("teacher_blog <=", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogLike(String value) {
            addCriterion("teacher_blog like", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogNotLike(String value) {
            addCriterion("teacher_blog not like", value, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogIn(List<String> values) {
            addCriterion("teacher_blog in", values, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogNotIn(List<String> values) {
            addCriterion("teacher_blog not in", values, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogBetween(String value1, String value2) {
            addCriterion("teacher_blog between", value1, value2, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherBlogNotBetween(String value1, String value2) {
            addCriterion("teacher_blog not between", value1, value2, "teacherBlog");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureIsNull() {
            addCriterion("teacher_sifnature is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureIsNotNull() {
            addCriterion("teacher_sifnature is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureEqualTo(String value) {
            addCriterion("teacher_sifnature =", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureNotEqualTo(String value) {
            addCriterion("teacher_sifnature <>", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureGreaterThan(String value) {
            addCriterion("teacher_sifnature >", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_sifnature >=", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureLessThan(String value) {
            addCriterion("teacher_sifnature <", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureLessThanOrEqualTo(String value) {
            addCriterion("teacher_sifnature <=", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureLike(String value) {
            addCriterion("teacher_sifnature like", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureNotLike(String value) {
            addCriterion("teacher_sifnature not like", value, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureIn(List<String> values) {
            addCriterion("teacher_sifnature in", values, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureNotIn(List<String> values) {
            addCriterion("teacher_sifnature not in", values, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureBetween(String value1, String value2) {
            addCriterion("teacher_sifnature between", value1, value2, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherSifnatureNotBetween(String value1, String value2) {
            addCriterion("teacher_sifnature not between", value1, value2, "teacherSifnature");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceIsNull() {
            addCriterion("teacher_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceIsNotNull() {
            addCriterion("teacher_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceEqualTo(String value) {
            addCriterion("teacher_introduce =", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceNotEqualTo(String value) {
            addCriterion("teacher_introduce <>", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceGreaterThan(String value) {
            addCriterion("teacher_introduce >", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_introduce >=", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceLessThan(String value) {
            addCriterion("teacher_introduce <", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceLessThanOrEqualTo(String value) {
            addCriterion("teacher_introduce <=", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceLike(String value) {
            addCriterion("teacher_introduce like", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceNotLike(String value) {
            addCriterion("teacher_introduce not like", value, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceIn(List<String> values) {
            addCriterion("teacher_introduce in", values, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceNotIn(List<String> values) {
            addCriterion("teacher_introduce not in", values, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceBetween(String value1, String value2) {
            addCriterion("teacher_introduce between", value1, value2, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroduceNotBetween(String value1, String value2) {
            addCriterion("teacher_introduce not between", value1, value2, "teacherIntroduce");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageIsNull() {
            addCriterion("teacher_personhomepage is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageIsNotNull() {
            addCriterion("teacher_personhomepage is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageEqualTo(String value) {
            addCriterion("teacher_personhomepage =", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageNotEqualTo(String value) {
            addCriterion("teacher_personhomepage <>", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageGreaterThan(String value) {
            addCriterion("teacher_personhomepage >", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_personhomepage >=", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageLessThan(String value) {
            addCriterion("teacher_personhomepage <", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageLessThanOrEqualTo(String value) {
            addCriterion("teacher_personhomepage <=", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageLike(String value) {
            addCriterion("teacher_personhomepage like", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageNotLike(String value) {
            addCriterion("teacher_personhomepage not like", value, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageIn(List<String> values) {
            addCriterion("teacher_personhomepage in", values, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageNotIn(List<String> values) {
            addCriterion("teacher_personhomepage not in", values, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageBetween(String value1, String value2) {
            addCriterion("teacher_personhomepage between", value1, value2, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherPersonhomepageNotBetween(String value1, String value2) {
            addCriterion("teacher_personhomepage not between", value1, value2, "teacherPersonhomepage");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNull() {
            addCriterion("teacher_department is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNotNull() {
            addCriterion("teacher_department is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentEqualTo(String value) {
            addCriterion("teacher_department =", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotEqualTo(String value) {
            addCriterion("teacher_department <>", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThan(String value) {
            addCriterion("teacher_department >", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_department >=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThan(String value) {
            addCriterion("teacher_department <", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThanOrEqualTo(String value) {
            addCriterion("teacher_department <=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLike(String value) {
            addCriterion("teacher_department like", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotLike(String value) {
            addCriterion("teacher_department not like", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIn(List<String> values) {
            addCriterion("teacher_department in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotIn(List<String> values) {
            addCriterion("teacher_department not in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentBetween(String value1, String value2) {
            addCriterion("teacher_department between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotBetween(String value1, String value2) {
            addCriterion("teacher_department not between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIsNull() {
            addCriterion("teacher_office is null");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIsNotNull() {
            addCriterion("teacher_office is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeEqualTo(String value) {
            addCriterion("teacher_office =", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotEqualTo(String value) {
            addCriterion("teacher_office <>", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeGreaterThan(String value) {
            addCriterion("teacher_office >", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_office >=", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLessThan(String value) {
            addCriterion("teacher_office <", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLessThanOrEqualTo(String value) {
            addCriterion("teacher_office <=", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLike(String value) {
            addCriterion("teacher_office like", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotLike(String value) {
            addCriterion("teacher_office not like", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIn(List<String> values) {
            addCriterion("teacher_office in", values, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotIn(List<String> values) {
            addCriterion("teacher_office not in", values, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeBetween(String value1, String value2) {
            addCriterion("teacher_office between", value1, value2, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotBetween(String value1, String value2) {
            addCriterion("teacher_office not between", value1, value2, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherImgIsNull() {
            addCriterion("teacher_img is null");
            return (Criteria) this;
        }

        public Criteria andTeacherImgIsNotNull() {
            addCriterion("teacher_img is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherImgEqualTo(Integer value) {
            addCriterion("teacher_img =", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgNotEqualTo(Integer value) {
            addCriterion("teacher_img <>", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgGreaterThan(Integer value) {
            addCriterion("teacher_img >", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_img >=", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgLessThan(Integer value) {
            addCriterion("teacher_img <", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_img <=", value, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgIn(List<Integer> values) {
            addCriterion("teacher_img in", values, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgNotIn(List<Integer> values) {
            addCriterion("teacher_img not in", values, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgBetween(Integer value1, Integer value2) {
            addCriterion("teacher_img between", value1, value2, "teacherImg");
            return (Criteria) this;
        }

        public Criteria andTeacherImgNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_img not between", value1, value2, "teacherImg");
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