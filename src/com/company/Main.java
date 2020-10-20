package com.company;

/**
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : PBO12
 * NIM          : 10119008
 * Deskripsi Program    : Program ini berisi tentang cara meng-input data
 *
 */

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        // TODO code application logic here

        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
}
