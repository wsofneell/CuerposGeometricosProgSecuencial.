import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double altura, arista, volumen, area;

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = Math.pow(arista, 3) * Math.sqrt(3) ;
        volumen = (Math.sqrt(2)/12) * arista;
        altura = arista * (Math.sqrt(6)/3);

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("Altura: " + altura);
        lector.close();


    }
}
