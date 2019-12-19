package com.galaxy.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class DishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishesExample() {
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

        public Criteria andDishesIdIsNull() {
            addCriterion("dishes_id is null");
            return (Criteria) this;
        }

        public Criteria andDishesIdIsNotNull() {
            addCriterion("dishes_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishesIdEqualTo(Integer value) {
            addCriterion("dishes_id =", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotEqualTo(Integer value) {
            addCriterion("dishes_id <>", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdGreaterThan(Integer value) {
            addCriterion("dishes_id >", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_id >=", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdLessThan(Integer value) {
            addCriterion("dishes_id <", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_id <=", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdIn(List<Integer> values) {
            addCriterion("dishes_id in", values, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotIn(List<Integer> values) {
            addCriterion("dishes_id not in", values, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdBetween(Integer value1, Integer value2) {
            addCriterion("dishes_id between", value1, value2, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_id not between", value1, value2, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesNameIsNull() {
            addCriterion("dishes_name is null");
            return (Criteria) this;
        }

        public Criteria andDishesNameIsNotNull() {
            addCriterion("dishes_name is not null");
            return (Criteria) this;
        }

        public Criteria andDishesNameEqualTo(String value) {
            addCriterion("dishes_name =", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotEqualTo(String value) {
            addCriterion("dishes_name <>", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThan(String value) {
            addCriterion("dishes_name >", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_name >=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThan(String value) {
            addCriterion("dishes_name <", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThanOrEqualTo(String value) {
            addCriterion("dishes_name <=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLike(String value) {
            addCriterion("dishes_name like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotLike(String value) {
            addCriterion("dishes_name not like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameIn(List<String> values) {
            addCriterion("dishes_name in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotIn(List<String> values) {
            addCriterion("dishes_name not in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameBetween(String value1, String value2) {
            addCriterion("dishes_name between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotBetween(String value1, String value2) {
            addCriterion("dishes_name not between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceIsNull() {
            addCriterion("dishes_introduce is null");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceIsNotNull() {
            addCriterion("dishes_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceEqualTo(String value) {
            addCriterion("dishes_introduce =", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceNotEqualTo(String value) {
            addCriterion("dishes_introduce <>", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceGreaterThan(String value) {
            addCriterion("dishes_introduce >", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_introduce >=", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceLessThan(String value) {
            addCriterion("dishes_introduce <", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceLessThanOrEqualTo(String value) {
            addCriterion("dishes_introduce <=", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceLike(String value) {
            addCriterion("dishes_introduce like", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceNotLike(String value) {
            addCriterion("dishes_introduce not like", value, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceIn(List<String> values) {
            addCriterion("dishes_introduce in", values, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceNotIn(List<String> values) {
            addCriterion("dishes_introduce not in", values, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceBetween(String value1, String value2) {
            addCriterion("dishes_introduce between", value1, value2, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesIntroduceNotBetween(String value1, String value2) {
            addCriterion("dishes_introduce not between", value1, value2, "dishesIntroduce");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationIsNull() {
            addCriterion("dishes_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationIsNotNull() {
            addCriterion("dishes_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationEqualTo(String value) {
            addCriterion("dishes_evaluation =", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationNotEqualTo(String value) {
            addCriterion("dishes_evaluation <>", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationGreaterThan(String value) {
            addCriterion("dishes_evaluation >", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_evaluation >=", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationLessThan(String value) {
            addCriterion("dishes_evaluation <", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationLessThanOrEqualTo(String value) {
            addCriterion("dishes_evaluation <=", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationLike(String value) {
            addCriterion("dishes_evaluation like", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationNotLike(String value) {
            addCriterion("dishes_evaluation not like", value, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationIn(List<String> values) {
            addCriterion("dishes_evaluation in", values, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationNotIn(List<String> values) {
            addCriterion("dishes_evaluation not in", values, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationBetween(String value1, String value2) {
            addCriterion("dishes_evaluation between", value1, value2, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesEvaluationNotBetween(String value1, String value2) {
            addCriterion("dishes_evaluation not between", value1, value2, "dishesEvaluation");
            return (Criteria) this;
        }

        public Criteria andDishesCodeIsNull() {
            addCriterion("dishes_code is null");
            return (Criteria) this;
        }

        public Criteria andDishesCodeIsNotNull() {
            addCriterion("dishes_code is not null");
            return (Criteria) this;
        }

        public Criteria andDishesCodeEqualTo(Integer value) {
            addCriterion("dishes_code =", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeNotEqualTo(Integer value) {
            addCriterion("dishes_code <>", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeGreaterThan(Integer value) {
            addCriterion("dishes_code >", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_code >=", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeLessThan(Integer value) {
            addCriterion("dishes_code <", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_code <=", value, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeIn(List<Integer> values) {
            addCriterion("dishes_code in", values, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeNotIn(List<Integer> values) {
            addCriterion("dishes_code not in", values, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeBetween(Integer value1, Integer value2) {
            addCriterion("dishes_code between", value1, value2, "dishesCode");
            return (Criteria) this;
        }

        public Criteria andDishesCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_code not between", value1, value2, "dishesCode");
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