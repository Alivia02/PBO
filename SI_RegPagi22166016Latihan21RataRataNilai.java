import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan rata-rata nilai
 */
public class SI_RegPagi22166016Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jumlah, x, rata;
        System.out.print("Masukkan Banyaknya Mahasiswa:");
        n = masuk.nextInt();
        jumlah = 0;
        i=1;
        while (i<=n){
            System.out.print("Nilai Mahasiswa ke-"+i+": ");
        x=masuk.nextFloat();
        jumlah += x;
        i++;
        }
        rata = jumlah / n;
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata);   
        }
    }