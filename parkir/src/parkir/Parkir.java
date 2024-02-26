/*Menentukan biaya parkir berdasarkan lama parkir yang dihitung berdasarkan selisih
jam masuk dan jam keluar (dengan ketentuan seperti soal no 1). Biaya parkir 2 jam
pertama 1500 dan perjam berikutnya 1000.
1000. Contoh:
Jam Masuk Jam Keluar Lama Parkir Tarif Parkir (Rp)
8 9 1 Jam 1500
8 11 Lama Parkir 3 Jam 2500
11 3 Lama Parkir 4 Jam 3500
10 8 Lama Parkir 10 Jam 9500*/
package parkir;

import java.util.Scanner;
public class Parkir {

    public static void main(String[] args) {
        Scanner parkir = new Scanner(System.in);

        System.out.print("Masukkan jam masuk : ");
        int jamMasuk = parkir.nextInt();
        System.out.print("Masukkan jam keluar : ");
        int jamKeluar = parkir.nextInt();

        int lamaParkir=1500, jauh, total;
        
        if (jamMasuk < jamKeluar){
            lamaParkir = jamKeluar-jamMasuk;
        }else if (jamMasuk>jamKeluar){
            lamaParkir = (jamKeluar+12)-jamMasuk;
        }
        
        System.out.println("lama parkir : " + lamaParkir + " jam");
        
        if (lamaParkir <= 2){
            System.out.println("Parkir 1500");
        } else if (lamaParkir>2) {
           jauh = (lamaParkir-2) * 1000;
           total = 1500 + jauh;
           System.out.println("anda membayar parkir seharga : " + total);
        }
    }
}