package lv2;



public class MenuItem {
    // 햄버거만 관리하는 클래스

    // 속성
    private int number;
    private String hamburgerName ;
    private double price;
    private String description;

    // 생성자
    MenuItem(int number,String hamburgerName, double price, String description) {
        this.number = number;
        this.hamburgerName = hamburgerName;
        this.price = price;
        this.description = description;
    }

    // 기능

    // getter
    public int getNumber() {
        return number;
    }

    public String getHamburgerName() {
        return hamburgerName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴 출력
    public void getMenuItem(){
        System.out.println("햄버거 = " + getHamburgerName());
        System.out.println("가격 = " + getPrice());
        System.out.println("설명 = " + getDescription());
    }

    // 메뉴 설명
    public String getMenu (){
        return   getNumber() + "번 " +
                "햄버거 : " + getHamburgerName() +
                " 가격 : " + getPrice() +
                " 설명 :" +getDescription();
    }


}
