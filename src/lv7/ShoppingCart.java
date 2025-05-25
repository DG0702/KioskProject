package lv7;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // 속성
    private final List<MenuItem> menuItems;

    public ShoppingCart() {
        this.menuItems = new ArrayList<>();
    }

    public ShoppingCart(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    // 장바구니에 담긴 목록 이름
    public List<String> getMenuName() {
        List<String> names = new ArrayList<>();

        for (MenuItem item : menuItems) {
            names.add(item.getMenuName());
        }
        return names;
    }

    // 장바구니에 담긴 목록 가격
    public List<Double> getMenuPrice() {
        List<Double> prices = new ArrayList<>();

        for (MenuItem item : menuItems) {
            prices.add(item.getMenuPrice());
        }
        return prices;
    }

    // 장바구니에 담긴 목록 설명
    public List<String> getMenuDescription() {
        List<String> descriptions = new ArrayList<>();

        for (MenuItem item : menuItems) {
            descriptions.add(item.getMenuDescription());
        }

        return descriptions;
    }

    // 장바구니 주문 목록
    public void showOrderList () {
        for(int i = 0; i < menuItems.size(); i++){
            MenuItem item = menuItems.get(i);
            System.out.println(
                    "주문목록 : " + (i + 1)  + "번  |   "  + item.getMenuName() + "  |  가격 : " + item.getMenuPrice() + "    | 설명 : " + item.getMenuDescription());
        }
    }
    
    // 장바구니 안에 메뉴 존재하는지 확인 메서드
    public boolean isEmpty(){
        return menuItems.isEmpty();
    }

    // 장바구니 비우기
    public void clear(){
        menuItems.clear();
    }

    // 장바구니 메뉴 값 계산
    public double getTotalPrice(){
        return menuItems.stream()
                .mapToDouble(MenuItem::getMenuPrice)
                .sum();
    }
    
    // 장바구니 안에 담긴 메뉴 개수
    public int getMenuSize(){
        return menuItems.size();
    }
    
    // 장바구니 안에 메뉴 삭제
    public void removeMenuItem(int removeNum){
        menuItems.remove(removeNum);
    }

    // 장바구니 안에 메뉴 추가
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    
    

}
