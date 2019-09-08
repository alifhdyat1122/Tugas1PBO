/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bangunruang = new Scanner(System.in); //memanggil library
        Ngitung itung = new Ngitung(); //Memanggil class Ngitung
        
        do {
            System.out.print("= = = = = = = = M E N U = = = = = = = = \n1. K U B U S \n2. B O L A \n3. T A B U N G \n4. E X I T \nPilih Menu   : "); //Menu 
            int menu = bangunruang.nextInt(); //input menu
            System.out.println();
            switch (menu) {
                case 1: { //pilihan menu 1 
                    System.out.println("1. Volume Kubus");
                    System.out.println("2. Luas PermukaanKubus");
                    System.out.print("Pilih Menu  : ");  
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    if (pilih == 1) { //pilihan pilih 1 dalam menu 1
                        System.out.println("= = = = = Volume Kubus = = = = =");
                        System.out.print("Masukkan Rusuk  : "); 
                        double rusuk = bangunruang.nextDouble(); //input tusuk
                        System.out.print(itung.VolumeKubus(rusuk)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm3");
                        System.out.println();
                    } else if (pilih == 2) { //pilihan pilih 2 dalam menu 1
                        System.out.println("= = = = = Luas Permukaan Kubus = = = = =");
                        System.out.print("Masukkan Rusuk  : ");
                        double rusuk = bangunruang.nextDouble(); //input rusuk
                        System.out.print(itung.LuasPermKubus(rusuk)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm2");
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.println("1. Volume Bola");
                    System.out.println("2. Luas Permukaan Bola");
                    System.out.print("Pilih Menu  : ");                    
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    if (pilih == 1) { //pilihan pilih 1 dalam menu 2
                        System.out.println("= = = = = Volume Bola = = = = =");
                        System.out.print("Masukkan Jari-Jari  : ");
                        double jari = bangunruang.nextDouble(); //input jari
                        System.out.print(itung.VolumeBola(jari)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm3");
                        System.out.println();
                    } else if (pilih == 2) { //pilihan pilih 2 dalam menu 2
                        System.out.println("= = = = = Luas Permukaan Bola = = = = =");
                        System.out.print("Masukkan Jari-Jari  : ");
                        double jari = bangunruang.nextDouble(); //input jari
                        System.out.print(itung.LuasPermBola(jari)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm2");
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("1. Volume Tabung");
                    System.out.println("2. Luas Permukaan Tabung");
                    System.out.print("Pilih Menu  : ");
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    if (pilih == 1) { //pilihan pilih 1 dalam menu 3
                        System.out.println("= = = = = Volume Tabung = = = = =");
                        System.out.print("Masukkan Jari-Jari  : ");
                        double jari1 = bangunruang.nextDouble(); //input jari1
                        System.out.print("Masukkan Tinggi Tabung  : ");
                        double tinggi1 = bangunruang.nextDouble(); //input tinggi1
                        System.out.print(itung.VolumeBola(jari1)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm3");
                        System.out.println();
                    } else if (pilih == 2) { //pilihan pilih 2 dalam menu 3
                        System.out.println("= = = = = Luas Permukaan Tabung = = = = =");
                        System.out.print("Masukkan Jari-Jari  : ");
                        double jari1 = bangunruang.nextDouble(); //input jari1
                        System.out.print("Masukkan Tinggi Tabung  : ");
                        double tinggi1 = bangunruang.nextDouble(); //input tinggi1
                        System.out.print(itung.LuasPermBola(jari1)); //memanggil Proses matematika yang sudah di deklarasikan pada class Ngitung
                        System.out.println("Cm2");
                        System.out.println();
                    }
                    break;
                }
                default:
                case 4: {
                    exit(0);
                }
            }
        } while (true);
    }
    
}
