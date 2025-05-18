package lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    // 메뉴 추가 리스트 생성
    private static final List<MenuItem> menuItems = new ArrayList<>();

    
    // main 메서드
    public static void main(String[] args) {

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 메뉴 추가
        initializeMenu();

        // 메뉴 선택 번호
        int choice;

        try {
            do {
                // 메뉴 출력
                printMenu();

                // 메뉴 번호
                choice = sc.nextInt();

                // 메뉴 번호를 선택하지 않았을 경우
                if(choice > menuItems.size()) {
                    System.out.println("메뉴 번호를 선택해주세요 (1,2,3,4)");
                    continue;
                }
                
                // 선택한 메뉴 출력 
                choiceMenu(choice);

            } while (choice != 0);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("메뉴번호를 선택해주세요");
        }
    }



    // 메뉴 출력 메서드
    private static void printMenu() {
        System.out.println();
        System.out.println("[SHAKESHACK MENU]");
        // 메뉴 종류 출력
        for(MenuItem menuItem : menuItems) {
            System.out.println(menuItem.showMenu());
        }
        System.out.println("0. 종료      | 종료");
        System.out.println("메뉴 번호를 선택해주세요 (0,1,2,3,4)");
    }


    // 메뉴 추가 (초기화) 메서드
    private static void initializeMenu() {
        menuItems.add(new MenuItem(1,"ShackBurger ", 6.9 , " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(2,"SmokeShack ", 8.9 , " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(3,"Cheeseburger ", 6.9 , " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem(4,"Hamburger ", 5.4 , " 비프패티를 기반으로 야채가 들어간 기본버거" ));
    }

    // 선택한 메뉴 출력 메서드 
    private static void choiceMenu(int choice) {
        // 메뉴 선택
        if(choice == 0) {
            return;
        }
        System.out.println(menuItems.get(choice-1).selectMenu());
    }
}

