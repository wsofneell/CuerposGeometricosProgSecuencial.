import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double radio, area, volumen;
     
        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4/3) * Math.PI * Math.pow(area, 3);

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close(); 
    }
}
