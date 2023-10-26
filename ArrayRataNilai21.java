package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int mhsLulus = 0;
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scan21.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                mhsLulus += 1;
            }
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Jumlah mahasiswa lulus = " + mhsLulus);
        System.out.print("Rata-rata nilai = " + rata2);

    }
}
