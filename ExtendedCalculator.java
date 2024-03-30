public class ExtendedCalculator extends Calculator {
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static void main(String[] args) {
        ExtendedCalculator calculator = new ExtendedCalculator();
        System.out.println("Square root of 25: " + calculator.squareRoot(25));
        System.out.println("Cube root of 27: " + calculator.cubeRoot(27));
    }
}
