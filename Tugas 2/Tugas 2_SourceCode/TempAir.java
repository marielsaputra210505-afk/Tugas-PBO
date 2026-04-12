//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class TempAir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan suhu (C): ");
        int T = s.nextInt();

        if (T < 0) {
            System.out.println("Wujud: Beku");
        } else if (T <= 100) {
            System.out.println("Wujud: Cair");
        } else {
            System.out.println("Wujud: Uap/Gas");
        }

        s.close();
    }
}
