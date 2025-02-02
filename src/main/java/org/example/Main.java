package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));


    }

    public static boolean checkForPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        input = input.toLowerCase();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        return input.equals(reverse);
    }


    public static String convertDecimalToBinary(int number) {
        LinkedList<Integer> binary = new LinkedList<>();
        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            binary.push(number % 2);
            number = number / 2;

        }

        StringBuilder stringBuilder=new StringBuilder();
        for(Integer num:binary){
            stringBuilder.append(num);
        }
        return stringBuilder.toString();


    }


}