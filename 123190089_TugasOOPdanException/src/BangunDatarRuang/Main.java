package BangunDatarRuang;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilih;
        char loop;
        boolean nilai;
        
        do{
        nilai = false;
        System.out.println("===================================");
        System.out.println("PROGRAM BANGUN DATAR & BANGUN RUANG");
        System.out.println("===================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.println("7. Silinder");
        System.out.println("0. Keluar");
        
        try {
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            switch(pilih) {
                case 1 -> persegi();
                case 2 -> persegiPanjang();
                case 3 -> lingkaran();
                case 4 -> segitiga();
                case 5 -> kubus();
                case 6 -> balok();
                case 7 -> silinder();
                case 0 -> System.exit(0);
                default -> System.out.println("Tidak ada dalam pilihan!");             
            }
            System.out.print("\nKembali ke menu (y/n) : ");
        } catch(Exception error) {
            System.out.println("Tidak dapat dikonversi ke angka, masukkan angka saja!");
            nilai = true;
        } 
          loop = input.next().charAt(0);
          System.out.println();
        } while (nilai || loop=='y' || loop=='Y');  
    }
    
    private static void persegi(){
        double sisi;
        
            System.out.print("\nMasukkan sisi : ");
            sisi = input.nextDouble();
            BangunDatar persegi = new Persegi(sisi);
            System.out.println("\nLuas Persegi: " + persegi.luas());
            System.out.println("Keliling Persegi: " + persegi.keliling());     
    }
    
    private static void persegiPanjang(){
        double panjang, lebar;
        
            System.out.print("\nMasukkan panjang : ");
            panjang = input.nextDouble();
            System.out.print("Masukkan lebar : ");
            lebar = input.nextDouble();
            BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
            System.out.println("\nLuas Persegi Panjang: " + persegiPanjang.luas());
            System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling()); 
    }
    
    private static void lingkaran(){
        double jari;
   
            System.out.print("\nMasukkan jari-jari : ");
            jari = input.nextDouble();
            BangunDatar lingkaran = new Lingkaran(jari);
            System.out.println("\nLuas Lingkaran: " + lingkaran.luas());
            System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
    }
    
    private static void segitiga(){
        double alas, tinggi, sisi1, sisi2, sisi3;
      
            System.out.print("\nMasukkan alas segitiga : ");
            alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga : ");
            tinggi = input.nextDouble();
            System.out.print("Masukkan sisi 1 segitiga : ");
            sisi1 = input.nextDouble();
            System.out.print("Masukkan sisi 2 segitiga : ");
            sisi2 = input.nextDouble();
            System.out.print("Masukkan sisi 3 segitiga : ");
            sisi3 = input.nextDouble();
            BangunDatar segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
            System.out.println("\nLuas Segitiga: " + segitiga.luas());
            System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
    
    private static void kubus(){
        double sisi;
        
            System.out.print("\nMasukkan sisi : ");
            sisi = input.nextDouble();
            BangunRuang kubus = new Kubus(sisi);
            System.out.println("\nLuas Alas Kubus : " + kubus.luas());
            System.out.println("Keliling Alas Kubus : " + kubus.keliling());
            System.out.println("Volume Kubus : " + kubus.volume());
            System.out.println("Luas Permukaan Kubus : " + kubus.luasPermukaan());
    }
    
    private static void balok(){
        double panjang, lebar, tinggi;
  
            System.out.print("\nMasukkan panjang : ");
            panjang = input.nextDouble();
            System.out.print("Masukkan lebar : ");
            lebar = input.nextDouble();
            System.out.print("Masukkan tinggi : ");
            tinggi = input.nextDouble();
            BangunRuang balok = new Balok(panjang, lebar, tinggi);
            System.out.println("\nLuas Alas Balok : " + balok.luas());
            System.out.println("Keliling Alas Balok : " + balok.keliling());
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas Permukaan Balok : " + balok.luasPermukaan());
    }
    
    private static void silinder(){
        double jari, tinggi;
  
            System.out.print("\nMasukkan jari-jari : ");
            jari = input.nextDouble();
            System.out.print("Masukkan tinggi : ");
            tinggi = input.nextDouble();
            BangunRuang silinder = new Silinder(jari, tinggi);
            System.out.println("\nLuas Alas Silinder: " + silinder.luas());
            System.out.println("Keliling Alas Silinder: " + silinder.keliling());
            System.out.println("Volume Silinder: " + silinder.volume());
            System.out.println("Luas Permukaan Silinder: " + silinder.luasPermukaan());
    }
    
}
