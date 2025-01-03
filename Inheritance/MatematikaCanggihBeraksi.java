package Inheritance;

public class MatematikacanggihBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Matematikacanggih mtk = new Matematikacanggih();
        mtk.pilihan();

        System.out.print("Masukkan Pilihan anda : ");
        mtk.pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama : ");
        mtk.angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua : ");
        mtk.angka2 = input.nextInt();

        mtk.getpilihan();
    }
}
