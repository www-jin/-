package com.galaxy.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlIsNull() {
            addCriterion("store_ImgUrl is null");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlIsNotNull() {
            addCriterion("store_ImgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlEqualTo(String value) {
            addCriterion("store_ImgUrl =", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlNotEqualTo(String value) {
            addCriterion("store_ImgUrl <>", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlGreaterThan(String value) {
            addCriterion("store_ImgUrl >", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("store_ImgUrl >=", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlLessThan(String value) {
            addCriterion("store_ImgUrl <", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlLessThanOrEqualTo(String value) {
            addCriterion("store_ImgUrl <=", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlLike(String value) {
            addCriterion("store_ImgUrl like", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlNotLike(String value) {
            addCriterion("store_ImgUrl not like", value, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlIn(List<String> values) {
            addCriterion("store_ImgUrl in", values, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlNotIn(List<String> values) {
            addCriterion("store_ImgUrl not in", values, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlBetween(String value1, String value2) {
            addCriterion("store_ImgUrl between", value1, value2, "storeImgurl");
            return (Criteria) this;
        }

        public Criteria andStoreImgurlNotBetween(String value1, String value2) {
            addCriterion("store_ImgUrl not between", value1, value2, "storeImgurl");
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

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSalemonthIsNull() {
            addCriterion("saleMonth is null");
            return (Criteria) this;
        }

        public Criteria andSalemonthIsNotNull() {
            addCriterion("saleMonth is not null");
            return (Criteria) this;
        }

        public Criteria andSalemonthEqualTo(String value) {
            addCriterion("saleMonth =", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthNotEqualTo(String value) {
            addCriterion("saleMonth <>", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthGreaterThan(String value) {
            addCriterion("saleMonth >", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthGreaterThanOrEqualTo(String value) {
            addCriterion("saleMonth >=", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthLessThan(String value) {
            addCriterion("saleMonth <", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthLessThanOrEqualTo(String value) {
            addCriterion("saleMonth <=", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthLike(String value) {
            addCriterion("saleMonth like", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthNotLike(String value) {
            addCriterion("saleMonth not like", value, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthIn(List<String> values) {
            addCriterion("saleMonth in", values, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthNotIn(List<String> values) {
            addCriterion("saleMonth not in", values, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthBetween(String value1, String value2) {
            addCriterion("saleMonth between", value1, value2, "salemonth");
            return (Criteria) this;
        }

        public Criteria andSalemonthNotBetween(String value1, String value2) {
            addCriterion("saleMonth not between", value1, value2, "salemonth");
            return (Criteria) this;
        }

        public Criteria andMindelpriceIsNull() {
            addCriterion("minDelPrice is null");
            return (Criteria) this;
        }

        public Criteria andMindelpriceIsNotNull() {
            addCriterion("minDelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMindelpriceEqualTo(String value) {
            addCriterion("minDelPrice =", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceNotEqualTo(String value) {
            addCriterion("minDelPrice <>", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceGreaterThan(String value) {
            addCriterion("minDelPrice >", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceGreaterThanOrEqualTo(String value) {
            addCriterion("minDelPrice >=", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceLessThan(String value) {
            addCriterion("minDelPrice <", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceLessThanOrEqualTo(String value) {
            addCriterion("minDelPrice <=", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceLike(String value) {
            addCriterion("minDelPrice like", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceNotLike(String value) {
            addCriterion("minDelPrice not like", value, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceIn(List<String> values) {
            addCriterion("minDelPrice in", values, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceNotIn(List<String> values) {
            addCriterion("minDelPrice not in", values, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceBetween(String value1, String value2) {
            addCriterion("minDelPrice between", value1, value2, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andMindelpriceNotBetween(String value1, String value2) {
            addCriterion("minDelPrice not between", value1, value2, "mindelprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceIsNull() {
            addCriterion("delPrice is null");
            return (Criteria) this;
        }

        public Criteria andDelpriceIsNotNull() {
            addCriterion("delPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDelpriceEqualTo(String value) {
            addCriterion("delPrice =", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceNotEqualTo(String value) {
            addCriterion("delPrice <>", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceGreaterThan(String value) {
            addCriterion("delPrice >", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceGreaterThanOrEqualTo(String value) {
            addCriterion("delPrice >=", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceLessThan(String value) {
            addCriterion("delPrice <", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceLessThanOrEqualTo(String value) {
            addCriterion("delPrice <=", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceLike(String value) {
            addCriterion("delPrice like", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceNotLike(String value) {
            addCriterion("delPrice not like", value, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceIn(List<String> values) {
            addCriterion("delPrice in", values, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceNotIn(List<String> values) {
            addCriterion("delPrice not in", values, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceBetween(String value1, String value2) {
            addCriterion("delPrice between", value1, value2, "delprice");
            return (Criteria) this;
        }

        public Criteria andDelpriceNotBetween(String value1, String value2) {
            addCriterion("delPrice not between", value1, value2, "delprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNull() {
            addCriterion("averagePrice is null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNotNull() {
            addCriterion("averagePrice is not null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceEqualTo(String value) {
            addCriterion("averagePrice =", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotEqualTo(String value) {
            addCriterion("averagePrice <>", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThan(String value) {
            addCriterion("averagePrice >", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThanOrEqualTo(String value) {
            addCriterion("averagePrice >=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThan(String value) {
            addCriterion("averagePrice <", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThanOrEqualTo(String value) {
            addCriterion("averagePrice <=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLike(String value) {
            addCriterion("averagePrice like", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotLike(String value) {
            addCriterion("averagePrice not like", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIn(List<String> values) {
            addCriterion("averagePrice in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotIn(List<String> values) {
            addCriterion("averagePrice not in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceBetween(String value1, String value2) {
            addCriterion("averagePrice between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotBetween(String value1, String value2) {
            addCriterion("averagePrice not between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andDeltimeIsNull() {
            addCriterion("delTime is null");
            return (Criteria) this;
        }

        public Criteria andDeltimeIsNotNull() {
            addCriterion("delTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeltimeEqualTo(String value) {
            addCriterion("delTime =", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeNotEqualTo(String value) {
            addCriterion("delTime <>", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeGreaterThan(String value) {
            addCriterion("delTime >", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeGreaterThanOrEqualTo(String value) {
            addCriterion("delTime >=", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeLessThan(String value) {
            addCriterion("delTime <", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeLessThanOrEqualTo(String value) {
            addCriterion("delTime <=", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeLike(String value) {
            addCriterion("delTime like", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeNotLike(String value) {
            addCriterion("delTime not like", value, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeIn(List<String> values) {
            addCriterion("delTime in", values, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeNotIn(List<String> values) {
            addCriterion("delTime not in", values, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeBetween(String value1, String value2) {
            addCriterion("delTime between", value1, value2, "deltime");
            return (Criteria) this;
        }

        public Criteria andDeltimeNotBetween(String value1, String value2) {
            addCriterion("delTime not between", value1, value2, "deltime");
            return (Criteria) this;
        }

        public Criteria andPublicmsgIsNull() {
            addCriterion("publicMsg is null");
            return (Criteria) this;
        }

        public Criteria andPublicmsgIsNotNull() {
            addCriterion("publicMsg is not null");
            return (Criteria) this;
        }

        public Criteria andPublicmsgEqualTo(String value) {
            addCriterion("publicMsg =", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgNotEqualTo(String value) {
            addCriterion("publicMsg <>", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgGreaterThan(String value) {
            addCriterion("publicMsg >", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgGreaterThanOrEqualTo(String value) {
            addCriterion("publicMsg >=", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgLessThan(String value) {
            addCriterion("publicMsg <", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgLessThanOrEqualTo(String value) {
            addCriterion("publicMsg <=", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgLike(String value) {
            addCriterion("publicMsg like", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgNotLike(String value) {
            addCriterion("publicMsg not like", value, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgIn(List<String> values) {
            addCriterion("publicMsg in", values, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgNotIn(List<String> values) {
            addCriterion("publicMsg not in", values, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgBetween(String value1, String value2) {
            addCriterion("publicMsg between", value1, value2, "publicmsg");
            return (Criteria) this;
        }

        public Criteria andPublicmsgNotBetween(String value1, String value2) {
            addCriterion("publicMsg not between", value1, value2, "publicmsg");
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