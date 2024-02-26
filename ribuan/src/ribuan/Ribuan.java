/*Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
periksa apakah masukan adalah ribuan.*/
package ribuan;
import java.util.Scanner;
public class Ribuan {
    
    public static void main(String[] args) {
       Scanner ribuan = new Scanner (System.in);
       
       System.out.print("Masukkan tiga angka (ribuan/tidak): ");
       int angka1 = ribuan.nextInt();
       int angka2 = ribuan.nextInt();
       int angka3 = ribuan.nextInt();
       
       boolean ribuann = cekribuan(angka1, angka2, angka3);
       
       if (ribuann) {
           System.out.println("Angka tersebut merupakan ribuan");
       }else {
           System.out.println("Angka tersebut bukan ribuan");
       }
    }
    public static boolean cekribuan (int angka1, int angka2, int angka3){
           return (angka1 >= 1000 && angka1 < 10000)&&
                   (angka2 >= 1000 && angka2 < 10000) && 
                   (angka3 >= 1000 && angka3 < 10000);
       }
    
}
