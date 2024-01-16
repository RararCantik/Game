package com.mycompany.game3;

class Drone {
    int energi;
    int ketinggian;
    int kecepatan;

    void belok() {
        // Definisi belok
        System.out.println("Belok");
    }

    void maju() {
        // Definisi maju
        System.out.println("Maju");
    }

    void matikanMesin() {
        // Definisi matikanMesin
        System.out.println("Matikan Mesin");
    }

    void mundur() {
        // Definisi mundur
        System.out.println("Mundur");
    }

    void turun() {
        // Definisi turun
        System.out.println("Turun");
    }

    boolean terbang() {
        // Definisi terbang
        System.out.println("Terbang");
        return true; // Atau false tergantung logika game Anda
    }
}