import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tiger tigerAnimal =new Tiger("Tiger");
        Dolphin dolphinAnimal =new Dolphin("Dolphin");
        Penguin penguinAniaml=new Penguin("Penguin");

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop ;
        int continueInnerLoop;

        // for menu choice
        int menuChoice ;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/

        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : "+tigerAnimal.getNameOfAnimal());
                        menuChoice=animalDetailsManipulationMenu(keyboard,tigerAnimal);
                        // get menu choice
                        switch (menuChoice) {
                            case 1:

                                System.out.println("Enter the speed:");
                                tigerAnimal.setSpeed(keyboard.nextInt());
                                System.out.println("Enter the number of stripes:");
                                tigerAnimal.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter de sound level of roar:");
                                tigerAnimal.setSoundLevelOfRoar(keyboard.nextInt());
                                System.out.println("Enter the age:");
                                tigerAnimal.setAge(keyboard.nextInt());
                                System.out.println("Enter the weight:");
                                tigerAnimal.setWeight(keyboard.nextInt());
                                System.out.println("Enter the height:");
                                tigerAnimal.setHeight(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: "+tigerAnimal.getAge());
                                System.out.println("Height: "+tigerAnimal.getHeight());
                                System.out.println("Weight: "+tigerAnimal.getWeight());
                                System.out.println("Speed: "+tigerAnimal.getSpeed());
                                System.out.println("Sound Level of Roar: "+tigerAnimal.getSoundLevelOfRoar());
                                System.out.println("Number of stripes: "+tigerAnimal.getNumberOfStripes());


                                break;
                            case 3:
                                tigerAnimal.walking();
                                break;
                            case 4:
                                tigerAnimal.eatingFood();
                                tigerAnimal.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : "+dolphinAnimal.getNameOfAnimal());
                        menuChoice=animalDetailsManipulationMenu(keyboard,dolphinAnimal);
                        // get menu choice
                        switch (menuChoice) {
                            case 1:

                                System.out.println("Enter the speed:");
                                dolphinAnimal.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter the color:");
                                dolphinAnimal.setColor(keyboard.nextLine());
                                System.out.println("Enter the age:");
                                dolphinAnimal.setAge(keyboard.nextInt());
                                System.out.println("Enter the weight:");
                                dolphinAnimal.setWeight(keyboard.nextInt());
                                System.out.println("Enter the height:");
                                dolphinAnimal.setHeight(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: "+dolphinAnimal.getAge());
                                System.out.println("Height: "+dolphinAnimal.getHeight());
                                System.out.println("Weight: "+dolphinAnimal.getWeight());
                                System.out.println("Color: "+dolphinAnimal.getColor());
                                System.out.println("Speed: "+dolphinAnimal.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphinAnimal.swimming();
                                break;
                            case 4:
                                dolphinAnimal.eatingFood();
                                dolphinAnimal.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3: // 👈 Este es el nuevo bloque para el Pingüino
                    do {
                        System.out.println("The animal which is chosen is : " + penguinAniaml.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinAniaml);

                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Is the penguin swimming (true/false):");
                                penguinAniaml.setSwimming(keyboard.nextBoolean());

                                System.out.println("Enter the walk speed:");
                                penguinAniaml.setWalkSpeed(keyboard.nextInt());

                                System.out.println("Enter the swim speed:");
                                penguinAniaml.setSwimSpeed(keyboard.nextInt());

                                System.out.println("Enter the age:");
                                penguinAniaml.setAge(keyboard.nextInt());

                                System.out.println("Enter the weight:");
                                penguinAniaml.setWeight(keyboard.nextInt());

                                System.out.println("Enter the height:");
                                penguinAniaml.setHeight(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + penguinAniaml.getAge());
                                System.out.println("Height: " + penguinAniaml.getHeight());
                                System.out.println("Weight: " + penguinAniaml.getWeight());
                                System.out.println("Walking Speed: " + penguinAniaml.getWalkSpeed());
                                System.out.println("Swimming Speed: " + penguinAniaml.getSwimSpeed());
                                break;

                            case 3:
                                System.out.println("Is the penguin walking or swimming? (Enter 1 for walking, 2 for swimming):");
                                int moveChoice = keyboard.nextInt();

                                if (moveChoice == 1) {
                                    penguinAniaml.walking();
                                } else if (moveChoice == 2) {
                                    penguinAniaml.swimming();
                                } else {
                                    System.out.println("Invalid choice for movement.");
                                }
                                break;

                            case 4:
                                penguinAniaml.eatingFood();
                                penguinAniaml.eatingCompleted();
                                break;

                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();

                    } while(continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");


        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



