package gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int MAX_CAGES = 20;
    static final int MAX_ANIMALS = 25;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[MAX_ANIMALS];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "")
            this.name = name;
        else
            System.out.println("Name of the zoo cannot be empty");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void display() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + MAX_CAGES);
        System.out.println("Number of Animals: " + countAnimals());
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + " City: " + city + " Number of Cages: " + MAX_CAGES + " Number of Animals: " + countAnimals();
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull())
        {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }}
        else
         System.out.println("Table is full");
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteAnimal(Animal animal) {
        int indexA = searchAnimal(animal);
        if (indexA != -1) {
            for (int i = indexA; i < animals.length - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animals.length - 1] = null;
            return true;
        }
        return false;
    }

    public int countAnimals() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }
    public boolean isZooFull() {
        return countAnimals() >= MAX_ANIMALS;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.countAnimals() > z2.countAnimals()) {
            return z1;
        } else if (z2.countAnimals() > z1.countAnimals()) {
            return z2;
        } else {
            return z1;
        }
    }

}
