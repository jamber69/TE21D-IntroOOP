import java.util.Random;

public class Dice {
    //Attributes
    int sides = 6;
    int sideShowing = 1;
    String color = "red";
    boolean weighted = false;


    public Dice(){}  // Tom konstruktor

    public Dice(int newSides){
        sides = newSides;
    }

    //Methods
    public void rollDice(){
        Random random = new Random();
        sideShowing = random.nextInt(sides) + 1;
        System.out.println("Dice has been rolled");
    }

    // Change the number of sides
    public void changeSides(){
        sides = 15;
    }
}
