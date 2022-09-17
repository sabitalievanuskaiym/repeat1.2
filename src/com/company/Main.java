package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(21, 10));
        System.out.println(method(10, 27));
        System.out.println(method(46, -9));
        System.out.println(method(10, -5));
        System.out.println(method(25, 19));

        int randomAge = generateRandomAge();
        int randomWeather = generateRandomWeather();
        System.out.println(method(randomAge, randomWeather));


    }

    public static String method(int age, int weather) {
        if (age > 20 && age < 45 && weather > -20 && weather < 30) {
            return "Можно идти гулять";
        }
        if (age < 20 && weather > 0 && weather < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && weather > -10 && weather < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(99);
        System.out.println("Мне " + age + "лет, " + "Можно ли идти гулять?");
        return age;
    }

    public static int generateRandomWeather() {
        Random random = new Random();
        int weather = random.nextInt(65);
        System.out.println("Сегодня погода " + weather + " грудусов " + "Можно ли идти гулять?");
        return weather;

    }
}
