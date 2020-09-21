package com.thoughtworks.basic;

public class SchemaP implements Schema {
    private String flag;
    private String value;

    @Override
    public boolean judgeValueType(String value) {
        return value.matches("[0-9]+");
    }

    @Override
    public String getDefaultValue() {
        return ComConstantUtil.DEFAULT_VALUE_P;
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
