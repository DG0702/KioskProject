package lv1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // 입력 값을 받는 객체 생성
        Scanner sc = new Scanner(System.in);
        int choice;
            try {
                do {
                    // 메뉴 출력
                    printMenu();
                    
                    // 번호 선택
                    choice = sc.nextInt();
                    
                    // 메뉴 출력
                    choiceMenu(choice);
                } while (choice != 0);
            } catch (InputMismatchException e) {
                throw new InputMismatchException("메뉴번호를 선택해주세요");
            }

    }

    // 메뉴 리스트
    private static final List<String> menus = List.of(
            "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
            "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
            "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
            "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거",
            "0. 종료      | 종료"
    );

    // 메뉴 출력 메서드
    private static void printMenu(){
        System.out.println();
        System.out.println("[SHAKESHACK MENU]");
        for(String menu : menus){
            System.out.println(menu);
        }
        System.out.println("메뉴 번호를 선택해주세요 (0,1,2,3,4)");
    }

    // 메뉴 선택 시 출력 메서드
    private static void choiceMenu(int choice){
        switch (choice){
            case 1 -> System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            case 2 -> System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            case 3 -> System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            case 4 -> System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            case 0 -> System.out.println("0. 종료      | 종료");


            default -> System.out.println("메뉴 번호를 선택해주세요 (1,2,3,4)");
        }
    }
}