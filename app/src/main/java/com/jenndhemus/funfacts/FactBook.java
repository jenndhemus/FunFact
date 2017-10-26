package com.jenndhemus.funfacts;

import java.util.Random;

/**
 * Created by Jennifer on 10/25/2017.
 */

public class FactBook {
    private final String [] facts = new String[]{
            "It is Only With The Heart That One Can See Rightly What Is Invisible to The Eye",
            "You are Amazing",
            "Keep at it",
            "This is just the beginning",
            "You got so much to do in so many hour is a day",
            "You are so ahead of yourself that you forgot what you need",
            "You got your passion and your pride and you know only fools can be satisfied ",
            "Be Brave"};

     String getFact(){
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        String fact = facts[randomNumber];
        return fact;

    }
}
