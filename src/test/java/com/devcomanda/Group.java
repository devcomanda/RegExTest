package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Group {

    @Test
    void findSubStringWithGroup() {
        String text = "Serial number: 123-456-789-545654";
        String regEx = "(\\d+-?)+";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void findAttrInTagWithGroup() {
        String text = "<div class=\"my_class\" data-id=\"328\" data-param=\"F5G6\">";
        String regEx = "([\\w-]+)=['\"](.+?)['\"]";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("All text: " + matcher.group(0));
            System.out.println("Name attribute: " + matcher.group(1));
            System.out.println("Value attribute: " + matcher.group(2));
        }
    }

    @Test
    void findSubStrinWithExcludeGroup() {
        String text = "Cococo: fsaf gerger bvcbcv";
        String regEx = "(?i)(?:co)+:\\s(\\w+)\\s(\\w+)\\s(\\w+)";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("All text: " + matcher.group(0));
            System.out.println("First group: " + matcher.group(1));
            System.out.println("Second group: " + matcher.group(2));
            System.out.println("Third group: " + matcher.group(3));
        }
    }
}
