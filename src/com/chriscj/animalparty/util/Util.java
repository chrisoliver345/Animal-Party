package com.chriscj.animalparty.util;

import com.chriscj.animalparty.AnimalParty;
import com.chriscj.animalparty.Window;
import com.chriscj.animalparty.core.Animal;

import java.awt.*;

public class Util {
    /*
    Capitalizes the inputted string.
    First letter to uppercase, all others to lowercase.
     */
    public static String capitalize(String word) {
        char[] first = word.toCharArray();
        StringBuilder newWord = new StringBuilder("");
        for (char letter : first) {
            if (letter == first[0]) {
                if (letter < 123 && letter > 96) {
                    letter -= 32;
                }
            }
            else {
                if (letter < 91 && letter > 64) {
                    letter += 32;
                }
            }
            newWord.append(letter);
        }
        return newWord.toString();
    }


    /*
    Clamps values in between maximum and minimum
     */
    public static int clamp(int val, int min, int max) {
        if (val >= max) {
            return val = max;
        }
        if (val <= min) {
            return val = min;
        }
        return val;
    }


    /*
    detects whether or not the position of the mouse is over a position.
     */
    public static boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if (mx > x && mx < x + width) {
            if (my > y && my < y + height) {
                return true;
            } else return false;
        } else return false;

    }

    /*
    Gets current mouse position and return a point
     */

    public static Point getMousePosition() {
        int mx = MouseInfo.getPointerInfo().getLocation().x - Window.frame.getLocation().x;
        int my = MouseInfo.getPointerInfo().getLocation().y - Window.frame.getLocation().y;
        return new Point(mx, my);
    }
}
