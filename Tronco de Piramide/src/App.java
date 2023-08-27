import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double altura, areaL, areaT, volumen, Apiramide;
        double ABase, Abase,PBase, Pbase;
        double longMayor, longMenor, LongMayor_Mitad;

        System.out.println("Ingrese la longitd del lado mayor: ");
        longMayor = lector.nextDouble();

        System.out.println("Ingrese la longitud del lado menor: ");
        longMenor = lector.nextDouble();

        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        LongMayor_Mitad = longMayor / 2;
        Apiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(LongMayor_Mitad, 2));
        ABase = Math.pow(longMayor, 2);
        Abase = Math.pow(longMenor, 2);
        PBase = longMayor * 4;
        Pbase = longMenor * 4;
        areaL = ((PBase + Pbase)/2) * Apiramide;
        areaT = areaL + ABase + Abase;
        volumen = ((1/3) * altura * (ABase + Abase + Math.sqrt(ABase * Abase)));

        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();    

    }
}
