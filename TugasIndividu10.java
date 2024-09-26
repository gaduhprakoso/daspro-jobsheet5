import java.util.Scanner;

public class TugasIndividu10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;
        String kategoriUsia = "";

        System.out.print("masukan usia anda: ");
        usia = input.nextInt();

        if (usia >=0 && usia <=12){
            kategoriUsia = "Anak";
        }else if(usia>= 13 && usia <= 19){
            kategoriUsia = "Remaja";
        }else if (usia>= 20 && usia <= 64){
            kategoriUsia = "Dewasa";
        }else if (usia >= 65){
            kategoriUsia = "Lansia";
        }else{
            System.out.print("input tidak valid");
            return;
        }
            System.out.print("usia "+usia+" masuk dalam kategori "+ kategoriUsia);
    }   
}
