package com.thoughtworks.basic;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertEquals(actual,"Leave me alone.");
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertEquals(actual, "Hello World");
    }
    @Test
    public void should_be_verify_schema() {
        Schema schema = new Schema();
        //given
        String string = "-l true -p 8080 -d /usr/logs";

        //when



        try {
            String[] result = schema.splitString(string);
            Map<String,Object> strMap = schema.transToMap(result);
            Map<String, Object> str = schema.verify(strMap);
            System.out.println(strMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //then

        //assertEquals(actual, "Hello World");
    }
}
