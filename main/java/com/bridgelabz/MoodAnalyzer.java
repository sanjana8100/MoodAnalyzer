package com.bridgelabz;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }

}
