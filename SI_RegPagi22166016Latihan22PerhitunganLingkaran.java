import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan perhitungan 
 */
public class SI_RegPagi22166016Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("========Perhitungan Lingkaran========");
        double phi = 3.14;
        System.out.print("Masukkan nilai diameter lingkaran :");
        double diameter= input.nextInt();
        double jarijari = diameter / 2;
        double luas = phi * jarijari*jarijari;
        double keliling = 2 * phi * jarijari;
        System.out.println("========Hasil diameter Lingkaran========");
        System.out.println("Jari-jari Lingkaran = "+jarijari + "cm");
        System.out.println("Luas Lingkaran = "+luas + "cm");
        System.out.println("Keliling Lingkaran = "+keliling + "cm");
                
    }
    
}
