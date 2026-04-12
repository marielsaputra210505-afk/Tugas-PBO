//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class Konstant {
    public static void main(String[] args) {
        final float PHI = 3.14f;
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        float r = s.nextFloat();

        System.out.println("Luas lingkaran: " + (PHI * r * r));

        s.close();
    }
}
