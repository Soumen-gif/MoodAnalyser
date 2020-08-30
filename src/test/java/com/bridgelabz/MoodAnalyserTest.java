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
}