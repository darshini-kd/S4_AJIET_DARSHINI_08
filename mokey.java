
import java.util.Scanner;

public class MonkeyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
          
            System.out.print("Total monkeys (n): ");
            int n = sc.nextInt();
            System.out.print("Bananas per monkey (k): ");
            int k = sc.nextInt();
            System.out.print("Peanuts per monkey (j): ");
            int j = sc.nextInt();
            System.out.print("Total bananas (m): ");
            int m = sc.nextInt();
            System.out.print("Total peanuts (p): ");
            int p = sc.nextInt();

           
            if (k <= 0 || j <= 0 || n < 0 || m < 0 || p < 0) {
                System.out.println("INVALID INPUT");
            } else {
                int ateBananas = 0;
                int atePeanuts = 0;

                
                if (m > 0) {
                    ateBananas = m / k;
                    if (m % k != 0) {
                        ateBananas++;
                    }
                }

                
                if (p > 0) {
                    atePeanuts = p / j;
                    if (p % j != 0) {
                        atePeanuts++;
                    }
                }

                int totalDown = ateBananas + atePeanuts;

                
                if (totalDown > n) {
                    System.out.println("Monkeys left on tree: 0");
                } else {
                    System.out.println("Monkeys left on tree: " + (n - totalDown));
                }
            }
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        } finally {
            sc.close();
        }
    }
}
