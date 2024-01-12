public class Main {
    public static void main(String[] args) {
        // Create a dice
        Dice myDice1 = new Dice();
        // Create a second dice
        Dice myDice2 = new Dice();
        // Create a d20
        Dice myD20 = new Dice(20);

        System.out.println("initial value for first dice "+ myDice1.sideShowing);
        System.out.println("initial value for second dice "+ myDice2.sideShowing);
        System.out.println("initial value for d20 "+ myD20.sideShowing);

        // Roll the dice
        myDice1.rollDice();
        myDice2.rollDice();
        myD20.rollDice();
        System.out.println("new value "+ myDice1.sideShowing);
        System.out.println("new value "+ myDice2.sideShowing);
        System.out.println("new value "+ myD20.sideShowing);
    }
}