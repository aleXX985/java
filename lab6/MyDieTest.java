import java.util.Scanner;

public class MyDieTest {
 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of sides: ");
        int sides = sc.nextInt();
        Die d = new Die(sides);
        int Sum = 0;
        int value = 0;
        for (int i = 0; i <= sides; i++)
            {
                value = d.roll();
                Sum = Sum + value;
            }
        System.out.println("Summa: " + Sum);
    }
}
