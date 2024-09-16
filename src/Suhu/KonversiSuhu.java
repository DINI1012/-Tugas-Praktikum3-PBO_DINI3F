package Suhu;
/**
 *
 * @author DINI
 */
public class KonversiSuhu {
    // deklarasi variabel
    // menggunakan double karna angka yang diinputkan berupa /
    double celcius;
    double fahrenheit;
    double reamur; 
    // Method untuk mengonversi Celcius ke Fahrenheit
    public void celciusToFahrenheit(double celcius) {
        fahrenheit = (celcius * 9/5) + 32;
        // rumus konversi dari celcius ke fahrenheit
        System.out.println("Konversi Celcius ke Fahrenheit: " + celcius + "C = " + fahrenheit + "F");
    }  
        public void celciusToReamur(double celcius) {
        reamur = celcius * 4/5;
        // Rumus konversi dari Celcius ke Reamur: Celcius * 4/5
        System.out.println("Konversi Celcius ke Reamur: " + celcius + "C = " + reamur + "R");
    }
}
