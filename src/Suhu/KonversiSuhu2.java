package Suhu;
/**
 *
 * @author DINI
 */
public class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengonversi Fahrenheit ke Reamur
    public void fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        reamur = celcius * 4/5;
        System.out.println("Konversi Fahrenheit ke Reamur: " + fahrenheit + "F = " + reamur + "R");
    }
}

