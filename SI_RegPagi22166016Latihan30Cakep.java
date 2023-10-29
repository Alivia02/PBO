import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA     : ALIVIA FATAH YUMNA
 * KELAS    : PBO RegPagi
 * NIM      : 22166016
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan warna
 */
public class SI_RegPagi22166016Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String teks = "Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini? \n";
        
        String[] kataKunci = teks.split(" "); // Membagi teks menjadi kata-kata

        String[] warna = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};

        String reset = "\u001B[0m";

        for (int i = 0; i < kataKunci.length; i++) {
            int indeksWarna = i % warna.length; // Pilih warna sesuai dengan indeks kata
            System.out.print(warna[indeksWarna] + kataKunci[i] + " " + reset);
        }
        
        
        System.out.print(warna[3]+"Jawab");
        System.out.print(warna[0]+"(Yoi/Enggak):");
        String jawab = input.next();
        if(jawab.equals("Yoi")){
            System.out.println(warna[0]+ "Cakep Bener. Good Job");    
        } else if(jawab.equals("Enggak")){
            System.out.println(warna[4]+"Tetep cakep sih");
            System.out.println(warna[5]+"sing penting paham konsep nya yee");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Silakan masukkan 'Yoi' atau 'Enggak'");
        }
        
    }
    
}
    
