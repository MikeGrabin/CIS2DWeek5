import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        double[] arrayDouble = new double [99];
        for (int i = 0; i < arrayDouble.length; i += 1) {
            arrayDouble[i] = 100.0 * Math.random();
        }
        double doubleValue = 0.0;
        for(double randomNum: arrayDouble) {
            doubleValue += randomNum;
        }
        double averageValue = doubleValue/arrayDouble.length;
        System.out.println("Average value: " + averageValue);
        Arrays.sort(arrayDouble);
        System.out.println("Median value: " + arrayDouble[arrayDouble.length/2]);
        for (int i = 8; i <= arrayDouble.length; i += 9) {
            System.out.println("The 9th value: " + arrayDouble[i]);
        }
    }
}
