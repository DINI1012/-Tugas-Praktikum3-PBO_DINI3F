package Matematika;

/**
 *
 * @author DINI
 */
public class Matematika {
    // mendeklarasikan variabel
    int a, b;
    int pertambahan = 0;
    int pengurangan = 0;
    int perkalian = 0;
    int pembagian = 0;
    // method pertambahan
    public void pertambahan(int a,int b){
        pertambahan = a+b;
        System.out.println("Pertambahan :"+a+"+"+b+"="+pertambahan);
    }
    // method pengurangan
    public void pengurangan(int a, int b){
        pengurangan = a-b;
        System.out.println("Pengurangan : "+a+"-"+b+"="+pengurangan);
    }
    // method perkalian
    public void perkalian(int a){
        perkalian = a*b;
        System.out.println("Perkalian : "+a+"*"+b+"="+perkalian);
    }
    // method pembagian
    public void pembagian(int a, int b){
        pembagian = a/b;
        System.out.println("Pembagian : "+a+"/"+b+"="+pembagian);
    }
}
    
