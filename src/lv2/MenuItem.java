package lv2;



public class MenuItem {
    // 햄버거만 관리하는 클래스

    // 속성
    private final int number;
    private final String menuName ;
    private final double price;
    private final String description;

    // 생성자
    MenuItem(int number,String menuName, double price, String description) {
        this.number = number;
        this.menuName = menuName;
        this.price = price;
        this.description = description;
    }

    // 기능

    // 메뉴 번호 
    public int getNumber() {
        return number;
    }

    // 메뉴 이름
    public String getMenuName() {
        return menuName;
    }

    // 메뉴 가격
    public double getPrice() {
        return price;
    }

    // 메뉴 설명
    public String getDescription() {
        return description;
    }

    // 메뉴판
    public String showMenu(){
        return  getNumber() + "번 " +
                "   |   햄버거 : " + getMenuName() +
                "   |   가격 : " + getPrice() +
                "   |   설명 :" +getDescription();
    }

    // 선택한 메뉴 출력
    public String selectMenu (){
        return  "선택한 메뉴 : " + getNumber() + "번 " +
                "   |  햄버거 : " + getMenuName() +
                "   |  가격 : " + getPrice() +
                "   |  설명 :" +getDescription();
    }


}
