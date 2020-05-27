public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Invalid time of day.");
            return false;
        } else if(hourOfDay < 8 || hourOfDay > 22) {
            if(barking) {
                System.out.println("Dog is barking and we have to wake up.");
                return true;
            } else {
                System.out.println("Dog is not barking so we don't have to wake up.");
                return false;
            }
        }
        System.out.println("We are awake so it doesn't matter.");
        return false;
    }
}





