import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan jenis tipe data bilangan bulat
 */
public class SI_RegPagi22166016Latihan17Tunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("=========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        double gajipokok = input.nextDouble();
        System.out.println("Gaji Pokok: Rp. "+gajipokok);
        
        System.out.println("Status anda? (Menikah/Belum) : ");
        String status = "Menikah";
        System.out.println("Status anda: "+status);
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji pokok : Rp. "+gajipokok);
        double tunjangan = (status== "Menikah") ? 0.35*gajipokok:0;
        System.out.println("Tunjangan : Rp. "+ tunjangan);
        
        double totalgaji = gajipokok+tunjangan;
        System.out.println("Total gaji : Rp "+totalgaji);
    }
    
}
