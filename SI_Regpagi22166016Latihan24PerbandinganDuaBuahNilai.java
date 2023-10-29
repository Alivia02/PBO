import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan perbandingan dua buah nilai
 */
public class SI_Regpagi22166016Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        
        System.out.println("============Program Perbandingan Nilai===========");

        do {
            System.out.print("Masukkan nilai pertama: ");
            double nilai1 = input.nextDouble();
            System.out.print("Masukkan nilai kedua: ");
            double nilai2 = input.nextDouble();

            if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            System.out.println();
            System.out.print("Ulangi perbandingan? (Ya/Tidak): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');
    }
}
