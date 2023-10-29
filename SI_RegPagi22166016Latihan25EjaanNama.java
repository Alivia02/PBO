import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan ejaan nama
 */
public class SI_RegPagi22166016Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Menginputkan nama depan
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        String namaDepan = input.nextLine();
        
        // output
        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah:");

        for (int i = 0; i < namaDepan.length(); i++) {
            char huruf = namaDepan.charAt(i);
            int urutan = i + 1;
            System.out.println("Huruf ke-" + urutan + ": " + huruf);
        }

        input.close();
    }
}
    
