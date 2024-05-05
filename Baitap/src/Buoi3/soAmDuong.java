package Buoi3;

import java.util.Scanner;

public class soAmDuong {
    public static void main (String[] args){
        //Khai bao bien
        double so;
        //Nhap tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        so = input.nextDouble();
        //Dieu kien kiem tra
        if (so > 0){
            System.out.println(so +" là số dương");
        }
        else if(so<0){
            System.out.println(so +" là số âm");
        }
    }
}
