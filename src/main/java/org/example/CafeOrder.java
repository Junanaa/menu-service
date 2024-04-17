package org.example;

import java.util.Scanner;

public class CafeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. 아메리카노 5000원");
            System.out.println("2. 카페라떼 8000원");
            System.out.println("3. 카페모카 10000원");
            System.out.println("4. 물 5000원");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printOrder("아메리카노", 5000 );
                    break;
                case 2:
                    printOrder("카페라떼", 8000);
                    break;
                case 3:
                    printOrder("카페모카", 10000);
                    break;
                case 4:
                    printOrder("물", 5000);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    continue;
            }
            break;
        }
        scanner.close();
    }





    private static void printOrder(String menuName, int price) {
        System.out.println(menuName + "를 선택하셨습니다.");
        System.out.println(menuName + "제조를 시작합니다.");
        System.out.println(menuName + "제조가 완료되었습니다. "+"요금은 "+ price + "원 입니다.");
        System.out.println("요금은 " + price + "원 입니다.");
    }
}
