import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inputan = new Scanner(System.in);
        Pajak hitungPajak;
        
        boolean input = true;
    
        while (input) {
            
            System.out.println("masukan vendor hp: ");
            String vendor =  inputan.next();

            System.out.println("masukan tipe hp: ");
            String tipe =  inputan.next();

            System.out.println("masukan harga belum ppn hp: ");
            Double hargaBelumPPN =  inputan.nextDouble();

            hitungPajak = new Pajak(vendor, tipe, hargaBelumPPN);
            double harga = hitungPajak.getHitungHargaPPN(hargaBelumPPN);

            //double hargaBersih = (hargaBelumPPN + harga );

            System.out.println("hp dengan vendor " + vendor + " tipe " + tipe + " harganya: " + harga);
            
            System.out.println("apakah anda ingin melanjutkan (y/n) : ");
            String isLanjut = inputan.next();

            if (isLanjut.equalsIgnoreCase("y")) {
                input = true;
            }
            else if (isLanjut.equalsIgnoreCase("n")) {
                input = false;
            }

        }

    }
}
