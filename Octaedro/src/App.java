import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double arista, volumen, area;

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/3) * Math.pow(arista, 3);

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close();


    }
}
