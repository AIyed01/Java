package gestionzoo.entities;

import java.util.Scanner;
public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setMammal(boolean mammal) {
            isMammal = mammal;
        }

    public String getName() {
        return this.name;
    }
    public void setName(String name, int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Animals cannot have a negative age");
        }
        this.name = name;
    }
    public  Animal(){}
    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
         this.age=age;
        this.isMammal=isMammal;
    }
    void Display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("Is Mammal : " + isMammal);
    }
    public String toString() {
        return "Animal Name: " + name + "Family: " + family + "Age : " + age + "Is Mammal : " + isMammal;
    }

    }
