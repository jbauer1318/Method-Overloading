public class LeapYear {

    public static void main(String [] args){

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

    }


    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999){
            System.out.println("Invalid range for year");
            return false;
        }else if(year % 4 == 0 && (year % 100 != 0)){
            System.out.println("Is a leap year leap year");
            return true;
        }else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("Is a leap year");
            return true;
        }
        else
            System.out.println("Not a leap year");
            return false;
    }


}




