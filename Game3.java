/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game3;

import java.util.Scanner;

public class Game3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Game Senjata!");
        System.out.println("Pilih senjata:");
        System.out.println("1. Pistol");
        System.out.println("2. Shotgun");
        System.out.println("3. Bazooka");

        int pilihanSenjata = scanner.nextInt();
        Senjata senjataPilihan;

        switch (pilihanSenjata) {
            case 1:
                senjataPilihan = new Senjata("Pistol", "Colt M1911", 10, 1.2, "Hitam");
                break;
            case 2:
                senjataPilihan = new Senjata("Shotgun", "Remington 870", 5, 3.5, "Coklat");
                break;
            case 3:
                senjataPilihan = new Senjata("Bazooka", "RPG-7", 1, 5.0, "Abu-abu");
                break;
            default:
                System.out.println("Pilihan tidak valid. Menggunakan Pistol sebagai default.");
                senjataPilihan = new Senjata("Pistol", "Colt M1911", 10, 1.2, "Hitam");
        }

        System.out.println("Anda memilih " + senjataPilihan.getNamaSenjata() + ". Selamat bermain!");

        senjataPilihan.tembak();
        senjataPilihan.lempar();
        senjataPilihan.reload();
    }
}