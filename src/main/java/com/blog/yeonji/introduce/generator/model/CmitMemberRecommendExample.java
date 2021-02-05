package com.blog.yeonji.introduce.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmitMemberRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmitMemberRecommendExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andRM_SKEYIsNull() {
            addCriterion("RM_SKEY is null");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYIsNotNull() {
            addCriterion("RM_SKEY is not null");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYEqualTo(Integer value) {
            addCriterion("RM_SKEY =", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYNotEqualTo(Integer value) {
            addCriterion("RM_SKEY <>", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYGreaterThan(Integer value) {
            addCriterion("RM_SKEY >", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("RM_SKEY >=", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYLessThan(Integer value) {
            addCriterion("RM_SKEY <", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYLessThanOrEqualTo(Integer value) {
            addCriterion("RM_SKEY <=", value, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYIn(List<Integer> values) {
            addCriterion("RM_SKEY in", values, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYNotIn(List<Integer> values) {
            addCriterion("RM_SKEY not in", values, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYBetween(Integer value1, Integer value2) {
            addCriterion("RM_SKEY between", value1, value2, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_SKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("RM_SKEY not between", value1, value2, "RM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYIsNull() {
            addCriterion("MEM_SKEY is null");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYIsNotNull() {
            addCriterion("MEM_SKEY is not null");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYEqualTo(Integer value) {
            addCriterion("MEM_SKEY =", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYNotEqualTo(Integer value) {
            addCriterion("MEM_SKEY <>", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYGreaterThan(Integer value) {
            addCriterion("MEM_SKEY >", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_SKEY >=", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYLessThan(Integer value) {
            addCriterion("MEM_SKEY <", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_SKEY <=", value, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYIn(List<Integer> values) {
            addCriterion("MEM_SKEY in", values, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYNotIn(List<Integer> values) {
            addCriterion("MEM_SKEY not in", values, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYBetween(Integer value1, Integer value2) {
            addCriterion("MEM_SKEY between", value1, value2, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andMEM_SKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_SKEY not between", value1, value2, "MEM_SKEY");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1IsNull() {
            addCriterion("RM_MEMBER1 is null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1IsNotNull() {
            addCriterion("RM_MEMBER1 is not null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1EqualTo(String value) {
            addCriterion("RM_MEMBER1 =", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1NotEqualTo(String value) {
            addCriterion("RM_MEMBER1 <>", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1GreaterThan(String value) {
            addCriterion("RM_MEMBER1 >", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1GreaterThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER1 >=", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1LessThan(String value) {
            addCriterion("RM_MEMBER1 <", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1LessThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER1 <=", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1Like(String value) {
            addCriterion("RM_MEMBER1 like", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1NotLike(String value) {
            addCriterion("RM_MEMBER1 not like", value, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1In(List<String> values) {
            addCriterion("RM_MEMBER1 in", values, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1NotIn(List<String> values) {
            addCriterion("RM_MEMBER1 not in", values, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1Between(String value1, String value2) {
            addCriterion("RM_MEMBER1 between", value1, value2, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER1NotBetween(String value1, String value2) {
            addCriterion("RM_MEMBER1 not between", value1, value2, "RM_MEMBER1");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2IsNull() {
            addCriterion("RM_MEMBER2 is null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2IsNotNull() {
            addCriterion("RM_MEMBER2 is not null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2EqualTo(String value) {
            addCriterion("RM_MEMBER2 =", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2NotEqualTo(String value) {
            addCriterion("RM_MEMBER2 <>", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2GreaterThan(String value) {
            addCriterion("RM_MEMBER2 >", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2GreaterThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER2 >=", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2LessThan(String value) {
            addCriterion("RM_MEMBER2 <", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2LessThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER2 <=", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2Like(String value) {
            addCriterion("RM_MEMBER2 like", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2NotLike(String value) {
            addCriterion("RM_MEMBER2 not like", value, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2In(List<String> values) {
            addCriterion("RM_MEMBER2 in", values, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2NotIn(List<String> values) {
            addCriterion("RM_MEMBER2 not in", values, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2Between(String value1, String value2) {
            addCriterion("RM_MEMBER2 between", value1, value2, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER2NotBetween(String value1, String value2) {
            addCriterion("RM_MEMBER2 not between", value1, value2, "RM_MEMBER2");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3IsNull() {
            addCriterion("RM_MEMBER3 is null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3IsNotNull() {
            addCriterion("RM_MEMBER3 is not null");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3EqualTo(String value) {
            addCriterion("RM_MEMBER3 =", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3NotEqualTo(String value) {
            addCriterion("RM_MEMBER3 <>", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3GreaterThan(String value) {
            addCriterion("RM_MEMBER3 >", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3GreaterThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER3 >=", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3LessThan(String value) {
            addCriterion("RM_MEMBER3 <", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3LessThanOrEqualTo(String value) {
            addCriterion("RM_MEMBER3 <=", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3Like(String value) {
            addCriterion("RM_MEMBER3 like", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3NotLike(String value) {
            addCriterion("RM_MEMBER3 not like", value, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3In(List<String> values) {
            addCriterion("RM_MEMBER3 in", values, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3NotIn(List<String> values) {
            addCriterion("RM_MEMBER3 not in", values, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3Between(String value1, String value2) {
            addCriterion("RM_MEMBER3 between", value1, value2, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andRM_MEMBER3NotBetween(String value1, String value2) {
            addCriterion("RM_MEMBER3 not between", value1, value2, "RM_MEMBER3");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTIsNull() {
            addCriterion("CREATED_DT is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTIsNotNull() {
            addCriterion("CREATED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTEqualTo(Date value) {
            addCriterion("CREATED_DT =", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTNotEqualTo(Date value) {
            addCriterion("CREATED_DT <>", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTGreaterThan(Date value) {
            addCriterion("CREATED_DT >", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DT >=", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTLessThan(Date value) {
            addCriterion("CREATED_DT <", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DT <=", value, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTIn(List<Date> values) {
            addCriterion("CREATED_DT in", values, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTNotIn(List<Date> values) {
            addCriterion("CREATED_DT not in", values, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTBetween(Date value1, Date value2) {
            addCriterion("CREATED_DT between", value1, value2, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATED_DTNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DT not between", value1, value2, "CREATED_DT");
            return (Criteria) this;
        }

        public Criteria andCREATORIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCREATORIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCREATOREqualTo(Integer value) {
            addCriterion("CREATOR =", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotEqualTo(Integer value) {
            addCriterion("CREATOR <>", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORGreaterThan(Integer value) {
            addCriterion("CREATOR >", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR >=", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORLessThan(Integer value) {
            addCriterion("CREATOR <", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR <=", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORIn(List<Integer> values) {
            addCriterion("CREATOR in", values, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotIn(List<Integer> values) {
            addCriterion("CREATOR not in", values, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR between", value1, value2, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR not between", value1, value2, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTIsNull() {
            addCriterion("LAST_MODIFIED_DT is null");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTIsNotNull() {
            addCriterion("LAST_MODIFIED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DT =", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DT <>", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DT >", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DT >=", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DT <", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DT <=", value, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DT in", values, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DT not in", values, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DT between", value1, value2, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIED_DTNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DT not between", value1, value2, "LAST_MODIFIED_DT");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERIsNull() {
            addCriterion("LAST_MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERIsNotNull() {
            addCriterion("LAST_MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIEREqualTo(Integer value) {
            addCriterion("LAST_MODIFIER =", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERNotEqualTo(Integer value) {
            addCriterion("LAST_MODIFIER <>", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERGreaterThan(Integer value) {
            addCriterion("LAST_MODIFIER >", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIER >=", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERLessThan(Integer value) {
            addCriterion("LAST_MODIFIER <", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIER <=", value, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERIn(List<Integer> values) {
            addCriterion("LAST_MODIFIER in", values, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERNotIn(List<Integer> values) {
            addCriterion("LAST_MODIFIER not in", values, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIER between", value1, value2, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andLAST_MODIFIERNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIER not between", value1, value2, "LAST_MODIFIER");
            return (Criteria) this;
        }

        public Criteria andNOTEIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNOTEIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNOTEEqualTo(String value) {
            addCriterion("NOTE =", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTENotEqualTo(String value) {
            addCriterion("NOTE <>", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTEGreaterThan(String value) {
            addCriterion("NOTE >", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTEGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTELessThan(String value) {
            addCriterion("NOTE <", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTELessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTELike(String value) {
            addCriterion("NOTE like", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTENotLike(String value) {
            addCriterion("NOTE not like", value, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTEIn(List<String> values) {
            addCriterion("NOTE in", values, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTENotIn(List<String> values) {
            addCriterion("NOTE not in", values, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTEBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "NOTE");
            return (Criteria) this;
        }

        public Criteria andNOTENotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "NOTE");
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