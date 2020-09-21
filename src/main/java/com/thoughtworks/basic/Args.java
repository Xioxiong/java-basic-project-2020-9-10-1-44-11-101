package com.thoughtworks.basic;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Args {
    public String check(List<Schema> schemas){
        Arg arg = new Arg();
        arg.flagAndValueCheck(schemas);
        for (Schema schema: schemas) {
            ruleVerify(schema);
        }
        return "您输入的命令正确无误！";
    }

    private void ruleVerify(Schema schema) {
        String flag = schema.getFlag();
        Pattern p = Pattern.compile("-\\s+|-\\S\\S+|-\\S-");
        Matcher m = p.matcher(flag);
        if(m.find()){
            throw new ArgException("-与flag之间有空格或参数之间没有空格");
        }
    }
}
