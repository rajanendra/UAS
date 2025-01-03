package Polymorphism;

public class MatematikaCanggih extends Matematika {
    //  overload modulus 
  void modulus(double a ,double b , double c){
      hasilDouble = a % b % c;
      System.out.println("Hasil Modulus: " + hasilDouble);
  }
  void modulus(int a ,int b , int c){
      hasilInt = a % b % c;
      System.out.println("Hasil Modulus: " + hasilInt);
  }
  void modulus(int a ,int b){
      hasilInt = a % b;
      System.out.println("Hasil Modulus: " + hasilInt);
  }
  void modulus(double a ,double b){
      hasilDouble = a % b ;
      System.out.println("Hasil Modulus: " + hasilDouble);
  }

  // Method operasiGabungan
  int operasiGabungan(int a , int b , int c){
      return a + (b * c);
  }
}