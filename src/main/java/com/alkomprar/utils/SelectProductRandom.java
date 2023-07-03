package com.alkomprar.utils;

import java.util.Random;

public class SelectProductRandom {
    public static int generateIndexRandom(int arraySize) {
        Random random = new Random();
        return random.nextInt(arraySize);
    }
}








