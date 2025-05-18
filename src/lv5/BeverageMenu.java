package lv5;

public class BeverageMenu implements MenuItem {
    // 속성(필드) -> 캡슐화
    private final int number;
    private final String beverageName;
    private final double price;
    private final String description;


    // 생성자
    BeverageMenu(int number, String beverageName, double price, String description) {
        this.number = number;
        this.beverageName = beverageName;
        this.price = price;
        this.description = description;
    }

    // 메뉴판
    @Override
    public String showMenu() {
        return  number + "번 " +
                "   |   음료 : " + beverageName +
                "   |   가격 : " + price +
                "   |   설명 :" +description;
    }

    // 메뉴 출력
    @Override
    public String selectMenu() {
        return "선택한 메뉴 : " + number + "번" +
                "   |  음료 : " + beverageName +
                "   |  가격 : " + price +
                "   |  설명 : " +description;
    }

}
