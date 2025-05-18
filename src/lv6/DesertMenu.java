package lv6;

public class DesertMenu  implements MenuItem {

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
    
    // 메뉴 (디저트) 번호
    public int getNumber() {
        return number;
    }

    // 메뉴 (디저트) 이름
    public String getDesertName() {
        return desertName;
    }

    // 메뉴 (디저트) 가격
    public double getPrice() {
        return price;
    }

    // 메뉴 (디저트) 설명
    public String getDescription() {
        return description;
    }

    // 메뉴판
    @Override
    public String showMenu() {
        return  getNumber() + "번 " +
                "   |   디저트 : " + getDesertName() +
                "   |   가격 : " + getPrice() +
                "   |   설명 :" +getDescription();
    }

    // 메뉴 (디저트) 출력
    @Override
    public String selectMenu() {
        return "선택한 메뉴 : " + getNumber() + "번" +
                "   |  디저트 : " + getDesertName() +
                "   |  가격 : " + getPrice() +
                "   |  설명 : " + getDescription();
    }



    // 장바구니(디저트) 이름
    @Override
    public String getMenuName() {
        return getDesertName();
    }

    // 장바구니(디저트) 가격
    @Override
    public double getMenuPrice() {
        return getPrice();
    }

    // 장바구니(디저트) 설명
    @Override
    public String getMenuDescription() {
        return getDescription();
    }

}
