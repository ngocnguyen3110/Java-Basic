package Buoi3;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        //Khai báo biến
        int n;
        boolean lasonguyento = true;
        //Nhập từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        n = input.nextInt();
        //Điều kiện là số nguyên tố
        //1. Là số tự nhiên >=2
        //2. Chỉ chia hết cho 1 và chính nó
        if (n < 2) {
            lasonguyento = false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    lasonguyento = false;
                }
            }
        }
        if(lasonguyento){
            System.out.println(n +" Là số nguyên tố");
        }else{
            System.out.println(n +" Không phải là số nguyên tố");
        }
    }
}
