package lv6;


public class ShoppingCart  {
    // 속성
    private final MenuItem menu;

    // 생성자
    ShoppingCart(MenuItem menu) {
        this.menu = menu;
    }


    // 장바구니에 담긴 목록 이름
    public String getMenuName() {
        return menu.getMenuName();
    }

    // 장바구니에 담긴 목록 가격
    public double getMenuPrice() {
        return menu.getMenuPrice();
    }

    // 장바구니에 담긴 목록 설명 
    public String getMenuDescription() {
        return menu.getMenuDescription();
    }

    // 장바구니 주문 목록
    public String showOrderList (int i) {
        return "주문목록 : " + i + "번  |   " + getMenuName() + "   |  가격 : " + getMenuPrice() + "   | 설명 : " + getMenuDescription();
    }
    





}
