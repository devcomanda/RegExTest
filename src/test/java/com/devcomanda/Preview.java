package com.devcomanda;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Preview {

    @Test
    void findSubStringWithPreviewNextEasy() {
        String text = "3123.545 4545 8798.77";
        String regEx = "\\d+(?=\\.)";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void findSubStringWithPreviewPrevEasy() {
        String text = "12345";
        String regEx = "(?<!3)\\d";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    void findSubStringWithPreviewHard() {
        String text = "Иван(Киев) Николай(Львов) Богдан(Киев)";
        String regEx = "(?<!\\()\\b[а-яёЁА-Я]+\\b(?!\\(Киев\\))";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
