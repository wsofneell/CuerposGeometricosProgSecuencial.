import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double arista, diagonal, volumen, area;

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = 6 * Math.pow(arista, 2);
        diagonal = arista * Math.sqrt(3);
        volumen = Math.pow(arista, 3);

        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
        System.out.println("Volumen: " + volumen);
        lector.close();


    }
}


