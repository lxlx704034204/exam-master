package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRuleExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TbRuleExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaotiidIsNull() {
            addCriterion("taotiId is null");
            return (Criteria) this;
        }

        public Criteria andTaotiidIsNotNull() {
            addCriterion("taotiId is not null");
            return (Criteria) this;
        }

        public Criteria andTaotiidEqualTo(Integer value) {
            addCriterion("taotiId =", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotEqualTo(Integer value) {
            addCriterion("taotiId <>", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidGreaterThan(Integer value) {
            addCriterion("taotiId >", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taotiId >=", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidLessThan(Integer value) {
            addCriterion("taotiId <", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidLessThanOrEqualTo(Integer value) {
            addCriterion("taotiId <=", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidIn(List<Integer> values) {
            addCriterion("taotiId in", values, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotIn(List<Integer> values) {
            addCriterion("taotiId not in", values, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidBetween(Integer value1, Integer value2) {
            addCriterion("taotiId between", value1, value2, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotBetween(Integer value1, Integer value2) {
            addCriterion("taotiId not between", value1, value2, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTotalmarkIsNull() {
            addCriterion("totalMark is null");
            return (Criteria) this;
        }

        public Criteria andTotalmarkIsNotNull() {
            addCriterion("totalMark is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmarkEqualTo(Integer value) {
            addCriterion("totalMark =", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkNotEqualTo(Integer value) {
            addCriterion("totalMark <>", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkGreaterThan(Integer value) {
            addCriterion("totalMark >", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalMark >=", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkLessThan(Integer value) {
            addCriterion("totalMark <", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkLessThanOrEqualTo(Integer value) {
            addCriterion("totalMark <=", value, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkIn(List<Integer> values) {
            addCriterion("totalMark in", values, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkNotIn(List<Integer> values) {
            addCriterion("totalMark not in", values, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkBetween(Integer value1, Integer value2) {
            addCriterion("totalMark between", value1, value2, "totalmark");
            return (Criteria) this;
        }

        public Criteria andTotalmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("totalMark not between", value1, value2, "totalmark");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(Double value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(Double value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(Double value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(Double value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(Double value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(Double value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<Double> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<Double> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(Double value1, Double value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(Double value1, Double value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andSinglenumIsNull() {
            addCriterion("singleNum is null");
            return (Criteria) this;
        }

        public Criteria andSinglenumIsNotNull() {
            addCriterion("singleNum is not null");
            return (Criteria) this;
        }

        public Criteria andSinglenumEqualTo(Integer value) {
            addCriterion("singleNum =", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotEqualTo(Integer value) {
            addCriterion("singleNum <>", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumGreaterThan(Integer value) {
            addCriterion("singleNum >", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleNum >=", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumLessThan(Integer value) {
            addCriterion("singleNum <", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumLessThanOrEqualTo(Integer value) {
            addCriterion("singleNum <=", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumIn(List<Integer> values) {
            addCriterion("singleNum in", values, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotIn(List<Integer> values) {
            addCriterion("singleNum not in", values, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumBetween(Integer value1, Integer value2) {
            addCriterion("singleNum between", value1, value2, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotBetween(Integer value1, Integer value2) {
            addCriterion("singleNum not between", value1, value2, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglescoreIsNull() {
            addCriterion("singleScore is null");
            return (Criteria) this;
        }

        public Criteria andSinglescoreIsNotNull() {
            addCriterion("singleScore is not null");
            return (Criteria) this;
        }

        public Criteria andSinglescoreEqualTo(Integer value) {
            addCriterion("singleScore =", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreNotEqualTo(Integer value) {
            addCriterion("singleScore <>", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreGreaterThan(Integer value) {
            addCriterion("singleScore >", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleScore >=", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreLessThan(Integer value) {
            addCriterion("singleScore <", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreLessThanOrEqualTo(Integer value) {
            addCriterion("singleScore <=", value, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreIn(List<Integer> values) {
            addCriterion("singleScore in", values, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreNotIn(List<Integer> values) {
            addCriterion("singleScore not in", values, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreBetween(Integer value1, Integer value2) {
            addCriterion("singleScore between", value1, value2, "singlescore");
            return (Criteria) this;
        }

        public Criteria andSinglescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("singleScore not between", value1, value2, "singlescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreIsNull() {
            addCriterion("multipleScore is null");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreIsNotNull() {
            addCriterion("multipleScore is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreEqualTo(Integer value) {
            addCriterion("multipleScore =", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreNotEqualTo(Integer value) {
            addCriterion("multipleScore <>", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreGreaterThan(Integer value) {
            addCriterion("multipleScore >", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("multipleScore >=", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreLessThan(Integer value) {
            addCriterion("multipleScore <", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreLessThanOrEqualTo(Integer value) {
            addCriterion("multipleScore <=", value, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreIn(List<Integer> values) {
            addCriterion("multipleScore in", values, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreNotIn(List<Integer> values) {
            addCriterion("multipleScore not in", values, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreBetween(Integer value1, Integer value2) {
            addCriterion("multipleScore between", value1, value2, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("multipleScore not between", value1, value2, "multiplescore");
            return (Criteria) this;
        }

        public Criteria andMultiplenumIsNull() {
            addCriterion("multipleNum is null");
            return (Criteria) this;
        }

        public Criteria andMultiplenumIsNotNull() {
            addCriterion("multipleNum is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplenumEqualTo(Integer value) {
            addCriterion("multipleNum =", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumNotEqualTo(Integer value) {
            addCriterion("multipleNum <>", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumGreaterThan(Integer value) {
            addCriterion("multipleNum >", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("multipleNum >=", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumLessThan(Integer value) {
            addCriterion("multipleNum <", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumLessThanOrEqualTo(Integer value) {
            addCriterion("multipleNum <=", value, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumIn(List<Integer> values) {
            addCriterion("multipleNum in", values, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumNotIn(List<Integer> values) {
            addCriterion("multipleNum not in", values, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumBetween(Integer value1, Integer value2) {
            addCriterion("multipleNum between", value1, value2, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andMultiplenumNotBetween(Integer value1, Integer value2) {
            addCriterion("multipleNum not between", value1, value2, "multiplenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumIsNull() {
            addCriterion("completeNum is null");
            return (Criteria) this;
        }

        public Criteria andCompletenumIsNotNull() {
            addCriterion("completeNum is not null");
            return (Criteria) this;
        }

        public Criteria andCompletenumEqualTo(Integer value) {
            addCriterion("completeNum =", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumNotEqualTo(Integer value) {
            addCriterion("completeNum <>", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumGreaterThan(Integer value) {
            addCriterion("completeNum >", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("completeNum >=", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumLessThan(Integer value) {
            addCriterion("completeNum <", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumLessThanOrEqualTo(Integer value) {
            addCriterion("completeNum <=", value, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumIn(List<Integer> values) {
            addCriterion("completeNum in", values, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumNotIn(List<Integer> values) {
            addCriterion("completeNum not in", values, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumBetween(Integer value1, Integer value2) {
            addCriterion("completeNum between", value1, value2, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletenumNotBetween(Integer value1, Integer value2) {
            addCriterion("completeNum not between", value1, value2, "completenum");
            return (Criteria) this;
        }

        public Criteria andCompletescoreIsNull() {
            addCriterion("completeScore is null");
            return (Criteria) this;
        }

        public Criteria andCompletescoreIsNotNull() {
            addCriterion("completeScore is not null");
            return (Criteria) this;
        }

        public Criteria andCompletescoreEqualTo(Integer value) {
            addCriterion("completeScore =", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreNotEqualTo(Integer value) {
            addCriterion("completeScore <>", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreGreaterThan(Integer value) {
            addCriterion("completeScore >", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("completeScore >=", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreLessThan(Integer value) {
            addCriterion("completeScore <", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreLessThanOrEqualTo(Integer value) {
            addCriterion("completeScore <=", value, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreIn(List<Integer> values) {
            addCriterion("completeScore in", values, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreNotIn(List<Integer> values) {
            addCriterion("completeScore not in", values, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreBetween(Integer value1, Integer value2) {
            addCriterion("completeScore between", value1, value2, "completescore");
            return (Criteria) this;
        }

        public Criteria andCompletescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("completeScore not between", value1, value2, "completescore");
            return (Criteria) this;
        }

        public Criteria andCalculationnumIsNull() {
            addCriterion("CalculationNum is null");
            return (Criteria) this;
        }

        public Criteria andCalculationnumIsNotNull() {
            addCriterion("CalculationNum is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationnumEqualTo(Integer value) {
            addCriterion("CalculationNum =", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumNotEqualTo(Integer value) {
            addCriterion("CalculationNum <>", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumGreaterThan(Integer value) {
            addCriterion("CalculationNum >", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CalculationNum >=", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumLessThan(Integer value) {
            addCriterion("CalculationNum <", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumLessThanOrEqualTo(Integer value) {
            addCriterion("CalculationNum <=", value, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumIn(List<Integer> values) {
            addCriterion("CalculationNum in", values, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumNotIn(List<Integer> values) {
            addCriterion("CalculationNum not in", values, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumBetween(Integer value1, Integer value2) {
            addCriterion("CalculationNum between", value1, value2, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationnumNotBetween(Integer value1, Integer value2) {
            addCriterion("CalculationNum not between", value1, value2, "calculationnum");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreIsNull() {
            addCriterion("CalculationScore is null");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreIsNotNull() {
            addCriterion("CalculationScore is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreEqualTo(Integer value) {
            addCriterion("CalculationScore =", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreNotEqualTo(Integer value) {
            addCriterion("CalculationScore <>", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreGreaterThan(Integer value) {
            addCriterion("CalculationScore >", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("CalculationScore >=", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreLessThan(Integer value) {
            addCriterion("CalculationScore <", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreLessThanOrEqualTo(Integer value) {
            addCriterion("CalculationScore <=", value, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreIn(List<Integer> values) {
            addCriterion("CalculationScore in", values, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreNotIn(List<Integer> values) {
            addCriterion("CalculationScore not in", values, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreBetween(Integer value1, Integer value2) {
            addCriterion("CalculationScore between", value1, value2, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andCalculationscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("CalculationScore not between", value1, value2, "calculationscore");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumIsNull() {
            addCriterion("subjectiveNum is null");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumIsNotNull() {
            addCriterion("subjectiveNum is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumEqualTo(Integer value) {
            addCriterion("subjectiveNum =", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumNotEqualTo(Integer value) {
            addCriterion("subjectiveNum <>", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumGreaterThan(Integer value) {
            addCriterion("subjectiveNum >", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectiveNum >=", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumLessThan(Integer value) {
            addCriterion("subjectiveNum <", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumLessThanOrEqualTo(Integer value) {
            addCriterion("subjectiveNum <=", value, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumIn(List<Integer> values) {
            addCriterion("subjectiveNum in", values, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumNotIn(List<Integer> values) {
            addCriterion("subjectiveNum not in", values, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumBetween(Integer value1, Integer value2) {
            addCriterion("subjectiveNum between", value1, value2, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivenumNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectiveNum not between", value1, value2, "subjectivenum");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIsNull() {
            addCriterion("subjectiveScore is null");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIsNotNull() {
            addCriterion("subjectiveScore is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreEqualTo(Integer value) {
            addCriterion("subjectiveScore =", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotEqualTo(Integer value) {
            addCriterion("subjectiveScore <>", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreGreaterThan(Integer value) {
            addCriterion("subjectiveScore >", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectiveScore >=", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreLessThan(Integer value) {
            addCriterion("subjectiveScore <", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreLessThanOrEqualTo(Integer value) {
            addCriterion("subjectiveScore <=", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIn(List<Integer> values) {
            addCriterion("subjectiveScore in", values, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotIn(List<Integer> values) {
            addCriterion("subjectiveScore not in", values, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreBetween(Integer value1, Integer value2) {
            addCriterion("subjectiveScore between", value1, value2, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectiveScore not between", value1, value2, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRulenameIsNull() {
            addCriterion("ruleName is null");
            return (Criteria) this;
        }

        public Criteria andRulenameIsNotNull() {
            addCriterion("ruleName is not null");
            return (Criteria) this;
        }

        public Criteria andRulenameEqualTo(String value) {
            addCriterion("ruleName =", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotEqualTo(String value) {
            addCriterion("ruleName <>", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThan(String value) {
            addCriterion("ruleName >", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThanOrEqualTo(String value) {
            addCriterion("ruleName >=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThan(String value) {
            addCriterion("ruleName <", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThanOrEqualTo(String value) {
            addCriterion("ruleName <=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLike(String value) {
            addCriterion("ruleName like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotLike(String value) {
            addCriterion("ruleName not like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameIn(List<String> values) {
            addCriterion("ruleName in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotIn(List<String> values) {
            addCriterion("ruleName not in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameBetween(String value1, String value2) {
            addCriterion("ruleName between", value1, value2, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotBetween(String value1, String value2) {
            addCriterion("ruleName not between", value1, value2, "rulename");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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