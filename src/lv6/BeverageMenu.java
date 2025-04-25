package lv6;

import java.util.List;

public class BeverageMenu <T> implements MenuItem{

    // 속성
    private int number;
    private String beverageName;
    private double price;
    private String description;


    // 생성자
    BeverageMenu(int number, String beverageName, double price, String description){
        this.number = number;
        this.beverageName = beverageName;
        this.price = price;
        this.description = description;
    }

    // 메뉴(음료) 번호
    public int getNumber(){
        return number;
    }

    // 메뉴(음료) 이름
    public String getBeverageName(){
        return beverageName;
    }

    // 메뉴(음료) 가격
    public double getPrice(){
        return price;
    }

    // 메뉴(음료) 설명
    public String getDescription(){
        return description;
    }


    // 메뉴(음료) 출력
    @Override
    public String getMenu(){
        return "선택한 메뉴 : " + getNumber() + "번" +
                " 음료 : " + getBeverageName() +
                " 가격 : " + getPrice() +
                " 설명 : " + getDescription();
    }

    // 메뉴(음료) 이름
    @Override
    public String getMenuName(){
        return getBeverageName();
    }

    // 메뉴(음료) 가격
    @Override
    public double getMenuPrice(){
        return getPrice();
    }


    // 메뉴(음료) 설명
    @Override
    public String getMenuDescription(){
        return getDescription();
    }







}
