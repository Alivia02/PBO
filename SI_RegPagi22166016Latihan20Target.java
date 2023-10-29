import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan Target saldo tabungan
 */
public class SI_RegPagi22166016Latihan20Target {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input variabel
        double saldoAwal = 3500000;
        double bungaPerbulan = 8.0;
        double saldoTarget = 6000000;
        
        
        DecimalFormat df = new DecimalFormat ("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);
        
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (bungaPerbulan/100);
            saldoAwal += bunga;
            bulan++;
            
            String saldoBulanFormatted = df.format(saldoAwal);
            System.out.println("Saldo di bulan ke-" + bulan + " Rp " + saldoBulanFormatted);
    }
    }   
}

