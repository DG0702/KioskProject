package lv6;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // 속성

    private MenuItem menu;

    // 생성자
    ShoppingCart(MenuItem menu){
        this.menu = menu;
    }


    public String getMenuName(){
        return menu.getMenuName();
    }

    public double getPrice(){
        return menu.getMenuPrice();
    }

    public String getDescription(){
        return menu.getMenuDescription();
    }


    public String getMenu (){
        return "주문목록 : " + getMenuName() + "  |  가격 : " + getPrice() + "    | 설명 : " + getDescription();
    }





}
