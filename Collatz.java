// Demonstrates the Collatz conjecture.

public class Collatz {

    public static void main(String args[]) {
        int highestSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= highestSeed; seed++) {
            int n = seed;
            int steps = 1;
            do {
                if (mode.equals("v")) {

                    System.out.print(n + " ");
                }
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                steps++;
            } while (n != 1);

            if (mode.equals("v")) {
                System.out.println("1 (" + steps + ")");
            }

        }

        System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
    }
}
