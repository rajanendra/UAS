package matematika;

public class Matematika {
    int hasil;

    void pertambahan(int a, int b) {
        hasil = a + b;
        System.out.println("Hasil Pertambahan : " + a + " + " + b + " : " + hasil);
    }

    void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Hasil Pengurangan :" + a + " - " + b + " : " + hasil);
    }

    void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Hasil Perkalian : " + a + " * " + b + " : " + hasil);
    }

    void pembagian(int a, int b) {
        hasil = a / b;
        System.out.println("Hasil Pembagian : " + a + " / " + b + " : " + hasil);
    }
}
