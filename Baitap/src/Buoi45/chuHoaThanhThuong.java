package Buoi45;

import java.util.Scanner;

public class chuHoaThanhThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần chuyển đổi: ");
        String input = sc.nextLine();

        //Hiển thị chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + input);

        //khai báo một mảng, sau đó sử dụng phương thức toCharArray() để chuyển đổi chuỗi thành một mảng kí tự
        char[] charArray = input.toCharArray();

        //sử dụng vòng lặp for để đổi các phần tử trong charArray, kí tự nằm từ 65-90 là chữ hoa
        //Nếu ký tự nào nằm trong khoảng >= 65 và <= 90 thì cộng thêm 32, khi đó ký tự sẽ thành chữ thường
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        // chuyển đổi mảng char thành string
        input = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + input);
    }
}
