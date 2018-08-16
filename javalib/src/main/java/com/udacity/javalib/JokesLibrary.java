package com.udacity.javalib;

import java.util.List;
import java.util.Random;

public class JokesLibrary {
    private static String[] jokes = new String[] {
            "Q: How many programmers does it take to change a light bulb?\nA: none, that's a hardware problem\n",
            "Q: Whats the object-oriented way to become wealthy?\nA: Inheritance",
            "Q: Why did the programmer quit his job?\nA: Because he didn't get arrays.",
            "Q: What did the Java code say to the C code?\nA: You've got no class.",
            "Q: What is the most used language in programming?\nA: Profanity."
    };
    public static String getJoke() {
        int random = new Random().nextInt(jokes.length);
        return jokes[random];
    }
}
