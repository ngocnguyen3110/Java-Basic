package Buoi45;

import java.util.Scanner;

public class chuThuongThanhHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        //Hiển thị chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + input);
        //khai báo một mảng, sau đó sử dụng phương thức toCharArray() để chuyển đổi chuỗi thành một mảng kí tự
        char[] charArray = input.toCharArray();

        //sử dụng vòng lặp for để đổi các phần tử trong charArray, kí tự nằm từ 97-122 là chữ thường
        //Nếu ký tự nào nằm trong khoảng >= 97 và <= 122 thì trừ đi 32, khi đó ký tự sẽ thành chữ hoa
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        // chuyển đổi mảng char thành string
        input = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + input);
    }
}
