package lv6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk  {

    // 입력 값을 받는 객체 생성
    Scanner sc = new Scanner(System.in);

    
    // 카테고리 메뉴
    private final List<CategoryMenu<MenuItem>> categoryMenus;

    // 장바구니 목록
    private final List<ShoppingCart> cartItems = new ArrayList<>();

    // 카테고리 번호
    private int categoryNum ;

    // 메뉴 번호
    private int menuNum ;

    // 메뉴 뒤로가기
    boolean check ;


    // 생성자
    Kiosk(List<CategoryMenu<MenuItem>> categoryMenus){
        this.categoryMenus = categoryMenus;
    }


    // 키오스크 사용
    public void start() {
        try {
            do {
                // 카테고리 메뉴 출력
                printCategoryMenus();
                
                // 카테고리 번호 고르기
                categoryNum = sc.nextInt();

                if (categoryNum == 0) {
                    System.out.println("주문 종료");
                    break;
                }

                // 장바구니에 메뉴를 담았을 때
                if(!cartItems.isEmpty()){
                    // 주문을 할 경우
                    if (categoryNum == 4) {
                        printShoppingCart();
                        continue;
                    }

                    // 주문을 취소할 경우
                    else if (categoryNum == 5) {
                        cartItems.clear();
                        System.out.println("주문이 취소 되었습니다.");
                        continue;
                    }

                    // (1,2,3,4,5) 카테고리 메뉴에서 잘못 눌렸을 경우
                    else if (categoryNum > 5) {
                        System.out.println("번호를 선택해주세요 (1번 Burger, 2번 Drinks 3번 Desert 4번 Order 5번 Cancel)");
                        continue;
                    }
                }

                // (1,2,3) 카테고리 메뉴에서 잘못 눌렸을 경우
                else if (categoryNum > 3) {
                    System.out.println("번호를 선택해주세요 (1번 Burger, 2번 Drinks 3번 Desert)");
                    continue;
                }

                // 메뉴판
                printMenu(categoryNum);

                // check 기본값
                check = true;

                // 메뉴 번호 고르기
                getSelectMenu();
                
                // 뒤로가기 했을 경우
                if(!check){
                    continue;
                }

                // 장바구니 추가여부
                getShoppingCart();

            } while (true);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("번호를 선택해주세요");
        }
    }


    // 카테고리 메뉴 출력
    private void printCategoryMenus() {
        System.out.println();
        System.out.println("[Main MENU]  / 0 입력 시 종료");
        for (CategoryMenu<MenuItem> categoryMenu : categoryMenus) {
            System.out.println(categoryMenu.getNumber() + "번 " + categoryMenu.getCategoryName());
        }

        // 장바구니 안에 목록이 생겼을 경우
        if(!cartItems.isEmpty()){
            System.out.println();
            System.out.println("[ORDER MENU]");
            System.out.println("4. Orders | 장바구니를 확인 후 주문합니다");
            System.out.println("5. Cancel | 진행중이 주문을 취소합니다.");
        }
    }


    // 장바구니 출력
    private void printShoppingCart(){
        while (true) {
            // 총 가격
            double sumPrice = 0;

            // 주문을 할 경우
            System.out.println();
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("[Orders]");

            // 장바구니에 담긴 메뉴 출력
            int i = 1;
            for(ShoppingCart cart : this.cartItems){
                System.out.println(cart.showOrderList(i));
                i++;
            }

            System.out.println();
            System.out.println("[Total]");
            for(ShoppingCart cart : this.cartItems){
                double price = cart.getMenuPrice();
                sumPrice += price;
            }
            System.out.println("W : " + sumPrice);

            System.out.println();
            System.out.println("1. 주문  | 2. 메뉴판");

            // 주문 번호
            int orderNum = sc.nextInt();
            
            // 2번 입력 시 (뒤로가기)
            if(orderNum == 2){
                break;
            } 
            
            // 1번 입력 시
            else if (orderNum == 1) {
                System.out.println("주문이 완료되었습니다 금액은 W : " + sumPrice + " 입니다");
                cartItems.clear();
                break;
            }

            System.out.println("1번 , 2번 중에 선택 해주세요");
        }
    }


    // 카테고리 메뉴 출력
    private void printMenu(int categoryNum){
        // 메뉴판
        categoryMenus.get(categoryNum - 1).getCategory();
    }


    // 메뉴 선택
    private void getSelectMenu(){
        while(true) {
            System.out.println("메뉴를 선택해주세요 / '0' 입력 시 뒤로가기 ");

            // 메뉴 번호
            menuNum = sc.nextInt();

            if(menuNum == 0){
                // 뒤로가기
                check = false;
                break;
            }

            // 리스트 안에 객체가 존재하고 -> 그 객체가 리스트 형태로 존재
            else if (menuNum <= categoryMenus.get(categoryNum - 1).getCategoryList().size()) {
                // 선택한 카테고리 메뉴 출력(고른 메뉴)
                categoryMenus.get(categoryNum - 1).getMenu(menuNum);
                break;
            }

            System.out.println("번호를 선택해주세요 (1,2,3,4)");
        }
    }
    

    // 장바구니 추가여부 메서드
    private void getShoppingCart(){
        while (true) {
            // 장바구니 추가 질문
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? (1 : 확인 , 2 : 취소(뒤로가기)");

            // 장바구니 번호
            int cartNum = sc.nextInt();

            // 2번 입력 시
            if(cartNum == 2){
                break;
            }

            // 1번 입력 시
            else if (cartNum ==1) {
                // 공통 타입 (인터페이스) -> 메뉴(햄버거, 음료 등)의 부모 타입
                // 공통 타입으로 변환 (어떤 메뉴를 고르지 모르기 때문에 공통타입으로 설정)
                MenuItem menu = categoryMenus.get(categoryNum - 1).getCategoryList().get(menuNum-1);

                // 장바구니 객체 생성 -> 장바구니 리스트 안에 담기 위해서
                ShoppingCart Items = new ShoppingCart(menu);

                // 장바구니 안에 메뉴 넣기 (여러 종류 -> 리스트 형태)
                cartItems.add(Items);
                System.out.println(cartItems.get(cartItems.size()-1).getMenuName() + "가 장바구니에 추가되었습니다.");
                break;
            }

            System.out.println("1번, 2번 중에 선택 해주세요");
        }
    }

}
