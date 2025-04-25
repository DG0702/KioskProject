package lv6;


public class ShoppingCart  {
    // 속성

    private MenuItem menu;
    private double sum;

    // 생성자
    ShoppingCart(MenuItem menu){
        this.menu = menu;
    }


    public String getMenuName(){
        return menu.getMenuName();
    }

    public double getMenuPrice(){
        return menu.getMenuPrice();
    }

    public String getMenuDescription(){
        return menu.getMenuDescription();
    }


    public String getMenu (){
        return "주문목록 : " + getMenuName() + "  |  가격 : " + getMenuPrice() + "    | 설명 : " + getMenuDescription();
    }

    // 모든 메뉴 가격의 합
    public double getSumPrice(){
        sum += menu.getMenuPrice();
        return sum;
    }





}
