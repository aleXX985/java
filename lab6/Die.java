import java.util.Scanner;

public class Die {
  private int numberOfSides;
  private int value;

  public Die() {
      this.numberOfSides = 6;
  }

  public Die(int numberOfSides) {
      this.numberOfSides = numberOfSides;
  }

  public int roll() {
    this.value = (int) (Math.random() * numberOfSides) + 1;
    return this.get();
  }

  public int get() {
      return value;
  }

  public String toString() {
      return "Die(" + value + ")";
  }

  public boolean equals(Die otherDie) {
      if (otherDie.numberOfSides == this.numberOfSides)
          {
              return otherDie.value == this.value;
          }
      else
          {
              return false;
          }
      
    }

  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Number of sides: ");
      int sides = sc.nextInt();
      if (sides < 0)
          {
              throw new IllegalArgumentException(sides + " is an illegal number of sides for die"); 
          }
      Die d = new Die(sides);
      System.out.println("Alea iacta est: " + d.roll());
  }
}
