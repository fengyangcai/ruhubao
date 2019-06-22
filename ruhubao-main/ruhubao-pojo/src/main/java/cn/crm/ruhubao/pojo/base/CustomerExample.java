package cn.crm.ruhubao.pojo.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("cst_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("cst_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("cst_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("cst_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cst_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("cst_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("cst_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("cst_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("cst_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("cst_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cst_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("cst_name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("cst_name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("cst_name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("cst_name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("cst_name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("cst_name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("cst_name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("cst_name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("cst_name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("cst_name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("cst_name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("cst_name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("cst_name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("cst_name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNull() {
            addCriterion("cst_tel_phone is null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNotNull() {
            addCriterion("cst_tel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneEqualTo(String value) {
            addCriterion("cst_tel_phone =", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotEqualTo(String value) {
            addCriterion("cst_tel_phone <>", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThan(String value) {
            addCriterion("cst_tel_phone >", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cst_tel_phone >=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThan(String value) {
            addCriterion("cst_tel_phone <", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("cst_tel_phone <=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLike(String value) {
            addCriterion("cst_tel_phone like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotLike(String value) {
            addCriterion("cst_tel_phone not like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIn(List<String> values) {
            addCriterion("cst_tel_phone in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotIn(List<String> values) {
            addCriterion("cst_tel_phone not in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneBetween(String value1, String value2) {
            addCriterion("cst_tel_phone between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotBetween(String value1, String value2) {
            addCriterion("cst_tel_phone not between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andWeixinQqIsNull() {
            addCriterion("cst_weixin_qq is null");
            return (Criteria) this;
        }

        public Criteria andWeixinQqIsNotNull() {
            addCriterion("cst_weixin_qq is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinQqEqualTo(String value) {
            addCriterion("cst_weixin_qq =", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqNotEqualTo(String value) {
            addCriterion("cst_weixin_qq <>", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqGreaterThan(String value) {
            addCriterion("cst_weixin_qq >", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqGreaterThanOrEqualTo(String value) {
            addCriterion("cst_weixin_qq >=", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqLessThan(String value) {
            addCriterion("cst_weixin_qq <", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqLessThanOrEqualTo(String value) {
            addCriterion("cst_weixin_qq <=", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqLike(String value) {
            addCriterion("cst_weixin_qq like", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqNotLike(String value) {
            addCriterion("cst_weixin_qq not like", value, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqIn(List<String> values) {
            addCriterion("cst_weixin_qq in", values, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqNotIn(List<String> values) {
            addCriterion("cst_weixin_qq not in", values, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqBetween(String value1, String value2) {
            addCriterion("cst_weixin_qq between", value1, value2, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andWeixinQqNotBetween(String value1, String value2) {
            addCriterion("cst_weixin_qq not between", value1, value2, "weixinQq");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIsNull() {
            addCriterion("cst_age_groups is null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIsNotNull() {
            addCriterion("cst_age_groups is not null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsEqualTo(String value) {
            addCriterion("cst_age_groups =", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotEqualTo(String value) {
            addCriterion("cst_age_groups <>", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsGreaterThan(String value) {
            addCriterion("cst_age_groups >", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("cst_age_groups >=", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLessThan(String value) {
            addCriterion("cst_age_groups <", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLessThanOrEqualTo(String value) {
            addCriterion("cst_age_groups <=", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsLike(String value) {
            addCriterion("cst_age_groups like", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotLike(String value) {
            addCriterion("cst_age_groups not like", value, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsIn(List<String> values) {
            addCriterion("cst_age_groups in", values, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotIn(List<String> values) {
            addCriterion("cst_age_groups not in", values, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsBetween(String value1, String value2) {
            addCriterion("cst_age_groups between", value1, value2, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andAgeGroupsNotBetween(String value1, String value2) {
            addCriterion("cst_age_groups not between", value1, value2, "ageGroups");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("cst_type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("cst_type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("cst_type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("cst_type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("cst_type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cst_type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("cst_type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("cst_type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("cst_type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("cst_type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("cst_type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("cst_type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("cst_type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("cst_type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("cst_area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("cst_area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("cst_area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("cst_area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("cst_area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("cst_area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("cst_area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("cst_area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("cst_area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("cst_area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("cst_area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("cst_area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("cst_area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("cst_area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("cst_education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("cst_education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("cst_education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("cst_education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("cst_education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("cst_education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("cst_education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("cst_education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("cst_education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("cst_education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("cst_education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("cst_education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("cst_education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("cst_education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("cst_major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("cst_major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("cst_major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("cst_major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("cst_major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("cst_major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("cst_major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("cst_major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("cst_major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("cst_major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("cst_major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("cst_major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("cst_major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("cst_major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andNvqIsNull() {
            addCriterion("cst_nvq is null");
            return (Criteria) this;
        }

        public Criteria andNvqIsNotNull() {
            addCriterion("cst_nvq is not null");
            return (Criteria) this;
        }

        public Criteria andNvqEqualTo(String value) {
            addCriterion("cst_nvq =", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqNotEqualTo(String value) {
            addCriterion("cst_nvq <>", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqGreaterThan(String value) {
            addCriterion("cst_nvq >", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqGreaterThanOrEqualTo(String value) {
            addCriterion("cst_nvq >=", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqLessThan(String value) {
            addCriterion("cst_nvq <", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqLessThanOrEqualTo(String value) {
            addCriterion("cst_nvq <=", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqLike(String value) {
            addCriterion("cst_nvq like", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqNotLike(String value) {
            addCriterion("cst_nvq not like", value, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqIn(List<String> values) {
            addCriterion("cst_nvq in", values, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqNotIn(List<String> values) {
            addCriterion("cst_nvq not in", values, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqBetween(String value1, String value2) {
            addCriterion("cst_nvq between", value1, value2, "nvq");
            return (Criteria) this;
        }

        public Criteria andNvqNotBetween(String value1, String value2) {
            addCriterion("cst_nvq not between", value1, value2, "nvq");
            return (Criteria) this;
        }

        public Criteria andYearsSocialIsNull() {
            addCriterion("cst_years_social is null");
            return (Criteria) this;
        }

        public Criteria andYearsSocialIsNotNull() {
            addCriterion("cst_years_social is not null");
            return (Criteria) this;
        }

        public Criteria andYearsSocialEqualTo(String value) {
            addCriterion("cst_years_social =", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialNotEqualTo(String value) {
            addCriterion("cst_years_social <>", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialGreaterThan(String value) {
            addCriterion("cst_years_social >", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialGreaterThanOrEqualTo(String value) {
            addCriterion("cst_years_social >=", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialLessThan(String value) {
            addCriterion("cst_years_social <", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialLessThanOrEqualTo(String value) {
            addCriterion("cst_years_social <=", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialLike(String value) {
            addCriterion("cst_years_social like", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialNotLike(String value) {
            addCriterion("cst_years_social not like", value, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialIn(List<String> values) {
            addCriterion("cst_years_social in", values, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialNotIn(List<String> values) {
            addCriterion("cst_years_social not in", values, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialBetween(String value1, String value2) {
            addCriterion("cst_years_social between", value1, value2, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andYearsSocialNotBetween(String value1, String value2) {
            addCriterion("cst_years_social not between", value1, value2, "yearsSocial");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonIsNull() {
            addCriterion("cst_ruhu_reason is null");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonIsNotNull() {
            addCriterion("cst_ruhu_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonEqualTo(String value) {
            addCriterion("cst_ruhu_reason =", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonNotEqualTo(String value) {
            addCriterion("cst_ruhu_reason <>", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonGreaterThan(String value) {
            addCriterion("cst_ruhu_reason >", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cst_ruhu_reason >=", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonLessThan(String value) {
            addCriterion("cst_ruhu_reason <", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonLessThanOrEqualTo(String value) {
            addCriterion("cst_ruhu_reason <=", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonLike(String value) {
            addCriterion("cst_ruhu_reason like", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonNotLike(String value) {
            addCriterion("cst_ruhu_reason not like", value, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonIn(List<String> values) {
            addCriterion("cst_ruhu_reason in", values, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonNotIn(List<String> values) {
            addCriterion("cst_ruhu_reason not in", values, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonBetween(String value1, String value2) {
            addCriterion("cst_ruhu_reason between", value1, value2, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andRuhuReasonNotBetween(String value1, String value2) {
            addCriterion("cst_ruhu_reason not between", value1, value2, "ruhuReason");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsIsNull() {
            addCriterion("cst_live_permit_years is null");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsIsNotNull() {
            addCriterion("cst_live_permit_years is not null");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsEqualTo(String value) {
            addCriterion("cst_live_permit_years =", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsNotEqualTo(String value) {
            addCriterion("cst_live_permit_years <>", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsGreaterThan(String value) {
            addCriterion("cst_live_permit_years >", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsGreaterThanOrEqualTo(String value) {
            addCriterion("cst_live_permit_years >=", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsLessThan(String value) {
            addCriterion("cst_live_permit_years <", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsLessThanOrEqualTo(String value) {
            addCriterion("cst_live_permit_years <=", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsLike(String value) {
            addCriterion("cst_live_permit_years like", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsNotLike(String value) {
            addCriterion("cst_live_permit_years not like", value, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsIn(List<String> values) {
            addCriterion("cst_live_permit_years in", values, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsNotIn(List<String> values) {
            addCriterion("cst_live_permit_years not in", values, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsBetween(String value1, String value2) {
            addCriterion("cst_live_permit_years between", value1, value2, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andLivePermitYearsNotBetween(String value1, String value2) {
            addCriterion("cst_live_permit_years not between", value1, value2, "livePermitYears");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("cst_marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("cst_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("cst_marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("cst_marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("cst_marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("cst_marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("cst_marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("cst_marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("cst_marriage like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("cst_marriage not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("cst_marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("cst_marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("cst_marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("cst_marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andBirthControlIsNull() {
            addCriterion("cst_birth_control is null");
            return (Criteria) this;
        }

        public Criteria andBirthControlIsNotNull() {
            addCriterion("cst_birth_control is not null");
            return (Criteria) this;
        }

        public Criteria andBirthControlEqualTo(String value) {
            addCriterion("cst_birth_control =", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlNotEqualTo(String value) {
            addCriterion("cst_birth_control <>", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlGreaterThan(String value) {
            addCriterion("cst_birth_control >", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlGreaterThanOrEqualTo(String value) {
            addCriterion("cst_birth_control >=", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlLessThan(String value) {
            addCriterion("cst_birth_control <", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlLessThanOrEqualTo(String value) {
            addCriterion("cst_birth_control <=", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlLike(String value) {
            addCriterion("cst_birth_control like", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlNotLike(String value) {
            addCriterion("cst_birth_control not like", value, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlIn(List<String> values) {
            addCriterion("cst_birth_control in", values, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlNotIn(List<String> values) {
            addCriterion("cst_birth_control not in", values, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlBetween(String value1, String value2) {
            addCriterion("cst_birth_control between", value1, value2, "birthControl");
            return (Criteria) this;
        }

        public Criteria andBirthControlNotBetween(String value1, String value2) {
            addCriterion("cst_birth_control not between", value1, value2, "birthControl");
            return (Criteria) this;
        }

        public Criteria andHasHoursIsNull() {
            addCriterion("cst_has_hours is null");
            return (Criteria) this;
        }

        public Criteria andHasHoursIsNotNull() {
            addCriterion("cst_has_hours is not null");
            return (Criteria) this;
        }

        public Criteria andHasHoursEqualTo(String value) {
            addCriterion("cst_has_hours =", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursNotEqualTo(String value) {
            addCriterion("cst_has_hours <>", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursGreaterThan(String value) {
            addCriterion("cst_has_hours >", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursGreaterThanOrEqualTo(String value) {
            addCriterion("cst_has_hours >=", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursLessThan(String value) {
            addCriterion("cst_has_hours <", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursLessThanOrEqualTo(String value) {
            addCriterion("cst_has_hours <=", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursLike(String value) {
            addCriterion("cst_has_hours like", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursNotLike(String value) {
            addCriterion("cst_has_hours not like", value, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursIn(List<String> values) {
            addCriterion("cst_has_hours in", values, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursNotIn(List<String> values) {
            addCriterion("cst_has_hours not in", values, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursBetween(String value1, String value2) {
            addCriterion("cst_has_hours between", value1, value2, "hasHours");
            return (Criteria) this;
        }

        public Criteria andHasHoursNotBetween(String value1, String value2) {
            addCriterion("cst_has_hours not between", value1, value2, "hasHours");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("cst_create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("cst_create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("cst_create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("cst_create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("cst_create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cst_create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("cst_create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("cst_create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("cst_create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("cst_create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("cst_create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cst_create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("cst_status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("cst_status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("cst_status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("cst_status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("cst_status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cst_status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("cst_status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cst_status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("cst_status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("cst_status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("cst_status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cst_status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("cst_remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("cst_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("cst_remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("cst_remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("cst_remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cst_remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("cst_remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("cst_remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("cst_remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("cst_remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("cst_remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("cst_remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("cst_remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("cst_remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIsNull() {
            addCriterion("cst_source_link is null");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIsNotNull() {
            addCriterion("cst_source_link is not null");
            return (Criteria) this;
        }

        public Criteria andSourceLinkEqualTo(String value) {
            addCriterion("cst_source_link =", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotEqualTo(String value) {
            addCriterion("cst_source_link <>", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkGreaterThan(String value) {
            addCriterion("cst_source_link >", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkGreaterThanOrEqualTo(String value) {
            addCriterion("cst_source_link >=", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLessThan(String value) {
            addCriterion("cst_source_link <", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLessThanOrEqualTo(String value) {
            addCriterion("cst_source_link <=", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkLike(String value) {
            addCriterion("cst_source_link like", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotLike(String value) {
            addCriterion("cst_source_link not like", value, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkIn(List<String> values) {
            addCriterion("cst_source_link in", values, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotIn(List<String> values) {
            addCriterion("cst_source_link not in", values, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkBetween(String value1, String value2) {
            addCriterion("cst_source_link between", value1, value2, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andSourceLinkNotBetween(String value1, String value2) {
            addCriterion("cst_source_link not between", value1, value2, "sourceLink");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNull() {
            addCriterion("cst_from_platform is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNotNull() {
            addCriterion("cst_from_platform is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformEqualTo(String value) {
            addCriterion("cst_from_platform =", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotEqualTo(String value) {
            addCriterion("cst_from_platform <>", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThan(String value) {
            addCriterion("cst_from_platform >", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("cst_from_platform >=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThan(String value) {
            addCriterion("cst_from_platform <", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThanOrEqualTo(String value) {
            addCriterion("cst_from_platform <=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLike(String value) {
            addCriterion("cst_from_platform like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotLike(String value) {
            addCriterion("cst_from_platform not like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIn(List<String> values) {
            addCriterion("cst_from_platform in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotIn(List<String> values) {
            addCriterion("cst_from_platform not in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformBetween(String value1, String value2) {
            addCriterion("cst_from_platform between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotBetween(String value1, String value2) {
            addCriterion("cst_from_platform not between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractIsNull() {
            addCriterion("cst_have_labor_contract is null");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractIsNotNull() {
            addCriterion("cst_have_labor_contract is not null");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractEqualTo(String value) {
            addCriterion("cst_have_labor_contract =", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractNotEqualTo(String value) {
            addCriterion("cst_have_labor_contract <>", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractGreaterThan(String value) {
            addCriterion("cst_have_labor_contract >", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractGreaterThanOrEqualTo(String value) {
            addCriterion("cst_have_labor_contract >=", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractLessThan(String value) {
            addCriterion("cst_have_labor_contract <", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractLessThanOrEqualTo(String value) {
            addCriterion("cst_have_labor_contract <=", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractLike(String value) {
            addCriterion("cst_have_labor_contract like", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractNotLike(String value) {
            addCriterion("cst_have_labor_contract not like", value, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractIn(List<String> values) {
            addCriterion("cst_have_labor_contract in", values, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractNotIn(List<String> values) {
            addCriterion("cst_have_labor_contract not in", values, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractBetween(String value1, String value2) {
            addCriterion("cst_have_labor_contract between", value1, value2, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andHaveLaborContractNotBetween(String value1, String value2) {
            addCriterion("cst_have_labor_contract not between", value1, value2, "haveLaborContract");
            return (Criteria) this;
        }

        public Criteria andMoveAddressIsNull() {
            addCriterion("cst_move_address is null");
            return (Criteria) this;
        }

        public Criteria andMoveAddressIsNotNull() {
            addCriterion("cst_move_address is not null");
            return (Criteria) this;
        }

        public Criteria andMoveAddressEqualTo(String value) {
            addCriterion("cst_move_address =", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressNotEqualTo(String value) {
            addCriterion("cst_move_address <>", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressGreaterThan(String value) {
            addCriterion("cst_move_address >", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cst_move_address >=", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressLessThan(String value) {
            addCriterion("cst_move_address <", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressLessThanOrEqualTo(String value) {
            addCriterion("cst_move_address <=", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressLike(String value) {
            addCriterion("cst_move_address like", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressNotLike(String value) {
            addCriterion("cst_move_address not like", value, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressIn(List<String> values) {
            addCriterion("cst_move_address in", values, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressNotIn(List<String> values) {
            addCriterion("cst_move_address not in", values, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressBetween(String value1, String value2) {
            addCriterion("cst_move_address between", value1, value2, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andMoveAddressNotBetween(String value1, String value2) {
            addCriterion("cst_move_address not between", value1, value2, "moveAddress");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("cst_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("cst_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("cst_create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("cst_create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("cst_create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cst_create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("cst_create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cst_create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("cst_create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("cst_create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cst_create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cst_create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("cst_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("cst_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("cst_update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("cst_update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("cst_update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cst_update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("cst_update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cst_update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("cst_update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("cst_update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("cst_update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cst_update_time not between", value1, value2, "updateTime");
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