package com.chriscj.animalparty.util;

public class Util {
    public static String capitalize(String word) {
        char[] first = word.toCharArray();
        int ascii = (int) first[0];
        if (ascii < 123 && ascii > 96) {
            ascii -= 32;
        }
        char cap = (char) ascii;
        StringBuilder newWord = new StringBuilder(String.valueOf(cap));
        for (char letter : first) {
            if (letter != first[0]) {
                newWord.append(letter);
            }
        }
        return newWord.toString();
    }
}
