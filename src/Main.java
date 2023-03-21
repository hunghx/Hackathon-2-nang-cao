import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> listUrls = new Stack<String>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            System.out.println("nhâập lựa chon");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập vào url");
                    String url = input.nextLine();
                    listUrls.push(url);
                    System.out.println(url);
                    break;
                case 2:
                    if (listUrls.isEmpty()){
                        throw new IllegalArgumentException("hêt stack rồi , nhập mới đi");
                    }else {
                        System.out.println("Back");
                        listUrls.pop();
                        System.out.println(listUrls.peek());
                    }
                    break;
                case 3:
                    System.out.println("thoát");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không hợp lệ");
                    break;
            }
        }
    }
}