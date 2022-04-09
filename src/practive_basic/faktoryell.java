package practive_basic;

public class faktoryell {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;


        String factString = "";
        for (int count = number; count > 0; count--) {
            factorial = factorial * count;
            if (count == number) {
                factString += count;
            } else {
                factString += " * " + count;
            }
        }

        System.out.println("Factorial of " + factString + " is " + factorial);
        System.out.println();

    }
}
