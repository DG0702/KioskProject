package lv6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk <T>  {

    // 입력 값을 받는 객체 생성
    Scanner sc = new Scanner(System.in);

    // 속성
    
    // 카테고리 메뉴
    List<CategoryMenu> categoryMenus = new ArrayList<>();


    // 카테고리 번호
    int categoryNum ;

    // 메뉴 번호
    int menuNum ;

    // 장바구니 번호
    int cartNum;

    // 생성자
    Kiosk(List<CategoryMenu> categoryMenus){
        this.categoryMenus = categoryMenus;
    }


    // 기능
    public void start() {
        try {
            do {
                System.out.println();
                System.out.println("[SHAKESHACK CATEGORY MENU] 번호를 골라주세요 / 0 입력 시 종료");
                for (CategoryMenu categoryMenu : this.categoryMenus) {
                    System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
                }

                // 카테고리 번호 고르기
                categoryNum = sc.nextInt();

                if (categoryNum == 0) {
                    System.out.println("주문 종료");
                    return;
                } else if (categoryNum > categoryMenus.size()) {
                    System.out.println("번호를 선택해주세요 (1번 햄버거, 2번..., 3번...)");
                    continue;
                }
                categoryMenus.get(categoryNum - 1).getCategory();

                // 메뉴 번호 고르기
                while (true) {
                    System.out.println("메뉴를 선택해주세요 / '0' 입력 시 뒤로가기 ");
                    menuNum = sc.nextInt();
                    // 리스트 안에 객체가 존재하고 -> 그 객체가 리스트 형태로 존재
                    if (menuNum > categoryMenus.get(categoryNum - 1).getCategoryList().size()) {
                        System.out.println("번호를 선택해주세요 (1,2,3,4)");
                        continue;
                    } else if (menuNum == 0) {
                        break;
                    }
                    
                    // 선택한 메뉴
                    categoryMenus.get(categoryNum - 1).getMenu(menuNum);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? (1 : 확인 , 2 : 취소(뒤로가기)");
                    cartNum = sc.nextInt();
                    if(cartNum >= 2){
                        break;
                    }
                    // 공통 타입으로 변환 (어떤 메뉴를 고르지 모르기 때문에 공통타입으로 설정)
                    MenuItem menu = (MenuItem) categoryMenus.get(categoryNum - 1).getCategoryList().get(menuNum-1);

                    // 장바구니 객체 생성 -> (장바구니 안에 메뉴 넣기)
                    ShoppingCart cartItems = new ShoppingCart(menu);
                    System.out.println(cartItems.getMenuName() + "이 장바구니에 추가되었습니다.");
                }

            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("번호를 선택해주세요");
        }
    }
    
}
