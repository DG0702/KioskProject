package lv5;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 입력값 받는 객체 생성
    private final Scanner sc = new Scanner(System.in);

    // 속성
    private final List<CategoryMenu<MenuItem>> categoryMenus;

    // 카테고리 번호
    private int categoryNum;

    // 생성자
    Kiosk(List<CategoryMenu<MenuItem>> categoryMenus){
        this.categoryMenus = categoryMenus;
    }
    
    // 키오스크 사용 메서드
    public void start(){
        try {
            do {
                // 카테고리 메뉴출력
                printCategoryMenu();

                // 카테고리 번호
                categoryNum = sc.nextInt();
                if(categoryNum == 0){
                    System.out.println("주문 종료");
                    break;
                } else if (categoryNum <= categoryMenus.size()) {
                    // 카테고리별 메뉴 출력 (메뉴판)
                    printMenu(categoryNum);

                    // 메뉴 번호 고르기
                    getSelectMenu();
                    continue;
                }

                System.out.println("번호를 선택해주세요 (1번 햄버거, 2번 음료)");

            }while(true);

        } catch (InputMismatchException e){
            throw new InputMismatchException("번호를 선택해주세요");
        }
    }


    // 카테고리 메뉴 출력
    private void printCategoryMenu(){
        System.out.println();
        System.out.println("[SHAKESHACK CATEGORY MENU] 번호를 골라주세요 / 0 입력 시 종료");

        // 카테고리 메뉴
        for(CategoryMenu<MenuItem> categoryMenu : categoryMenus){
            System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
        }
    }
    
    
    // 카테고리 메뉴 출력
    private void printMenu(int categoryNum){
        // 메뉴판
        categoryMenus.get(categoryNum - 1).showCategory();
    }


    // 메뉴 선택
    private void getSelectMenu(){
        while(true){
            System.out.println("메뉴를 선택해주세요 / '0' 입력시 뒤로가기");

            // 메뉴 번호
            int menuNum = sc.nextInt();

            if(menuNum == 0){
                break;
            }
            // 리스트 안에 객체가 존재하고 -> 그 객체가 리스트 형태로 존재
            else if(menuNum <= categoryMenus.get(categoryNum -1).getCategoryList().size()){
                // 선택한 카테고리 메뉴 출력 (고른 메뉴)
                categoryMenus.get(categoryNum -1).selectMenu(menuNum);
                break;
            }

            System.out.println("번호를 선택해주세요 (1,2,3,4)");
        }
    }


}
