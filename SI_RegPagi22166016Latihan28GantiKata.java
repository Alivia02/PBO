import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan ganti kata
 */
public class SI_RegPagi22166016Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====");
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();
        
        System.out.print("Ganti kata: ");
        String GantiKata = input.next();
        
        System.out.print("Menjadi kata: ");
        String  MenjadiKata = input.next();
        
        String KalimatBaru = kalimat.replace(GantiKata, MenjadiKata);
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal: "+kalimat);
        System.out.println("Kalimat baru: "+KalimatBaru);
    }
    
}
