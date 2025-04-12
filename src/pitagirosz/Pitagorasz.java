package pitagorasz;
import java.util.Scanner;
import java.util.Long;

public class Pitagorasz {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // Az időmérés kezdete
        System.out.println("Ez a program kiszamolja a derekszogu haromszog oldalainak hosszat.");
        System.out.println("befogok");
        Integer bef1, bef2;
        Scanner bemenetScan = new Scanner(System.in);
        System.out.print("elso befogo erteke: ");
        bef1 = bemenetScan.nextInt();
        System.out.print("masodik befogo erteke: ");
        bef2 = bemenetScan.nextInt();
        System.out.println("A derkszogu haromszog befogoi: " + bef1 + " és " + bef2 + " egyseg");
        //----------
        double atfogo;
        atfogo = Math.sqrt(Math.pow(bef1, 2) + Math.pow(bef2, 2));
        System.out.println("az atfogo erteke: " + atfogo);
        atfogo = Math.floor(atfogo * 1000) / 1000;
        System.out.println("Az atfogo 3 tizedesjegy pontossagal: " + atfogo);
        
        long endTime = System.currentTimeMillis();  // Az időmérés vége
        long duration = endTime - startTime;  // Az eltelt idő
        System.out.println("A program futasi ideje: " + duration + " millisecond.");
    }
}
