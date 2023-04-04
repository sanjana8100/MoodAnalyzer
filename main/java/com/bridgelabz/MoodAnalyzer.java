package com.bridgelabz;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException{
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalysisException("Please Enter a Valid Message!!!");
        }
    }

}
