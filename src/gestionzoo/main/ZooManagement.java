package gestionzoo.main;

import java.util.Scanner;
import gestionzoo.entities.*;

public class ZooManagement {
        public static void main(String[] args) {
            Zoo zoo = new Zoo("My Zoo", "Cityville");
            System.out.println("Created a zoo: " + zoo.getName() + " in " + zoo.getCity());

            Animal lion = new Animal("Mammal", "Leo", 5, true);
            Animal elephant = new Animal("Mammal", "Ellie", 10, true);
            Aquatic shark = new Aquatic("Fish", "Sharky", 3, true, "Ocean");
            Dolphin dolphin = new Dolphin("Ocean", "Dolphin Family", "Flipper", 10, true, 25.0f);
            Penguin penguin = new Penguin("Sea", "Penguin Family", "Pengy", 2, true, 2, 10.0f);

            zoo.addAnimal(lion);
            zoo.addAnimal(elephant);
            zoo.addAnimal(shark);
            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);

            zoo.display();

            int index = zoo.searchAnimal(elephant);
            if (index != -1) {
                zoo.deleteAnimal(elephant);
                System.out.println(elephant.getName() + " has been removed from the zoo.");
            } else {
                System.out.println(elephant.getName() + " was not found in the zoo.");
            }

            zoo.display();

            Zoo anotherZoo = new Zoo("Second Zoo", "City2");
            anotherZoo.addAnimal(new Animal("Mammal", "Tiger", 6, true));
            Zoo largerZoo = Zoo.comparerZoo(zoo, anotherZoo);
            System.out.println("The zoo with more animals is: " + largerZoo.getName());
        }


}