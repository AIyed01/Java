package gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String habitat, String family, String name, int age, boolean isMammal, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
    }

    @Override
    public String toString() {
        return super.toString() + " swimmingSpeed: " + swimmingSpeed;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
