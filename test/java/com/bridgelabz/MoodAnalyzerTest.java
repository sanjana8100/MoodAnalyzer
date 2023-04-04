package com.bridgelabz;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {

    static MoodAnalyzer mood;

    @Test
    public void test1AnalyseMoodAsSad() throws MoodAnalysisException{
        mood = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", mood.analyseMood());
        System.out.println("Test 1.1: Test Case For Sad Mood Passed");
    }

    @Test
    public void test2AnalyseMoodAsHappy() throws MoodAnalysisException{
        mood = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY",mood.analyseMood());
        System.out.println("Test 1.2: Test Case For Happy Mood Passed");
    }

    @Test
    public void testNullException(){
        mood = new MoodAnalyzer();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            assertEquals(MoodAnalysisException.class, mood.analyseMood());
        } catch (MoodAnalysisException e){
            System.out.println("Test 3.1: Test Case For NULL Exception Handled");
        }
    }

    @Test
    public void testEmptyException(){
        mood = new MoodAnalyzer();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            assertEquals(MoodAnalysisException.class, mood.analyseMood());
        } catch (MoodAnalysisException e){
            System.out.println("Test 3.2: Test Case For Empty Exception Handled");
        }
    }
}
