package Matematika;
/**
 *
 * @author DINI
 */
public class Matematika2 extends Matematika {
    // Variabel instance untuk menyimpan nilai a dan b
    private int a;
    private int b;

    // Setter untuk mengisi nilai a dan b
    public void setNilai(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method modulus tanpa parameter, menggunakan variabel instance a dan b
    public int modulus() {
        return a % b;
    }
}