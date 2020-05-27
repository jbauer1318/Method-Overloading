public class DecimalComparator {


    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

            if ( (int) (num1 * 1000) == (int) (num2 * 1000) ){
                System.out.println("The two numbers are equal within 3 decimal places");
                return true;
            }
            else {
                System.out.println("The two numbers are not equal within 3 decimal places");
                return false;
            }

        }

}

