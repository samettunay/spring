package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Down");
    }

    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("Shot");
    }
}
