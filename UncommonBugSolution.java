public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        if (y != 0) {
            z = x / y;
        } else {
            System.out.println("Cannot divide by zero!");
            //Optional: Handle the exception more gracefully, perhaps return a default value or throw a custom exception
        }
        System.out.println(z);
    }
}