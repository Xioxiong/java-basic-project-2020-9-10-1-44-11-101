package com.thoughtworks.basic;

public interface Schema {
    public boolean judgeValueType(String value);
    public String getFlag();
    public String getDefaultValue();
}
