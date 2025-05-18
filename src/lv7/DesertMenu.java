package lv7;

public class DesertMenu implements MenuItem {
    // 속성
    private final int number;
    private final String desertName;
    private final double price;
    private final String description;

    // 생성자
    DesertMenu(int number, String desertName, double price, String description) {
        this.number = number;
        this.desertName = desertName;
        this.price = price;
        this.description = description;
    }

    // 장바구니(디저트) 이름
    @Override
    public String getMenuName() {
        return desertName;
    }

    // 장바구니(디저트) 가격
    @Override
    public double getMenuPrice() {
        return price;
    }

    // 장바구니(디저트) 설명
    @Override
    public String getMenuDescription() {
        return description;
    }

    // 메뉴판
    @Override
    public String showMenu() {
        return  number + "번 " +
                "   |   디저트 : " + desertName +
                "   |   가격 : " + price +
                "   |   설명 :" + description;
    }

    // 메뉴 (디저트) 출력
    @Override
    public String selectMenu() {
        return "선택한 메뉴 : " + number + "번" +
                "   |   디저트 : " + desertName +
                "   |   가격 : " + price +
                "   |   설명 : " + description;
    }




}
