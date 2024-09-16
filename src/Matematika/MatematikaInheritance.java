package Matematika;
/**
 *
 * @author DINI
 */
public class MatematikaInheritance {

    public static void main(String[] args) {
        // membuat objek dari class Matematika2
        Matematika2 m2 = new Matematika2();
        // memanggil setiap methodnya
        m2.pertambahan(20,10);
        m2.pengurangan(10, 5);
        m2.perkalian(10*3);
        m2.pembagian(21,2);
        m2.setNilai(21,5);
        // memanggil method dari modulus
          System.out.println("Modulus: " + m2.modulus());

    }
}
