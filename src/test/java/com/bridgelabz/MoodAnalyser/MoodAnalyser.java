package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {

    public MoodAnalyser(Object o) {
    }

    public MoodAnalyser() {

    }

    public String analyseMood(String message) {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
