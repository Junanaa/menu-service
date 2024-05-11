package org.menu;

import java.util.Scanner;

public class Main {

    private static final OrderService orderService = new OrderService();
    private static final Scanner scanner = new Scanner(System.in);
    private static final MenuConfirm menuConfirm = new MenuConfirm(scanner);

    public static void main(String[] args) {
        while (true) {
            // 메뉴 선택
            orderService.printMenuList();
            Menu menu = orderService.findMenu(Long.parseLong(scanner.next()));
            orderService.print(menu);
            orderService.printSizeOptions(menu);

            // 사이즈 선택
            System.out.println("사이즈를 입력해주세요 (S, M, L):");
            String size = scanner.next();
            int price = menu.getSize().get(size.toUpperCase());

            // 메뉴 확인
            boolean confirm = menuConfirm.confirmOrder(menu.getName());
            if (confirm) {
                // 메뉴, 사이즈, 가격 출력
                System.out.println(menu.getName() + " 사이즈 " + size + ", 가격은 " + price + "원입니다.");
                System.out.println(menu.getName() + "를 제조중 입니다.");
                System.out.println(menu.getName() + "가 제조가 완료 되었습니다.");
                break;
            }
        }
        scanner.close();
    }
}
