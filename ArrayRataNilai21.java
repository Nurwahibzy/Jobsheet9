package Jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int mhsLulus = 0, mhsTdkLulus = 0, jmlMhs, nilaiMhsLulus= 0, nilaiMhsTdkLulus = 0;
        double total = 0;
        double rataMhsLulus = 0 , rataMhsTdkLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = scan21.nextInt();
        
        int[] nilaiMhs = new int[jmlMhs]; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scan21.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                nilaiMhsLulus += nilaiMhs[i];
                mhsLulus += 1;
            }else {
                nilaiMhsTdkLulus += nilaiMhs[i];
                mhsTdkLulus +=1;
            }
        }
        rataMhsLulus = nilaiMhsLulus / mhsLulus;
        rataMhsTdkLulus = nilaiMhsTdkLulus / mhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = " + rataMhsLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataMhsTdkLulus);
        
    }
}
