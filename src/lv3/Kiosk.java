package lv3;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 프로그램 메뉴 관리, 사용자 입력 처리

    private final Scanner sc = new Scanner(System.in);


    // 메뉴 추가하는 리스트
    private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    
    // 키오스크 사용 메서드
    public void start(){
        try {
            // 메뉴 번호
            int choice;
            do {
                // 메뉴 출력 메서드
                printMenu();
                
                // 메뉴 번호
                choice = sc.nextInt();

                // 메뉴 번호를 선택하지 않았을 경우
                if (choice > menuItems.size()) {
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

    
    // 메뉴 출력하는 메서드
    private void printMenu(){
        System.out.println();
        System.out.println("[SHAKESHACK MENU]");

        // 메뉴 종류 출력
        for(MenuItem menuitem : menuItems){
            System.out.println(menuitem.showMenu());
        }
        System.out.println("0. 종료      | 종료");
        System.out.println("메뉴 번호를 선택해주세요 (0,1,2,3,4)");
    }

    // 선택한 메뉴 출력
    private void choiceMenu(int choice){
        // 선택한 메뉴 출력
        if(choice == 0){
            return;
        }
        System.out.println(menuItems.get(choice-1).selectMenu());
    }

}
