package Jobsheet9;

public class LinearSearch21 {
    public static void main(String[] args) {

        int[] ArrayInt = { 34, 18, 26, 48, 72, 20, 56, 63 };
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < ArrayInt.length; i++) {
            if (ArrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
    }
}
