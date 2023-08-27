
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        int cantidadLados;
        double longitudLados, altura, areaL, areaT, volumen;
        double Pbase, Abase, apotema;
        
        System.out.println("Ingrese la cantida de lados: ");
        cantidadLados = lector.nextInt();

        System.out.println("Ingrese la longitud de lados: ");
        longitudLados = lector.nextDouble();

        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        Pbase = cantidadLados * longitudLados;
        areaL = Pbase * altura;
        Double alfa = (Math.PI/180) * (380/cantidadLados);
        apotema =  longitudLados / (2 * Math.tan((alfa)/2));
        Abase = (Pbase * apotema)/2;
        areaT = areaL + 2 * Abase;  
        volumen = Abase * altura; 
        
        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();


    }

}    