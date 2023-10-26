package Jobsheet9;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int jmlElemen;
        double total = 0, rata2 = 0;
        int nilaiTertinggi = 0, nilaiTerendah = 0;
        System.out.print("Masukkan jumlah elemen : ");
        jmlElemen = scan21.nextInt();

        int[] array = new int[jmlElemen];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            array[i] = scan21.nextInt();
            total += array[i];
        }

        nilaiTerendah = array[0];
        nilaiTertinggi = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] < nilaiTerendah) {
                nilaiTerendah = array[j];
            }
            if (array[j] > nilaiTertinggi) {
                nilaiTertinggi = array[j];
            }
        }
        rata2 = total / jmlElemen;
        System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi);
        System.out.println("Niilai terendah adalah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata adalah: " + rata2);
        scan21.close();
    }
}
