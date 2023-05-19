import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        Prvek hlava = null;
        for(;;){
           int vstup = sc.nextInt();
           if(vstup == 0){
               break;
           }
           //uloz do seznamu
           Prvek novy = new Prvek(vstup, null);
           // novy.dalsiPrvek = hlava;
           //hlava = novy;


            hlava = new Prvek(vstup, hlava);

            //uloz do seznamu spravne
            Prvek novy = new Prvek(vstup, new Prvek(-1, null));
            





        }
       //vypis
        Prvek aktualni = hlava;
        while(aktualni.dalsiPrvek != null){
            System.out.println(aktualni.hodnota);
            aktualni = aktualni.dalsiPrvek;
        }
        System.out.println(aktualni.hodnota);

        //vypis druhym zpusobem


    }
}