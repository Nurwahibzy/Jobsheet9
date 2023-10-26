package Jobsheet9;

import java.util.Scanner;

public class LinearSearch21 {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int jmlElemen, key = 0, hasil = 0;

        System.out.print("Masukkan jumlah elemen : ");
        jmlElemen = scan21.nextInt();

        int[] arrayint = new int[jmlElemen];

        for (int i = 0; i < arrayint.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + " : ");
            arrayint[i] = scan21.nextInt();
        }
        System.out.print("Masukkan key yang dicari : ");
        key = scan21.nextInt();
        for (int j = 0; j < arrayint.length;j++) {
            if (arrayint[j] == key) {
                hasil = j;
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
                break;
            } else{
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}
