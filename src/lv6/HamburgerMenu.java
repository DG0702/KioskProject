package lv6;


public class HamburgerMenu  implements MenuItem {
    // 속성
    private final int number;
    private final String hamburgerName;
    private final double price;
    private final String description;


    // 생성자
    HamburgerMenu(int number, String hamburgerName, double price, String description) {
        this.number = number;
        this.hamburgerName = hamburgerName;
        this.price = price;
        this.description = description;
    }

    // 장바구니(햄버거) 이름
    @Override
    public String getMenuName() {
        return hamburgerName;
    }

    // 장바구니(햄버거) 가격
    @Override
    public double getMenuPrice() {
        return price;
    }

    // 장바구니(햄버거) 설명
    @Override
    public String getMenuDescription() {
        return description;
    }


    // 메뉴판
    @Override
    public String showMenu() {
        return  number + "번 " +
                "   |   햄버거 : " + hamburgerName +
                "   |   가격 : " + price +
                "   |   설명 :" +description;
    }


    // 메뉴(햄버거) 출력
    @Override
    public String selectMenu() {
        return "선택한 메뉴 : " + number + "번" +
                "   |   햄버거 : " + hamburgerName +
                "   |   가격 : " + price +
                "   |   설명 : " + description ;
    }






}
