package lv2;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 메뉴 추가하는 리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();

        // 메뉴 추가
        menuItems.add(new MenuItem(1,"ShackBurger ", 6.9 , " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(2,"SmokeShack ", 8.9 , " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(3,"Cheeseburger ", 6.9 , " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(4,"Hamburger ", 5.4 , " 비프패티를 기반으로 야채가 들어간 기본버거" ));


        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 메뉴 선택 번호
        int choice;


        try {
            do {
                System.out.println();
                System.out.println("[SHAKESHACK MENU]");
                
                // 메뉴 종류 출력
                for(MenuItem menuItem : menuItems) {
                    System.out.println(menuItem.getMenu());
                }
                System.out.println("0. 종료      | 종료");
                System.out.println("메뉴 번호를 선택해주세요 (0,1,2,3,4)");

                // 메뉴 번호
                choice = sc.nextInt();
                if(choice == 0){
                    System.out.println("0. 종료      | 종료");
                    // 현재 메서드를 종료 - return
                    return;
                } else if (choice >= menuItems.size()) {
                    System.out.println("메뉴 번호를 선택해주세요 (1,2,3,4)");
                    continue;
                }

                // 선택한 메뉴 출력
                System.out.println(menuItems.get(choice-1).getMenu());

            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("메뉴번호를 선택해주세요");
        }


    }
}
