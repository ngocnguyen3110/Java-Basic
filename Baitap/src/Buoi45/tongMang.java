package Buoi45;

import java.util.Scanner;

public class tongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng: ");
        int n = sc.nextInt();
        //Khai báo mảng có kiểu dữ liệu double
        double[] arr = new double[n];
        double total = 0;

        //Dùng vòng lặp để nhập giá trị mảng theo kích thước đã khai báo
        for(int i = 0;i<arr.length;i++){
            System.out.println("Nhập giá trị cho phần tử thứ: " + (i + 1));
            arr[i] = sc.nextDouble();
        }
        sc.close();
        //Dùng for để tính Tổng
        for(int i = 0; i<arr.length; i++){
            total = total +arr[i];
        }
        System.out.println("Tổng các số là: "+total);
    }
}
