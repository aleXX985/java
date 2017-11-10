public class PairOfDice {
    static Die die1;
    static Die die2;
    

    public static void main(String [] args) {
        die1 = new Die(6);
        die2 = new Die(6);
        int dieSum = die1.roll() + die2.roll();
        System.out.println("The sum of the Dies are: " + dieSum);
    }

}
