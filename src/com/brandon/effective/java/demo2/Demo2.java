package com.brandon.effective.java.demo2;

/**
 * Created by Brandoncui on 2019/11/25.
 */
public class Demo2 {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 20).calories(50).carbohydrate(40).fat(12).sodium(33).build();
        System.out.println(nutritionFacts);
    }
}


