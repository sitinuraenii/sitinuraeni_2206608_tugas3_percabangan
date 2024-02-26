/*Buatlah algoritma dalam bahasa Java, yang menerima tiga buah angka masukan dan
menampilkan nilai yang paling besar dari ketiga masukan.*/
package nilai;

import java.util.Scanner;

public class Nilai {

    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        
        System.out.print("Masukkan 3 angka : ");
        int angka1 = nilai.nextInt();
        int angka2 = nilai.nextInt();
        int angka3 = nilai.nextInt();
        
        int max = Math.max(angka1, Math.max(angka2, angka3));
        
        System.out.println("Nilai terbesar dari " + angka1 + ", " + angka2 + ", " + angka3 + " adalah = " + max);
    }
    
}
