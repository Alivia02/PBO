import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SI_RegPagi22166016Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // variabel awal
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 6;
        
        //menghitung saldo awal
        double saldo = saldoAwal;
        for (int i = 1; i <= lama; i++) {
            saldo+= saldo * bunga;
        
        //menampilkan hasil inputan
            System.out.println("Saldo anda bulan ke- " + i + " Rp " + saldo);
        }
    }
    
}
