public class TeenNumberChecker {

    public static void main(String[] args){

       hasTeen(9,99,19);
       hasTeen(23,15,42);
       hasTeen(22,23,34);


       isTeen(9);
       isTeen(13);


    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        if ((num1 <= 19 && num1 >= 13) || (num2 <= 19 && num2 >= 13) || (num3 <= 19 && num3 >= 13)) {
            System.out.println("One of the values is within the range of 13-19");
            return true;
        } else
            System.out.println("None of the values were in the range 13-19");
        return false;

    }

    public static boolean isTeen(int num){

        if(num <= 19 && num >= 13){
            System.out.println("The value is within the range 13-19");
            return true;
        }
        else
            System.out.println("The value is not within the range 13-19");
            return false;
    }





}
