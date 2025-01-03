package mobil;

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilDiah = new Mobil();
        
        mobilDiah.warna = "pink";
        mobilDiah.tahunProduksi = 1960;
        
        System.out.println("Warna : " + mobilDiah.warna);
        System.out.println("Tahun produksi : " + mobilDiah.tahunProduksi);
    }
}
