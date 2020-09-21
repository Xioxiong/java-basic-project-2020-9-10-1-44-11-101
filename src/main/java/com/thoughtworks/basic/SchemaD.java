package com.thoughtworks.basic;

public class SchemaD implements Schema {
    private String flag;
    private String value;

    @Override
    public boolean judgeValueType(String value) {
        if(value.matches("[0-9]+") || Boolean.valueOf(value)){
            return false;
        }
        return true;
    }

    @Override
    public String getDefaultValue() {
        return ComConstantUtil.DEFAULT_VALUE_D;
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
