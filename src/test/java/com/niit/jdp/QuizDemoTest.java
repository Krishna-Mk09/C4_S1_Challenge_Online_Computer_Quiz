package com.niit.jdp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizDemoTest {
    QuizDemo quizDemo;

    @BeforeEach
    public void setUp() {
        quizDemo = new QuizDemo();
    }

    @AfterEach
    public void tearDown() {
        quizDemo = null;
    }

    @Test
    public void givenAStringArrayWithNumbersAsScoreReturnResult() {
        assertEquals("Candor", quizDemo.highestScore(new String[]{"DAV", "RSK", "Treamis", "Candor"}, new String[]{"45", "56", "78", "88"}));
    }

    @Test
    public void givenAStringArrayWithStringAsScoreReturnResult() {
        assertEquals("java.lang.NumberFormatException: For input string: \"fifty-six\"", quizDemo.highestScore(new String[]{"DAV", "RSK", "Treamis", "Candor"}, new String[]{"45", "fifty-six", "78", "88"}));
    }


}