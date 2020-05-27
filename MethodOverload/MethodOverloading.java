public class MethodOverloading {

    public static void main(String[] args){

        calcFeetAndInchesToCentimeters(12, 2);




    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || (inches >= 0) || (inches <= 12)){
            System.out.println("Invalid feet or inches parameter.");
            return -1;
        }

        double centimeters = (feet * 12) * 12.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm.");
        return centimeters;


    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0) {
            return -2;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + "inches.");
        return calcFeetAndInchesToCentimeters(feet, inches);

    }


}