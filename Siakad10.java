import java.util.Scanner;

public class Siakad10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variabel beserta tipe data
        String nama, nim, kualifikasi, huruf;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // kode untuk input data mahasiswa
        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan Nomor Absen: ");
        absen = sc.nextByte();

        // kode input nilai mahasiswa
        System.out.print("Masukan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        // kode untuk menghitung nilai akhir(rerata semua nilai)
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        // kode konversi nilai akhir ke huruf dan kualifikasi
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            huruf = "B+";
            kualifikasi = "Lebih Dari Baik";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            huruf = "C+";
            kualifikasi = "Lebih Dari Cukup";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            huruf = "D";
            kualifikasi = "Kurang";
        } else {
            huruf = "E";
            kualifikasi = "Gagal";
        }
        // menampilkan program
        System.out.print("Mahasiswa dengan Nama " + nama + " (NIM " + nim + ") ");
        System.out.println("Kelas " + kelas + " Absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " + huruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}