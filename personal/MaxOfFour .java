public class MaxOfFour {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;
        int num4 = 20;

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("The maximum number is: " + max);
    }
}