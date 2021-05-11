package com.nagarro.objects.animal;

public class Animal {
    private String name;
    private String race;
    private int age;

    public Animal() {
    }

    public Animal(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eatAction() {
        System.out.println("Animal eat veggies");
    }
}
