package Buoi45;

import java.util.Scanner;

public class nguyenAmPhuAm {
    public static void main(String[] args) {
        boolean nguyenam = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra: ");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                nguyenam = true;
        }
        if (nguyenam == true) {
            System.out.println(input + " Là nguyên âm");
        } else {
            System.out.println(input + " Không phải là nguyên âm");
        }
    }
}
