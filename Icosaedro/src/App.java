import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double arista, volumen, area;

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = (5/12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close();


    }
}
