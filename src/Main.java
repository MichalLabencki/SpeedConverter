public class Main {

    public static void main(String[] args) {

        long miles = SpeedConventer.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConventer.printConversion(10.5);
    }
}
