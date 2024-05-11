package org.menu;

import java.util.Scanner;

public class MenuConfirm {

    private Scanner scanner;

    public MenuConfirm(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean confirmOrder(String menuName) {
        System.out.println("내가 선택한 메뉴는 " + menuName + "입니다. 주문하시겠습니까?");
        System.out.println("1. 예");
        System.out.println("2. 아니요");
        String input = scanner.next();

        return "1".equals(input);
    }
}