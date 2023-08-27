import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double radio, numeroGrados, volumen, area;

        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        System.out.println("Ingrese el numero de grados: ");
        numeroGrados = lector.nextDouble();

        area = (4 * Math.PI * Math.pow(radio, 2) * numeroGrados)/360;
        volumen = ((4/3) * 4 * Math.pow(Math.PI, 3) * numeroGrados)/360;

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close(); 


    }
}
