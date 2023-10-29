import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan huruf besar dan kecil
 */
public class SI_RegPagi22166016Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // untuk memasukkan kalimat
        System.out.println("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        //konversi ke huruf kapital
        String hurufKapital = kalimat.toUpperCase();
        
        //konversi ke huruf kecil
        String hurufKecil = kalimat.toLowerCase();
        
        //menampilkan output
        System.out.println("Kalimat dalam huruf besar/kapital : " + hurufKapital);
        System.out.println("Kalimat dalam huruf kecil : " + hurufKecil);
    }
    
}
