import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taksimetre Programına Hoşgeldiniz!");
        int km, acilisUcreti = 10;
        double kmBasiUcret = 2.20, toplamUcret;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek Km : ");
        km = input.nextInt();

        toplamUcret = acilisUcreti + (kmBasiUcret * km);

        if(toplamUcret <= 20){
            toplamUcret = 20.0;
        }

        System.out.println("Ödenecek Ücret : " + toplamUcret + " TL");

    }
}