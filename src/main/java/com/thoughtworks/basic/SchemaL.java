package com.thoughtworks.basic;

public class SchemaL implements Schema {
    private String flag;
    private String value;

    @Override
    public boolean judgeValueType(String value) {
        return Boolean.valueOf(value);
    }

    @Override
    public String getDefaultValue() {
        return ComConstantUtil.DEFAULT_VALUE_L;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
