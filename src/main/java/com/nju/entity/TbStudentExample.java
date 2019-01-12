package com.nju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentExample() {
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

        public Criteria andStudentTypeIsNull() {
            addCriterion("student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNotNull() {
            addCriterion("student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeEqualTo(Integer value) {
            addCriterion("student_type =", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotEqualTo(Integer value) {
            addCriterion("student_type <>", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThan(Integer value) {
            addCriterion("student_type >", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_type >=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThan(Integer value) {
            addCriterion("student_type <", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("student_type <=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIn(List<Integer> values) {
            addCriterion("student_type in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotIn(List<Integer> values) {
            addCriterion("student_type not in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeBetween(Integer value1, Integer value2) {
            addCriterion("student_type between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_type not between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentCountIsNull() {
            addCriterion("student_count is null");
            return (Criteria) this;
        }

        public Criteria andStudentCountIsNotNull() {
            addCriterion("student_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCountEqualTo(String value) {
            addCriterion("student_count =", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotEqualTo(String value) {
            addCriterion("student_count <>", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountGreaterThan(String value) {
            addCriterion("student_count >", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountGreaterThanOrEqualTo(String value) {
            addCriterion("student_count >=", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountLessThan(String value) {
            addCriterion("student_count <", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountLessThanOrEqualTo(String value) {
            addCriterion("student_count <=", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountLike(String value) {
            addCriterion("student_count like", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotLike(String value) {
            addCriterion("student_count not like", value, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountIn(List<String> values) {
            addCriterion("student_count in", values, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotIn(List<String> values) {
            addCriterion("student_count not in", values, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountBetween(String value1, String value2) {
            addCriterion("student_count between", value1, value2, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentCountNotBetween(String value1, String value2) {
            addCriterion("student_count not between", value1, value2, "studentCount");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(Integer value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(Integer value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(Integer value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(Integer value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(Integer value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<Integer> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<Integer> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(Integer value1, Integer value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(Integer value1, Integer value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNull() {
            addCriterion("student_age is null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNotNull() {
            addCriterion("student_age is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeEqualTo(Integer value) {
            addCriterion("student_age =", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotEqualTo(Integer value) {
            addCriterion("student_age <>", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThan(Integer value) {
            addCriterion("student_age >", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_age >=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThan(Integer value) {
            addCriterion("student_age <", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("student_age <=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIn(List<Integer> values) {
            addCriterion("student_age in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotIn(List<Integer> values) {
            addCriterion("student_age not in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("student_age between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_age not between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityIsNull() {
            addCriterion("student_nationality is null");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityIsNotNull() {
            addCriterion("student_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityEqualTo(String value) {
            addCriterion("student_nationality =", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityNotEqualTo(String value) {
            addCriterion("student_nationality <>", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityGreaterThan(String value) {
            addCriterion("student_nationality >", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("student_nationality >=", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityLessThan(String value) {
            addCriterion("student_nationality <", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityLessThanOrEqualTo(String value) {
            addCriterion("student_nationality <=", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityLike(String value) {
            addCriterion("student_nationality like", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityNotLike(String value) {
            addCriterion("student_nationality not like", value, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityIn(List<String> values) {
            addCriterion("student_nationality in", values, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityNotIn(List<String> values) {
            addCriterion("student_nationality not in", values, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityBetween(String value1, String value2) {
            addCriterion("student_nationality between", value1, value2, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentNationalityNotBetween(String value1, String value2) {
            addCriterion("student_nationality not between", value1, value2, "studentNationality");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeIsNull() {
            addCriterion("student_createTime is null");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeIsNotNull() {
            addCriterion("student_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeEqualTo(Date value) {
            addCriterion("student_createTime =", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeNotEqualTo(Date value) {
            addCriterion("student_createTime <>", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeGreaterThan(Date value) {
            addCriterion("student_createTime >", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_createTime >=", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeLessThan(Date value) {
            addCriterion("student_createTime <", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("student_createTime <=", value, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeIn(List<Date> values) {
            addCriterion("student_createTime in", values, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeNotIn(List<Date> values) {
            addCriterion("student_createTime not in", values, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeBetween(Date value1, Date value2) {
            addCriterion("student_createTime between", value1, value2, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("student_createTime not between", value1, value2, "studentCreatetime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeIsNull() {
            addCriterion("student_lasteditTime is null");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeIsNotNull() {
            addCriterion("student_lasteditTime is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeEqualTo(Date value) {
            addCriterion("student_lasteditTime =", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeNotEqualTo(Date value) {
            addCriterion("student_lasteditTime <>", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeGreaterThan(Date value) {
            addCriterion("student_lasteditTime >", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_lasteditTime >=", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeLessThan(Date value) {
            addCriterion("student_lasteditTime <", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeLessThanOrEqualTo(Date value) {
            addCriterion("student_lasteditTime <=", value, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeIn(List<Date> values) {
            addCriterion("student_lasteditTime in", values, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeNotIn(List<Date> values) {
            addCriterion("student_lasteditTime not in", values, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeBetween(Date value1, Date value2) {
            addCriterion("student_lasteditTime between", value1, value2, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentLastedittimeNotBetween(Date value1, Date value2) {
            addCriterion("student_lasteditTime not between", value1, value2, "studentLastedittime");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureIsNull() {
            addCriterion("student_sifnature is null");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureIsNotNull() {
            addCriterion("student_sifnature is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureEqualTo(String value) {
            addCriterion("student_sifnature =", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureNotEqualTo(String value) {
            addCriterion("student_sifnature <>", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureGreaterThan(String value) {
            addCriterion("student_sifnature >", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureGreaterThanOrEqualTo(String value) {
            addCriterion("student_sifnature >=", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureLessThan(String value) {
            addCriterion("student_sifnature <", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureLessThanOrEqualTo(String value) {
            addCriterion("student_sifnature <=", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureLike(String value) {
            addCriterion("student_sifnature like", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureNotLike(String value) {
            addCriterion("student_sifnature not like", value, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureIn(List<String> values) {
            addCriterion("student_sifnature in", values, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureNotIn(List<String> values) {
            addCriterion("student_sifnature not in", values, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureBetween(String value1, String value2) {
            addCriterion("student_sifnature between", value1, value2, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentSifnatureNotBetween(String value1, String value2) {
            addCriterion("student_sifnature not between", value1, value2, "studentSifnature");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceIsNull() {
            addCriterion("student_introduce is null");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceIsNotNull() {
            addCriterion("student_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceEqualTo(String value) {
            addCriterion("student_introduce =", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceNotEqualTo(String value) {
            addCriterion("student_introduce <>", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceGreaterThan(String value) {
            addCriterion("student_introduce >", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("student_introduce >=", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceLessThan(String value) {
            addCriterion("student_introduce <", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceLessThanOrEqualTo(String value) {
            addCriterion("student_introduce <=", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceLike(String value) {
            addCriterion("student_introduce like", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceNotLike(String value) {
            addCriterion("student_introduce not like", value, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceIn(List<String> values) {
            addCriterion("student_introduce in", values, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceNotIn(List<String> values) {
            addCriterion("student_introduce not in", values, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceBetween(String value1, String value2) {
            addCriterion("student_introduce between", value1, value2, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentIntroduceNotBetween(String value1, String value2) {
            addCriterion("student_introduce not between", value1, value2, "studentIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("student_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("student_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(String value) {
            addCriterion("student_status =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(String value) {
            addCriterion("student_status <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(String value) {
            addCriterion("student_status >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("student_status >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(String value) {
            addCriterion("student_status <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("student_status <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLike(String value) {
            addCriterion("student_status like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotLike(String value) {
            addCriterion("student_status not like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<String> values) {
            addCriterion("student_status in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<String> values) {
            addCriterion("student_status not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(String value1, String value2) {
            addCriterion("student_status between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(String value1, String value2) {
            addCriterion("student_status not between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentBlogIsNull() {
            addCriterion("student_blog is null");
            return (Criteria) this;
        }

        public Criteria andStudentBlogIsNotNull() {
            addCriterion("student_blog is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBlogEqualTo(String value) {
            addCriterion("student_blog =", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogNotEqualTo(String value) {
            addCriterion("student_blog <>", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogGreaterThan(String value) {
            addCriterion("student_blog >", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogGreaterThanOrEqualTo(String value) {
            addCriterion("student_blog >=", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogLessThan(String value) {
            addCriterion("student_blog <", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogLessThanOrEqualTo(String value) {
            addCriterion("student_blog <=", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogLike(String value) {
            addCriterion("student_blog like", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogNotLike(String value) {
            addCriterion("student_blog not like", value, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogIn(List<String> values) {
            addCriterion("student_blog in", values, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogNotIn(List<String> values) {
            addCriterion("student_blog not in", values, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogBetween(String value1, String value2) {
            addCriterion("student_blog between", value1, value2, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentBlogNotBetween(String value1, String value2) {
            addCriterion("student_blog not between", value1, value2, "studentBlog");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNull() {
            addCriterion("student_img is null");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNotNull() {
            addCriterion("student_img is not null");
            return (Criteria) this;
        }

        public Criteria andStudentImgEqualTo(Integer value) {
            addCriterion("student_img =", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotEqualTo(Integer value) {
            addCriterion("student_img <>", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThan(Integer value) {
            addCriterion("student_img >", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_img >=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThan(Integer value) {
            addCriterion("student_img <", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThanOrEqualTo(Integer value) {
            addCriterion("student_img <=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgIn(List<Integer> values) {
            addCriterion("student_img in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotIn(List<Integer> values) {
            addCriterion("student_img not in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgBetween(Integer value1, Integer value2) {
            addCriterion("student_img between", value1, value2, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotBetween(Integer value1, Integer value2) {
            addCriterion("student_img not between", value1, value2, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentIsNull() {
            addCriterion("student_department is null");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentIsNotNull() {
            addCriterion("student_department is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentEqualTo(Integer value) {
            addCriterion("student_department =", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentNotEqualTo(Integer value) {
            addCriterion("student_department <>", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentGreaterThan(Integer value) {
            addCriterion("student_department >", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_department >=", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentLessThan(Integer value) {
            addCriterion("student_department <", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("student_department <=", value, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentIn(List<Integer> values) {
            addCriterion("student_department in", values, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentNotIn(List<Integer> values) {
            addCriterion("student_department not in", values, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("student_department between", value1, value2, "studentDepartment");
            return (Criteria) this;
        }

        public Criteria andStudentDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("student_department not between", value1, value2, "studentDepartment");
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