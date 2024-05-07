package org.menu;

import java.util.List;
import java.util.Map;

public class OrderService {
    private final List<Menu> menus = List.of(
            new Menu(1, "아메리카노", Map.of("S", 1000, "M", 2000, "L", 3000)),
            new Menu(2, "카페라떼", Map.of("S", 2000, "M", 3000, "L", 4000)),
            new Menu(3,"아이스초코", Map.of("S", 3000, "M", 4000, "L", 5000))
    );

    public Menu findMenu(long id) {

        return menus.stream()
                .filter(menu -> id==menu.getId())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("메뉴를 다시 선택해주세요."));
    }
    public void printMenuList() {
        System.out.println("메뉴를 선택해 주세요:");
        for (Menu menu : menus) {
            System.out.println(menu.getId() + ". " + menu.getName());
        }
    }
    public void print(Menu menu) {
        System.out.println(menu.getName() + "를 주문하셨습니다");
    }
    public void printSizeOptions(Menu menu) {
        System.out.println(menu.getName() + "의 사이즈를 선택해주세요 (S, M, L):");
        menu.getSize().forEach((size, price) -> System.out.println(size + ": " + price + "원"));
    }
}
