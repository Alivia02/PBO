import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class SI_RegPagi22166016Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Tampilan Warna Kepribadian =====");
        // Meminta warna favorit
        System.out.print("\u001B[33mPILIH\u001B[0m \u001B[34mWARNA\u001B[0m \u001B[35mFAVORITMU\u001B[0m (merah/hijau/kuning/biru/ungu): ");
        String warna = input.nextLine();
        
        // Meminta nama pengguna
        System.out.print("\u001B[31mNAMA\u001B[0m \u001B[32mKAMU : \u001B[0m ");
        String nama = input.nextLine();

        //judul
        System.out.println("=====Hasil Test Kepribadian "+nama+ "=====");
        
        //Warna favorit
        System.out.println("Warna Favoritmu Adalah "+warna);
        
        // Menggunakan ANSI escape codes untuk memberikan warna pada kata
        String deskripsiKepribadian = "";

        //Pendeskripsian kepribadian tiap warna yang berbeda
        switch (warna.toLowerCase()) {
            case "merah":
                deskripsiKepribadian = "\u001B[31m 1. Periang\n\u001B[0m \u001B[32m2. Pemberani\n"
                        + "\u001B[0m \u001B[33m3. Berani mengambil resiko dalam setiap langkah\n"
                        + "\u001B[0m \u001B[34m4. Menyukai tantangan\n\u001B[0m\u001B[0m \u001B[35m5. Kurang sabar\n"
                        + "\u001B[0m \u001B[36m6. Dapat menahan marah namun jika sudah tahap pundak toleransi, kemarahannya akan sulit dikontrol\n"
                        + "\u001B[0m \u001B[37m7. Memiliki energi kehangatan dan cinta.";
                break;
            case "hijau":
                deskripsiKepribadian = "\u001B[31m 1. Romantis\n\u001B[0m \u001B[32m2. Menyukai hal yang berbau alami dan keindahan\n"
                        + "\u001B[0m \u001B[33m3. Teguh pada prinsip\n"
                        + "\u001B[0m \u001B[34m4. Menginginkan kesempurnaan\n\u001B[0m\u001B[0m \u001B[35m5. Mudah cemburu\n"
                        + "\u001B[0m \u001B[36m6. Mudah merasa iri\n"
                        + "\u001B[0m \u001B[37m7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.";
                break;
            case "kuning":
                deskripsiKepribadian = "\u001B[31m 1. Optimis\n\u001B[0m \u001B[32m2. Suka bergaul\n"
                        + "\u001B[0m \u001B[33m3. Periang\n"
                        + "\u001B[0m \u001B[34m4. Senang menolong\n\u001B[0m\u001B[0m \u001B[35m5. Lincah dan aktif\n"
                        + "\u001B[0m \u001B[36m6. Tidak suka meremehkan kekurangan orang lain\n"
                        + "\u001B[0m \u001B[37m7. Royal\n" 
                        + "\u001B[0m \u001B[38m8. Hangat\n "
                        + "\u001B[0m \u001B[39m9. Meskipun karakternya optimis dan idealis,seringkali goyah dan tidak stabil\n"
                        + "\u001B[0m \u001B[40m10. Cenderung penakut";
                break;
            case "biru":
                deskripsiKepribadian = "\u001B[31m 1. Menyenangkan\n\u001B[0m \u001B[32m2. Bijaksana\n"
                        + "\u001B[0m \u001B[33m3. Pembawaan diri tenang saat menghadapi masalah\n"
                        + "\u001B[0m \u001B[34m4. Dinamis\n\u001B[0m\u001B[0m \u001B[35m5. Senang berbagi\n"
                        + "\u001B[0m \u001B[36m6. Bersahabat\n"
                        + "\u001B[0m \u001B[37m7. Tidak terlalu suka menjadi sorotan banyak orang\n"
                        + "\u001B[0m \u001B[38m8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.";
                break;
            case "ungu":
                deskripsiKepribadian = "\u001B[31m 1. Optimis\n\u001B[0m \u001B[32m2. Tidak Pernah Ragu\n"
                        + "\u001B[0m \u001B[33m3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat\n"
                        + "\u001B[0m \u001B[34m4. Memiliki ambisi yang besar\n\u001B[0m\u001B[0m \u001B[35m5. Memiliki Empati yang besar\n"
                        + "\u001B[0m \u001B[36m6. Memiliki sisi misterius sebab seringkali menutupi perasaannya\n"
                        + "\u001B[0m \u001B[37m7. Terkadang bersikap keras kepala dan angkuh.";
                break;
            default:
                deskripsiKepribadian = "\u001B[0m\u001B[31m Oops...Belum Teridentifikasi.";
                break;
        }

        // Menampilkan hasil deskripsi kepribadian
        System.out.print("\u001B[31mHasil\u001B[0m \u001B[32mtes\u001B[0m \u001B[33mkepribadian\u001B[0m \u001B[34mUntuk\u001B[0m \u001B[35m" + nama + ":\u001B[0m\n");
        System.out.println(deskripsiKepribadian);

    }
    
}
