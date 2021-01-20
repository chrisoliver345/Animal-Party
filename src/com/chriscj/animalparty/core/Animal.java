package com.chriscj.animalparty.core;

import static com.chriscj.animalparty.util.Util.capitalize;

public class Animal{
    private static final String[] genders = {"Male", "Female", "Other"};
    private static final String[] groups= {"Mammal", "Reptile", "Fish", "Bird", "Amphibian", "Unknown"};
    private String group = "Unknown";
    private String species = "Unknown";
    private String name = "Undefined";
    private String gender = "Other";


    public Animal(String name, String group, String species, String gender) {
        if (name != null) {
            this.name = name;
        }

        for (String _gender : genders) {
            if (capitalize(gender).equals(_gender)) {
                this.gender = gender;
            }
        }
        for (String _group : groups) {
            if (capitalize(group).equals(_group)) {
                this.group = group;
            }
        }

        if (species != null) {
            this.species = capitalize(species);
        }

    }

    public String getSpecies() {
        return this.species;
    }

    public String getGroup() {
        return this.group;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }
}
