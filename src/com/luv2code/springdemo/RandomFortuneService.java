package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        String [] fortuneQuotes = new String[]{
                "Today it's up to you to create the peacefulness you long for.",
                "A friend asks only for your time not your money.",
                "If you refuse to accept anything but the best, you very often get it."};
        int n = (int) (Math.random() * 3) ;
        return fortuneQuotes[n];
    }
}
