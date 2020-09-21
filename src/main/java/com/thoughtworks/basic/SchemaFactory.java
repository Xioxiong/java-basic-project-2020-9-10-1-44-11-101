package com.thoughtworks.basic;

public class SchemaFactory {
    public Schema getSchema(String flag){
        switch (flag){
            case ComConstantUtil.FLAG_L:
                return new SchemaL();
            case ComConstantUtil.FLAG_P:
                return new SchemaP();
            case ComConstantUtil.FLAG_D:
                return new SchemaD();
                default: return new SchemaD();
        }
    }
}
