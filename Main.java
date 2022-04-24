package com.company;

public class Main {
    public static void main(String[] args) {
	Food []foods = new Food[3];
    foods[0] = new Pasta();
    foods[1] = new Pizza();
    foods[2] = new Steak();
    for(Food food : foods){
        food.part();
    }
    }
}
