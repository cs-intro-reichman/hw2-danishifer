// Prints a crowd cheering output.
public class Cheers {

    public static void main(String[] args) {
        String name = args[0];
        int cheersCount = Integer.parseInt(args[1]);

        name = name.toUpperCase();

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);

            String prefix = "AEFHIJLMNORSX".indexOf(letter) != -1 ? "an" : "a ";
            System.out.println("Give me " + prefix + " " + letter + ": " + letter + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < cheersCount; i++) {
            System.out.println(name + "!!!");
        }
    }
}
