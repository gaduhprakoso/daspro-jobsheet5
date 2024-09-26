import java.util.Scanner;

public class PemilihanBilangan10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0 ) ? "angka " + angka + " termasuk bilangan genap" : "angka " + angka + " termasuk bilangan ganjil";
        System.out.print(hasil);
    }
}

