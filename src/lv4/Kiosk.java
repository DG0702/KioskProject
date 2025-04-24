package lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    
    // 입력값 받는 객체 생성
    Scanner sc = new Scanner(System.in);

    // 필드
    List<CategoryMenu> categoryMenu = new ArrayList<>();

    int categoryNum;
    int choice;


    // 생성자
    Kiosk(List<CategoryMenu> categoryMenu){
        this.categoryMenu = categoryMenu;
    }

    // 기능
    public void start(){
        try {
            do {
                System.out.println();
                System.out.println("[SHAKESHACK CATEGORY MENU] 번호를 골라주세요 / 0 입력 시 종료");
                for(CategoryMenu categoryMenu : this.categoryMenu){
                    System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
                }
                
                // 카테고리 번호 고르기
                categoryNum = sc.nextInt();

                if(categoryNum == 0){
                    System.out.println("주문 종료");
                    return;
                }else if(categoryNum > categoryMenu.size()){
                    System.out.println("번호를 선택해주세요 (1번 햄버거, 2번..., 3번...)");
                }else{
                    switch (categoryNum){
                        case 1:
                            categoryMenu.get(categoryNum-1).getCategory();
                            break;
                        case 2:
                            System.out.println("2번 출력");
                            break;
                    }
                    
                    // 메뉴 번호 고르기
                    System.out.println("메뉴를 선택해주세요");
                    choice = sc.nextInt();
                    // 리스트 안에 객체가 존재하고 -> 그 객체가 리스트 형태로 존재
                    if (choice > categoryMenu.get(categoryNum-1).getHamburgerMenus().size()) {
                        System.out.println("번호를 선택해주세요 (1,2,3,4)");
                    }else{
                        categoryMenu.get(categoryNum - 1).getMenu(choice);
                    }
                }
            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("메뉴번호를 선택해주세요");
        }
    }

}
