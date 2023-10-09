package gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String habitat, String family, String name, int age, boolean isMammal, int nbrLegs, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
    }

    @Override
    public String toString() {
        return super.toString() + " swimmingDepth: " + swimmingDepth;
    }
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

}
