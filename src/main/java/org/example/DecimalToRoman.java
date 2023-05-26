package org.example;

public class DecimalToRoman {

    public static String decimalToRoman(int number) {
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (number >= decimalValues[i]) {
                romanNumber.append(romanSymbols[i]);
                number -= decimalValues[i];
            }
        }

        return romanNumber.toString();
    }

}
