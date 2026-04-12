//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class KasusSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan huruf: ");
        char c = s.next().charAt(0);

        switch (c) {
            case 'a': System.out.println("Huruf a"); break;
            case 'i': System.out.println("Huruf i"); break;
            case 'u': System.out.println("Huruf u"); break;
            case 'e': System.out.println("Huruf e"); break;
            case 'o': System.out.println("Huruf o"); break;
            default: System.out.println("Huruf mati");
        }

        s.close();
    }
}
