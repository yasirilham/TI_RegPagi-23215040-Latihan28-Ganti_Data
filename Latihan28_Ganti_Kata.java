/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Mengganti Kata Dalam Sebuah Kalimat
 */
import java.util.Scanner;
public class Latihan28_Ganti_Kata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String gantiKata = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String menjadiKata = scanner.nextLine();

        String kalimatBaru = kalimat.replace(gantiKata, menjadiKata);

        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}
