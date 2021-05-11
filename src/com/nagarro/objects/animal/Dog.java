package com.nagarro.objects.animal;

public class Dog extends Animal {
    private String color;
    private Toy favouriteToy;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eatAction() {
        System.out.println("Dog eats meat");
    }

    public Toy getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(Toy favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public void play(Toy toy) {
        //code pt a se juca
        System.out.println("Dog plays with toy : " + toy.getName());
        setFavouriteToy(toy);
    }
}
