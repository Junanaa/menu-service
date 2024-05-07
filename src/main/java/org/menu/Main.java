package org.menu;

import java.util.Scanner;

public class Main {

    private static final OrderService orderService = new OrderService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 메뉴선택
        orderService.printMenuList();
        Menu menu = orderService.findMenu(Long.parseLong(scanner.next()));
        orderService.print(menu);
        orderService.printSizeOptions(menu);
        // 사이즈 선택
        System.out.println("사이즈를 입력해주세요 (S, M, L):");
        String size = scanner.next();
        int price = menu.getSize().get(size.toUpperCase());
        // 메뉴, 사이즈, 가격 출력
        System.out.println(menu.getName() + " 사이즈 " + size + ", 가격은 " + price + "원입니다.");
    }
}
