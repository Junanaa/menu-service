package org.example;

import java.util.Scanner;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static HashMap<String, Integer> Menu = new HashMap<>();

    static {
        Menu.put("Coffee", 1000);
        Menu.put("Ade", 2000);
        Menu.put("Water", 500);

    }

    public static void main(String[] args) {
        int SelectMenu = select();
       finish(SelectMenu);
    }
    static int select(){

        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {

            System.out.println("메뉴 번호를 선택 하세요:");
            int inNum = 1;

            for (String key : Menu.keySet()) {
                System.out.println(inNum + ". " + key);
                inNum++;
            }

            num = scanner.nextInt();

            if (num < 1 || num > Menu.size()) {
                System.out.println("메뉴를 다시 확인해주세요.");
            } else {
                break;
            }
        }
        return num;
    }
   static void finish(int num){
        String MenuSelect = (String) Menu.keySet().toArray()[num -1 ];
        print(MenuSelect);
    }

    static void print(String MenuSelect){
        System.out.println(MenuSelect + "를 선택하셨습니다.");
        System.out.println(MenuSelect + " 제조를 시작합니다.");
        System.out.println(MenuSelect + " 제조가 완료되었습니다. " +" 요금은 " + Menu.get(MenuSelect) + "원 입니다.");
    }
}