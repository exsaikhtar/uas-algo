/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exa2;
public class Main {
    public static void main(String[] args) {
        // Pegawai
        Pegawai p1 = new Pegawai("John", "Laki-laki", "101", true);
        Pegawai p2 = new Pegawai("Jane", "Perempuan", "102", false);

        System.out.println("Pegawai 1:");
        p1.toShow();
        System.out.println("Tunjangan: " + p1.getTunjangan());
        System.out.println();

        System.out.println("Pegawai 2:");
        p2.toShow();
        System.out.println("Tunjangan: " + p2.getTunjangan());
        System.out.println();

        // Programmer
        Programmer pr1 = new Programmer("Mike", "Laki-laki", "201", false, 5, 5000000);
        Programmer pr2 = new Programmer("Anna", "Perempuan", "202", true, 2, 4500000);
        Programmer pr3 = new Programmer("Tom", "Laki-laki", "203", true, 12, 8000000);

        System.out.println("Programmer 1:");
        pr1.toShow();
        System.out.println("Tunjangan: " + pr1.getTunjangan());
        System.out.println("Bonus: " + pr1.getBonus());
        System.out.println();

        System.out.println("Programmer 2:");
        pr2.toShow();
        System.out.println("Tunjangan: " + pr2.getTunjangan());
        System.out.println("Bonus: " + pr2.getBonus());
        System.out.println();

        System.out.println("Programmer 3:");
        pr3.toShow();
        System.out.println("Tunjangan: " + pr3.getTunjangan());
        System.out.println("Bonus: " + pr3.getBonus());
    }
}
                                                        
