public class Pajak {

    private String vendor;
    private String tipe;
    private double harga;
    private double ppn;

    public Pajak(String vendor, String tipe,double hargaBelumPPN) {

        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = hargaBelumPPN;
        //this.ppn = ppn;
    }
    public Pajak(){

    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void setHarga(double hargaBelumPPN) {
        this.harga = hargaBelumPPN;
    }

    public String getVendor() {
        return this.vendor;
    }
    public String getTipe() {
        return this.vendor;
    }
    public double getHarga() {
        return this.harga;
    }

    public double getHitungHargaPPN(double harga) {
        
        
        if (harga <= 4000000) {

            this.ppn = 0.01; //1%

        } else if (harga >= 4200000 && harga <= 4500000) {

            this.ppn = 0.02; //2%

        } else if (harga > 4500000) {

            this.ppn = 0.05; //3&
            
        }else{
            this.ppn = 0.005;//lainya
        }

        return this.harga = (harga +  (harga * ppn));
    }

}
