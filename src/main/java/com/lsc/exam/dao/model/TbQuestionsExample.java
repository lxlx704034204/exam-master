package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbQuestionsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TbQuestionsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andPointidIsNull() {
            addCriterion("pointId is null");
            return (Criteria) this;
        }

        public Criteria andPointidIsNotNull() {
            addCriterion("pointId is not null");
            return (Criteria) this;
        }

        public Criteria andPointidEqualTo(String value) {
            addCriterion("pointId =", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotEqualTo(String value) {
            addCriterion("pointId <>", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidGreaterThan(String value) {
            addCriterion("pointId >", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidGreaterThanOrEqualTo(String value) {
            addCriterion("pointId >=", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidLessThan(String value) {
            addCriterion("pointId <", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidLessThanOrEqualTo(String value) {
            addCriterion("pointId <=", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidLike(String value) {
            addCriterion("pointId like", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotLike(String value) {
            addCriterion("pointId not like", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidIn(List<String> values) {
            addCriterion("pointId in", values, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotIn(List<String> values) {
            addCriterion("pointId not in", values, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidBetween(String value1, String value2) {
            addCriterion("pointId between", value1, value2, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotBetween(String value1, String value2) {
            addCriterion("pointId not between", value1, value2, "pointid");
            return (Criteria) this;
        }

        public Criteria andChoice1IsNull() {
            addCriterion("choice1 is null");
            return (Criteria) this;
        }

        public Criteria andChoice1IsNotNull() {
            addCriterion("choice1 is not null");
            return (Criteria) this;
        }

        public Criteria andChoice1EqualTo(String value) {
            addCriterion("choice1 =", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1NotEqualTo(String value) {
            addCriterion("choice1 <>", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1GreaterThan(String value) {
            addCriterion("choice1 >", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1GreaterThanOrEqualTo(String value) {
            addCriterion("choice1 >=", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1LessThan(String value) {
            addCriterion("choice1 <", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1LessThanOrEqualTo(String value) {
            addCriterion("choice1 <=", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1Like(String value) {
            addCriterion("choice1 like", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1NotLike(String value) {
            addCriterion("choice1 not like", value, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1In(List<String> values) {
            addCriterion("choice1 in", values, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1NotIn(List<String> values) {
            addCriterion("choice1 not in", values, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1Between(String value1, String value2) {
            addCriterion("choice1 between", value1, value2, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice1NotBetween(String value1, String value2) {
            addCriterion("choice1 not between", value1, value2, "choice1");
            return (Criteria) this;
        }

        public Criteria andChoice2IsNull() {
            addCriterion("choice2 is null");
            return (Criteria) this;
        }

        public Criteria andChoice2IsNotNull() {
            addCriterion("choice2 is not null");
            return (Criteria) this;
        }

        public Criteria andChoice2EqualTo(String value) {
            addCriterion("choice2 =", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2NotEqualTo(String value) {
            addCriterion("choice2 <>", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2GreaterThan(String value) {
            addCriterion("choice2 >", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2GreaterThanOrEqualTo(String value) {
            addCriterion("choice2 >=", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2LessThan(String value) {
            addCriterion("choice2 <", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2LessThanOrEqualTo(String value) {
            addCriterion("choice2 <=", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2Like(String value) {
            addCriterion("choice2 like", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2NotLike(String value) {
            addCriterion("choice2 not like", value, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2In(List<String> values) {
            addCriterion("choice2 in", values, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2NotIn(List<String> values) {
            addCriterion("choice2 not in", values, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2Between(String value1, String value2) {
            addCriterion("choice2 between", value1, value2, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice2NotBetween(String value1, String value2) {
            addCriterion("choice2 not between", value1, value2, "choice2");
            return (Criteria) this;
        }

        public Criteria andChoice3IsNull() {
            addCriterion("choice3 is null");
            return (Criteria) this;
        }

        public Criteria andChoice3IsNotNull() {
            addCriterion("choice3 is not null");
            return (Criteria) this;
        }

        public Criteria andChoice3EqualTo(String value) {
            addCriterion("choice3 =", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3NotEqualTo(String value) {
            addCriterion("choice3 <>", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3GreaterThan(String value) {
            addCriterion("choice3 >", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3GreaterThanOrEqualTo(String value) {
            addCriterion("choice3 >=", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3LessThan(String value) {
            addCriterion("choice3 <", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3LessThanOrEqualTo(String value) {
            addCriterion("choice3 <=", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3Like(String value) {
            addCriterion("choice3 like", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3NotLike(String value) {
            addCriterion("choice3 not like", value, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3In(List<String> values) {
            addCriterion("choice3 in", values, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3NotIn(List<String> values) {
            addCriterion("choice3 not in", values, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3Between(String value1, String value2) {
            addCriterion("choice3 between", value1, value2, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice3NotBetween(String value1, String value2) {
            addCriterion("choice3 not between", value1, value2, "choice3");
            return (Criteria) this;
        }

        public Criteria andChoice4IsNull() {
            addCriterion("choice4 is null");
            return (Criteria) this;
        }

        public Criteria andChoice4IsNotNull() {
            addCriterion("choice4 is not null");
            return (Criteria) this;
        }

        public Criteria andChoice4EqualTo(String value) {
            addCriterion("choice4 =", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4NotEqualTo(String value) {
            addCriterion("choice4 <>", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4GreaterThan(String value) {
            addCriterion("choice4 >", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4GreaterThanOrEqualTo(String value) {
            addCriterion("choice4 >=", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4LessThan(String value) {
            addCriterion("choice4 <", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4LessThanOrEqualTo(String value) {
            addCriterion("choice4 <=", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4Like(String value) {
            addCriterion("choice4 like", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4NotLike(String value) {
            addCriterion("choice4 not like", value, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4In(List<String> values) {
            addCriterion("choice4 in", values, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4NotIn(List<String> values) {
            addCriterion("choice4 not in", values, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4Between(String value1, String value2) {
            addCriterion("choice4 between", value1, value2, "choice4");
            return (Criteria) this;
        }

        public Criteria andChoice4NotBetween(String value1, String value2) {
            addCriterion("choice4 not between", value1, value2, "choice4");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameIsNull() {
            addCriterion("knowledgeName is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameIsNotNull() {
            addCriterion("knowledgeName is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameEqualTo(String value) {
            addCriterion("knowledgeName =", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameNotEqualTo(String value) {
            addCriterion("knowledgeName <>", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameGreaterThan(String value) {
            addCriterion("knowledgeName >", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameGreaterThanOrEqualTo(String value) {
            addCriterion("knowledgeName >=", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameLessThan(String value) {
            addCriterion("knowledgeName <", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameLessThanOrEqualTo(String value) {
            addCriterion("knowledgeName <=", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameLike(String value) {
            addCriterion("knowledgeName like", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameNotLike(String value) {
            addCriterion("knowledgeName not like", value, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameIn(List<String> values) {
            addCriterion("knowledgeName in", values, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameNotIn(List<String> values) {
            addCriterion("knowledgeName not in", values, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameBetween(String value1, String value2) {
            addCriterion("knowledgeName between", value1, value2, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andKnowledgenameNotBetween(String value1, String value2) {
            addCriterion("knowledgeName not between", value1, value2, "knowledgename");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andLessonidIsNull() {
            addCriterion("lessonid is null");
            return (Criteria) this;
        }

        public Criteria andLessonidIsNotNull() {
            addCriterion("lessonid is not null");
            return (Criteria) this;
        }

        public Criteria andLessonidEqualTo(Integer value) {
            addCriterion("lessonid =", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotEqualTo(Integer value) {
            addCriterion("lessonid <>", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThan(Integer value) {
            addCriterion("lessonid >", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonid >=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThan(Integer value) {
            addCriterion("lessonid <", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThanOrEqualTo(Integer value) {
            addCriterion("lessonid <=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidIn(List<Integer> values) {
            addCriterion("lessonid in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotIn(List<Integer> values) {
            addCriterion("lessonid not in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidBetween(Integer value1, Integer value2) {
            addCriterion("lessonid between", value1, value2, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonid not between", value1, value2, "lessonid");
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