package com.bridgelabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {

    static MoodAnalyzer mood;

    @Test
    public void test1AnalyseMoodAsSad() {
        mood = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", mood.analyseMood());
        System.out.println("Test 1.1: Test Case For Sad Mood Passed");
    }

    @Test
    public void test2AnalyseMoodAsHappy(){
        mood = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY",mood.analyseMood());
        System.out.println("Test 1.2: Test Case For Happy Mood Passed");
    }

    @Test
    public void testNullException(){
        mood = new MoodAnalyzer();
        assertEquals("HAPPY",mood.analyseMood());
        System.out.println("Test 2.1: Test Case For NULL Pointer Exception Handled");
    }
}
