public class EqualSumCalc {

    public static void main(String[] args){

        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);

    }


    public static boolean hasEqualSum(int num1, int num2, int num3){

        if(num1 + num2 == num3){
            System.out.println("The sum of " + num1 + " + " + num2 + " is equal to " + num3);
            return true;
        }
        else
            System.out.println("The sum of " + num1 + " + " + num2 + " is not equal to " + num3);
            return false;

    }

}
