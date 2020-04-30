import java.util.Scanner;
public class UnitConversion {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch+ "inch is" + meters + "meters");
    }
}
