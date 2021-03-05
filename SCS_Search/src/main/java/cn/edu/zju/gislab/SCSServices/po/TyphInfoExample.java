package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.List;

public class TyphInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TyphInfoExample() {
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

        public Criteria andTyphNumIsNull() {
            addCriterion("TYPH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTyphNumIsNotNull() {
            addCriterion("TYPH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTyphNumEqualTo(Long value) {
            addCriterion("TYPH_NUM =", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotEqualTo(Long value) {
            addCriterion("TYPH_NUM <>", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumGreaterThan(Long value) {
            addCriterion("TYPH_NUM >", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TYPH_NUM >=", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumLessThan(Long value) {
            addCriterion("TYPH_NUM <", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumLessThanOrEqualTo(Long value) {
            addCriterion("TYPH_NUM <=", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumIn(List<Long> values) {
            addCriterion("TYPH_NUM in", values, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotIn(List<Long> values) {
            addCriterion("TYPH_NUM not in", values, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumBetween(Long value1, Long value2) {
            addCriterion("TYPH_NUM between", value1, value2, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotBetween(Long value1, Long value2) {
            addCriterion("TYPH_NUM not between", value1, value2, "typhNum");
            return (Criteria) this;
        }

        public Criteria andChNameIsNull() {
            addCriterion("CH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChNameIsNotNull() {
            addCriterion("CH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChNameEqualTo(String value) {
            addCriterion("CH_NAME =", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotEqualTo(String value) {
            addCriterion("CH_NAME <>", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThan(String value) {
            addCriterion("CH_NAME >", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThanOrEqualTo(String value) {
            addCriterion("CH_NAME >=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThan(String value) {
            addCriterion("CH_NAME <", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThanOrEqualTo(String value) {
            addCriterion("CH_NAME <=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLike(String value) {
            addCriterion("CH_NAME like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotLike(String value) {
            addCriterion("CH_NAME not like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameIn(List<String> values) {
            addCriterion("CH_NAME in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotIn(List<String> values) {
            addCriterion("CH_NAME not in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameBetween(String value1, String value2) {
            addCriterion("CH_NAME between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotBetween(String value1, String value2) {
            addCriterion("CH_NAME not between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("EN_NAME =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("EN_NAME <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("EN_NAME >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_NAME >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("EN_NAME <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("EN_NAME <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("EN_NAME like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("EN_NAME not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("EN_NAME in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("EN_NAME not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("EN_NAME between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("EN_NAME not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andIsongoingIsNull() {
            addCriterion("ISONGOING is null");
            return (Criteria) this;
        }

        public Criteria andIsongoingIsNotNull() {
            addCriterion("ISONGOING is not null");
            return (Criteria) this;
        }

        public Criteria andIsongoingEqualTo(String value) {
            addCriterion("ISONGOING =", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingNotEqualTo(String value) {
            addCriterion("ISONGOING <>", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingGreaterThan(String value) {
            addCriterion("ISONGOING >", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingGreaterThanOrEqualTo(String value) {
            addCriterion("ISONGOING >=", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingLessThan(String value) {
            addCriterion("ISONGOING <", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingLessThanOrEqualTo(String value) {
            addCriterion("ISONGOING <=", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingLike(String value) {
            addCriterion("ISONGOING like", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingNotLike(String value) {
            addCriterion("ISONGOING not like", value, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingIn(List<String> values) {
            addCriterion("ISONGOING in", values, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingNotIn(List<String> values) {
            addCriterion("ISONGOING not in", values, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingBetween(String value1, String value2) {
            addCriterion("ISONGOING between", value1, value2, "isongoing");
            return (Criteria) this;
        }

        public Criteria andIsongoingNotBetween(String value1, String value2) {
            addCriterion("ISONGOING not between", value1, value2, "isongoing");
            return (Criteria) this;
        }

        public Criteria andModelNumIsNull() {
            addCriterion("MODEL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andModelNumIsNotNull() {
            addCriterion("MODEL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andModelNumEqualTo(String value) {
            addCriterion("MODEL_NUM =", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotEqualTo(String value) {
            addCriterion("MODEL_NUM <>", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumGreaterThan(String value) {
            addCriterion("MODEL_NUM >", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NUM >=", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLessThan(String value) {
            addCriterion("MODEL_NUM <", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NUM <=", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLike(String value) {
            addCriterion("MODEL_NUM like", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotLike(String value) {
            addCriterion("MODEL_NUM not like", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumIn(List<String> values) {
            addCriterion("MODEL_NUM in", values, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotIn(List<String> values) {
            addCriterion("MODEL_NUM not in", values, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumBetween(String value1, String value2) {
            addCriterion("MODEL_NUM between", value1, value2, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotBetween(String value1, String value2) {
            addCriterion("MODEL_NUM not between", value1, value2, "modelNum");
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