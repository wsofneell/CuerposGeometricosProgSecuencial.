import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double arista, volumen, area;

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 + Math.sqrt(5));
        volumen = (1/4) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
        //Nota para el profesor:
        //No añadi la formula del AreaPent porque no encontre la del apotema
        //y no me quise arriegar por la variedad :(

        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close();


    }
}
