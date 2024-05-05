package Buoi3;

import java.util.Scanner;

public class soChanLe {
    public static void main (String[] args){
        //Khai bao bien
        int so;
        //Nhap tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra chẵn lẻ: ");
        so = input.nextInt();
        //Dieu kien kiem tra
        if (so % 2 == 0){
            System.out.println(so +" là số chẵn");
        }
        else {
            System.out.println(so +" là số lẻ");
        }
    }
}
