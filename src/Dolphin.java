public class Dolphin extends Animal implements Swim{
    private String color;
    private double swimmingSpeed;

    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating a delicious fish");
    }

    @Override
    public void eatingCompleted() {

        System.out.println("I eat fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed "+swimmingSpeed+" mnph");

    }
}
