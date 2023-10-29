import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan waktu saat ini
 */
public class SI_RegPagi22166016Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss", new Locale("id", "ID"));
        String formattedWaktu = waktuSaatIni.format(formatter);
        System.out.println("Hari ini adalah hari: " + formattedWaktu);
    }
    
}
