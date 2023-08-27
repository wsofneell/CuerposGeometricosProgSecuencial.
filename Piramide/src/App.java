import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        Double altura, longitudLados, anchoL, Abase, Pbase;
        Double APiramide, apotema, areaL, areaT, volumen;

        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        System.out.println("Ingrese la longitud de lados: ");
        longitudLados = lector.nextDouble();

        System.out.println("Ingrese la anchura de los lados: ");
        anchoL = lector.nextDouble();



        Pbase = 2 * longitudLados + 2 * anchoL;
        apotema = longitudLados/2;
        APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
        areaL = (Pbase * APiramide)/2;
        areaT = areaL + Pbase;
        Abase = longitudLados/2;
        volumen = (Abase* altura)/3;

        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();    
    
    }
}
