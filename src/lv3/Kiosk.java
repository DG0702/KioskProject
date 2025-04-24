package lv3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 프로그램 메뉴 관리, 사용자 입력 처리

    Scanner sc = new Scanner(System.in);

    // MenuItem 관리하는 리스트
    List<MenuItem> menuItems = new ArrayList<>();
    int choice ;


    // 생성자
    Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }


    // 기능
    public void start(){
        try {
            do {
                System.out.println();
                System.out.println("[SHAKESHACK MENU]");
                for(MenuItem menuitem : menuItems){
                    System.out.println(menuitem.getMenu());
                }
                System.out.println("0. 종료      | 종료");
                System.out.println("메뉴 번호를 선택해주세요 (0,1,2,3,4)");
                choice = sc.nextInt();

                if(choice == 0){
                    System.out.println("0. 종료      | 종료");
                    // 현재 메서드를 종료 - return
                    return;
                } else if (choice >= menuItems.size()) {
                        System.out.println("메뉴 번호를 선택해주세요 (1,2,3,4)");
                } else{
                    menuItems.get(choice-1).getMenuItem();
                }
            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("메뉴번호를 선택해주세요");
        }
    }

}
