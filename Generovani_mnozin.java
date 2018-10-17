package mnoziny;
import java.util.Scanner;
import java.util.Random;
public class Generovani_mnozin {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static int[] generovaniPrvniMnoziny(){
        System.out.println("Zadejte počet prvků množiny, rozmezí je od 10 do 20");
        int pocetPrvku1 = sc.nextInt();
        while (pocetPrvku1<10||pocetPrvku1>20){
                    pocetPrvku1 = sc.nextInt();
        }
        int odpocet = 0;
        int[] mnozina1 = new int[pocetPrvku1];
        while (odpocet<pocetPrvku1){
            mnozina1[odpocet]=rd.nextInt(30)-20;
            odpocet++;
        }
        return mnozina1;
        }
    }
