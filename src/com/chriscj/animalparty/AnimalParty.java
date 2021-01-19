package com.chriscj.animalparty;

import com.chriscj.animalparty.init.Animal;

import java.awt.*;
import java.io.Serial;

public class AnimalParty extends Canvas implements Runnable{
    @Serial
    private static final long serialVersionUID = 4029859779177463247L;

    public AnimalParty() {}

    public static void main(String[] args) {
        Animal cj = new Animal("CJ", "Amphibian", "Toad", "Female");
        Animal chris = new Animal("Chris", "Mammal", "Owl", "Male");

        System.out.println("CJ is a " + cj.getSpecies());
        System.out.println("Chris is a " + chris.getSpecies());

    }

    @Override
    public void run() {

    }
}
