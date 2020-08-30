package com.bridgelabz;

import com.bridgelabz.MoodAnalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalyse()  {
       MoodAnalyser md = new MoodAnalyser();
        String mood = md.analyseMood("This is a sad message");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void testHappyMood()  {
        MoodAnalyser md = new MoodAnalyser();
        String mood = md.analyseMood("This is a happy message");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser md = new MoodAnalyser(null);
        String mood = md.analyseMood("This is a happy message");
        Assert.assertEquals("HAPPY",mood);
    }
}