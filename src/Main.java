public class Main {
    public static void main(String[] args) {

        double number1 = 5.123;
        double number2 = 5.123;
        boolean sameNumbers = areEqualByThreeDecimalPlaces(number1, number2);
        System.out.println("The numbers are the same: " + sameNumbers);

        number1 = 5.124;
        number2 = 5.123;
        sameNumbers = areEqualByThreeDecimalPlaces(number1, number2);
        System.out.println("The numbers are the same: " + sameNumbers);

        number1 = 150.654;
        number2 = 150.654;
        sameNumbers = areEqualByThreeDecimalPlaces(number1, number2);
        System.out.println("The numbers are the same: " + sameNumbers);

    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int num1 = (int) (number1 * 1000);
        int num2 = (int) (number2 * 1000);

        if (num1 == num2){
            return true;
        } else {
            return false;
        }
    }
}