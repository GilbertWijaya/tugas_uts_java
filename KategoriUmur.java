import java.util.Scanner;

public class KategoriUmur {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String kategori = "";
        boolean input = true;

        while (input) {
            System.out.println("masukan nama anak: ");
            String nama = scanner.next();
            System.out.println("masukan umur anak: ");
            int umur = scanner.nextInt();
            

            if (umur < 5) {
                kategori = "balita";
            }
            else if (umur <= 5 && umur < 12) {
                kategori = "anak";
            }
            else if (umur >= 12 && umur < 18) {
                kategori = "remaja";
            }
            else if (umur >= 18 && umur < 40) {
                kategori = "dewasa";
            }
            else if (umur >= 40 && umur < 60) {
                kategori = "paruhbaya";
            }
            else if (umur >= 60) {
                kategori = "lanjut usia";
            }

            
            System.out.println("nama : " + nama + " umur " + umur + " kategori " + kategori);

            System.out.println("apakah anda ingin melanjutkan (y/n) : ");
            String isLanjut = scanner.next();

            if (isLanjut.equalsIgnoreCase("y")) {
                input = true;
            }
            else if (isLanjut.equalsIgnoreCase("n")) {
                input = false;
            }

        }
        

    }
}