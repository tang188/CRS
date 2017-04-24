package com.tangzh.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andJnoIsNull() {
            addCriterion("jno is null");
            return (Criteria) this;
        }

        public Criteria andJnoIsNotNull() {
            addCriterion("jno is not null");
            return (Criteria) this;
        }

        public Criteria andJnoEqualTo(String value) {
            addCriterion("jno =", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotEqualTo(String value) {
            addCriterion("jno <>", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThan(String value) {
            addCriterion("jno >", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoGreaterThanOrEqualTo(String value) {
            addCriterion("jno >=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThan(String value) {
            addCriterion("jno <", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLessThanOrEqualTo(String value) {
            addCriterion("jno <=", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoLike(String value) {
            addCriterion("jno like", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotLike(String value) {
            addCriterion("jno not like", value, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoIn(List<String> values) {
            addCriterion("jno in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotIn(List<String> values) {
            addCriterion("jno not in", values, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoBetween(String value1, String value2) {
            addCriterion("jno between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andJnoNotBetween(String value1, String value2) {
            addCriterion("jno not between", value1, value2, "jno");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("app_date is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("app_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(String value) {
            addCriterion("app_date =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(String value) {
            addCriterion("app_date <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(String value) {
            addCriterion("app_date >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(String value) {
            addCriterion("app_date >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(String value) {
            addCriterion("app_date <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(String value) {
            addCriterion("app_date <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLike(String value) {
            addCriterion("app_date like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotLike(String value) {
            addCriterion("app_date not like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<String> values) {
            addCriterion("app_date in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<String> values) {
            addCriterion("app_date not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(String value1, String value2) {
            addCriterion("app_date between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(String value1, String value2) {
            addCriterion("app_date not between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppTimeIsNull() {
            addCriterion("app_time is null");
            return (Criteria) this;
        }

        public Criteria andAppTimeIsNotNull() {
            addCriterion("app_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppTimeEqualTo(Date value) {
            addCriterionForJDBCTime("app_time =", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("app_time <>", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("app_time >", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("app_time >=", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeLessThan(Date value) {
            addCriterionForJDBCTime("app_time <", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("app_time <=", value, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeIn(List<Date> values) {
            addCriterionForJDBCTime("app_time in", values, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("app_time not in", values, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("app_time between", value1, value2, "appTime");
            return (Criteria) this;
        }

        public Criteria andAppTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("app_time not between", value1, value2, "appTime");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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