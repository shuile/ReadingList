package com.shui.headfirstdesignpatterns.chapter8.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shui.
 * @date 2021/8/16.
 * @time 07:43.
 */
class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInfo();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInfo() {
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Would you like lemon with your tea (y/n)?");
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
