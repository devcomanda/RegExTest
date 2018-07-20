package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Or {

    @Test
    void findSubStringWithOr() {
        String text = "I like Java!!!";
        String regEx = "I like (JAVA|Java)";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
