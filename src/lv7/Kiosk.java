package lv7;

import lv7.CategoryMenu;
import lv7.MenuItem;
import lv7.ShoppingCart;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 입력 값을 받는 객체 생성
    Scanner sc = new Scanner(System.in);

    // 속성

    // 카테고리 메뉴
    List<lv7.CategoryMenu> categoryMenus = new ArrayList<>();

    // 장바구니 목록
    List<lv7.ShoppingCart> cartItems = new ArrayList<>();

    // 장바구니 객체
    lv7.ShoppingCart Items;

    // 총 가격
    double sumPrice = 0;

    // 카테고리 번호
    int categoryNum ;

    // 메뉴 번호
    int menuNum ;

    // 장바구니 번호
    int cartNum;

    // 주문 번호
    int orderNum;

    // 할인 번호
    int discountNum;

    // 할인
    Discount discount;

    // 전체 금액
    double totalPrice;

    // 제거할 메뉴
    int removeNum;


    // 생성자
    Kiosk(List<lv7.CategoryMenu> categoryMenus){
        this.categoryMenus = categoryMenus;
    }


    // 기능
    public void start() {
        try {
            do {
                System.out.println();
                System.out.println("[Main MENU]  / 0 입력 시 종료");
//                for (CategoryMenu categoryMenu : this.categoryMenus) {
//                    System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
//                }

                // 스트림 처리 -> 체이닝(줄줄이 메서드 연결) 하지 않기 때문에 (stream 생략)
                this.categoryMenus.forEach(category -> System.out.println(category.getNumber() + "번 " + category.getCategoryName()));


                // 장바구니 안에 목록이 생겼을 경우
                if (cartItems.size() > 0) {
                    System.out.println();
                    System.out.println("[ORDER MENU]");
                    System.out.println("4. Orders | 장바구니를 확인 후 주문합니다");
                    System.out.println("5. Cancel | 진행중이 주문을 취소합니다.");
                }

                // 카테고리 번호 고르기
                categoryNum = sc.nextInt();

                if (categoryNum == 0) {
                    System.out.println("주문 종료");
                    return;
                }

                // 주문을 할 경우
                else if (categoryNum == 4) {
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println("[Orders]");

                    // 장바구니에 담긴 메뉴 출력
//                    for (lv7.ShoppingCart cart : this.cartItems) {
//                        System.out.println(cart.getMenu());
//                    }
                    this.cartItems.forEach(cart -> System.out.println(cart.getMenu()));

                    System.out.println();
                    System.out.println("[Total]");

                    // 장바구니에 메뉴 값 계산
//                    for (lv7.ShoppingCart cart : this.cartItems) {
//                        double price = cart.getMenuPrice();
//                        sumPrice += price;
//                    }

                    // mapToDouble() -> double 값 추출할 때 사용 -> 숫자 전용 메서드 사용 가능
                    // 숫자 전용 메서드 :  .sum() .average() .min() .max() 등
                    double sumPrice = this.cartItems.stream()
                            .mapToDouble(ShoppingCart::getMenuPrice)
                            .sum();

                    System.out.println("W : " + sumPrice);


                    System.out.println("1. 주문  | 2. 메뉴 빼기  | 3. 메뉴판");
                    orderNum = sc.nextInt();
                    if (orderNum >= 3) {
                        continue;
                    } else if (orderNum == 2) {
                        this.cartItems.forEach(cart -> System.out.println(cart.getMenu()));
                        System.out.println("무슨 메뉴를 빼시겠어요?");
                        removeNum = sc.nextInt();
                        cartItems.remove(removeNum-1);
                        this.cartItems.forEach(cart -> System.out.println(cart.getMenu()));
                        continue;
                    }
                    System.out.println("할인 정보를 입력해주세요");
                    System.out.println("1. 국가 유공자 : 10%");
                    System.out.println("2. 군인 : 5%");
                    System.out.println("3. 학생 : 3%");
                    System.out.println("4. 일반 : 0%");
                    discountNum = sc.nextInt();

                    // Discount 타입으로
                    discount = Discount.getDiscount(discountNum);

                    switch (discount){
                        case VETERAN:
                            totalPrice = (sumPrice * 1000) - (sumPrice * 1000 * 0.1);
                            break;
                        case SOLDIER:
                            totalPrice = (sumPrice * 1000) - (sumPrice * 1000 * 0.05);
                            break;
                        case STUDENT:
                            totalPrice = (sumPrice * 1000) - (sumPrice * 1000 * 0.03);
                            break;
                        case GENERAL:
                            totalPrice = sumPrice * 1000;
                    }
                    System.out.println("주문이 완료되었습니다 금액은 W : " + (int)totalPrice + "원 입니다");
                    cartItems.clear();
                    continue;
                }

                // 주문을 취소할 경우
                else if (categoryNum == 5) {
                    cartItems.clear();
                    System.out.println("주문이 취소 되었습니다.");
                    continue;
                }

                // 잘못 눌렸을 경우
                else if (categoryNum > 5) {
                    System.out.println("번호를 선택해주세요 (1번 Burger, 2번 Drinks 3번 미정 4번 Order 5번 Cancel)");
                    continue;
                }

                // 메뉴 불러오기 (햄버거, 음료 등)
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

                    // 장바구니 추가 질문
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? (1 : 확인 , 2 : 취소(뒤로가기)");
                    cartNum = sc.nextInt();
                    if (cartNum >= 2) {
                        break;
                    }

                    // 공통 타입 (인터페이스) -> 메뉴(햄버거, 음료 등)의 부모 타입
                    // 공통 타입으로 변환 (어떤 메뉴를 고르지 모르기 때문에 공통타입으로 설정)
                    lv7.MenuItem menu = (MenuItem) categoryMenus.get(categoryNum - 1).getCategoryList().get(menuNum - 1);

                    // 장바구니 객체 생성 -> 장바구니 리스트 안에 담기 위해서
                    Items = new ShoppingCart(menu);

                    // 장바구니 안에 메뉴 넣기 (여러 종류 -> 리스트 형태)
                    cartItems.add(Items);
                    System.out.println(cartItems.get(cartItems.size() - 1).getMenuName() + "이 장바구니에 추가되었습니다.");
                    break;
                }

            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("번호를 선택해주세요");
        }
    }
}
