/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author ZUNAIRA
 */
public class Game {

    public static void main(String[] args) {
        //Buat Objek
       player hero = new player();
       
       hero.name = "Adi";
       hero.speed = 60;
       hero.healthPoint= 0;
       hero.damage = 40;
       hero.armor = 30;
       hero.run();
       hero.attack();
       hero.defend();
       
       if(hero.isDead()){
           System.out.println("Game over :( ");
       } else{
           System.out.println("masih hidup");
       }
    }
}
