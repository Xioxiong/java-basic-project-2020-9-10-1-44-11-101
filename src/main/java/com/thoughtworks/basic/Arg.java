package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Arg {
    public void flagAndValueCheck(List<Schema> schemas){
        checkRepeatFlag(schemas);
        checkValue(schemas);
    }



    private void checkRepeatFlag(List<Schema> schemas) {
        List<Schema> verifySchema = new ArrayList<>();
        for (Schema schema:schemas) {
            if(schema instanceof SchemaL && verifySchema.contains(schema)){
                throw new ArgException("flag重复："+ComConstantUtil.DEFAULT_VALUE_L);
            }else if(schema instanceof SchemaP && verifySchema.contains(schema)){
                throw new ArgException("flag重复："+ComConstantUtil.DEFAULT_VALUE_P);
            }else if(schema instanceof SchemaD && verifySchema.contains(schema)){
                throw new ArgException("flag重复："+ComConstantUtil.DEFAULT_VALUE_D);
            }
            verifySchema.add(schema);
        }
    }
    private void checkValue(List<Schema> schemas) {
        for (Schema schema:schemas) {
            if(schema instanceof SchemaL && !schema.judgeValueType(((SchemaL) schema).getValue())){
                throw new ArgException(ComConstantUtil.FLAG_L + "value类型不匹配");
            }else if(schema instanceof SchemaP && !schema.judgeValueType(((SchemaP) schema).getValue())){
                throw new ArgException(ComConstantUtil.FLAG_P + "value类型不匹配");
            }else if(schema instanceof SchemaD && !schema.judgeValueType(((SchemaD) schema).getValue())){
                throw new ArgException(ComConstantUtil.FLAG_D + "value类型不匹配");
            }
        }
    }
}
