package lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    
    // 입력값 받는 객체 생성
    Scanner sc = new Scanner(System.in);

    // 필드
    List<CategoryMenu> categoryMenus;

    // 카테고리 번호
    int categoryNum;

    // 메뉴번호
    int menuNum;


    // 생성자
    Kiosk(List<CategoryMenu> categoryMenus){
        this.categoryMenus = categoryMenus;
    }

    // 기능
    public void start(){
        try {
            do {
                System.out.println();
                System.out.println("[SHAKESHACK CATEGORY MENU] 번호를 골라주세요 / 0 입력 시 종료");

                // 카테고리 메뉴 (1. 햄버거, 2 음료 ...)
                for(CategoryMenu categoryMenu : this.categoryMenus){
                    System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
                }

                // 카테고리 번호 고르기
                categoryNum = sc.nextInt();

                if(categoryNum == 0){
                    System.out.println("주문 종료");
                    return;
                }else if(categoryNum > categoryMenus.size()){
                    System.out.println("번호를 선택해주세요 (1번 햄버거, 2번..., 3번...)");
                    continue;
                }

                //  카테고리별 메뉴 출력 (메뉴판)
                categoryMenus.get(categoryNum-1).getCategory();

                // 메뉴 번호 고르기
                while (true) {
                    System.out.println("메뉴를 선택해주세요 / '0' 입력 시 뒤로가기 ");
                    // 메뉴 번호
                    menuNum = sc.nextInt();

                    // 리스트 안에 객체가 존재하고 -> 그 객체가 리스트 형태로 존재
                    // 메뉴판 없는 번호 선택시
                    if (menuNum > categoryMenus.get(categoryNum-1).getCategoryList().size()) {
                        System.out.println("번호를 선택해주세요 (1,2,3,4)");
                        continue;
                    } else if (menuNum == 0) {
                        break;
                    }

                    // 선택한 카테고리 메뉴 출력 (고른 메뉴)
                    categoryMenus.get(categoryNum - 1).getMenu(menuNum);
                    break;

                }

            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("번호를 선택해주세요");
        }
    }

}
