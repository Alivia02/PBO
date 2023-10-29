import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan niali terbesar dan terkecil
 */
public class SI_RegPagi22166016Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan nama petugas: ");
        String nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahAngka = input.nextInt();

        if (jumlahAngka <= 0) {
            System.out.println("Jumlah angka harus lebih dari 0.");
            return;
        }

        int angka;
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka;
            }

            if (angka < nilaiTerkecil) {
                nilaiTerkecil = angka;
            }
        }
        System.out.println("======Hasil Nilai Mahasiswa====");
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);

        input.close();
    }
}
