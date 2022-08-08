package com.company;

public class Main {

    public static void main(String[] args) {
         Parrot parrot = new Parrot();
         parrot.setName("Corella");
         parrot.setColor("white");
         parrot.setAge(3);
         String name = parrot.getName();
         String color = parrot.getColor();
         int age = parrot.getAge();
        System.out.println("\nClass Parrot: ");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);


        Fish fish = new Fish();
        fish.setName("Lamprey");
        fish.setColor("gray");
        fish.setWeight(3.45);
        System.out.println("\nClass Fish: ");
        System.out.println("Name: " + fish.getName());
        System.out.println("Color: " + fish.getColor());
        System.out.println("Weight: " + fish.getWeight());

        Cat cat = new Cat();
        cat.setName("Luna");
        cat.setColor("black");
        cat.setAge(4);
        System.out.println("\nClass Cat: ");
        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Age: " + cat.getAge());

        Dog dog = new Dog();
        dog.setName("Arlo");
        dog.setAge(5);
        dog.setColor("black");
        System.out.println("\nClass Dog: ");
        System.out.println("Name: " + dog.getName());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Age: " + dog.getAge());
    }
}
