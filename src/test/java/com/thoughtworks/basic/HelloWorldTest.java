package com.thoughtworks.basic;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void should_be_verify_schema() {
        SchemaPrevious schemaPrevious = new SchemaPrevious();
        //given
        String string = "-l true -p 8080 -d /usr/logs";
        //when
        Map<String, Object> str = null;
        try {
            String[] result = schemaPrevious.splitString(string);
            Map<String,Object> strMap = schemaPrevious.transToMap(result);
            str = schemaPrevious.verify(strMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //then
        System.out.println(str);
    }
}
