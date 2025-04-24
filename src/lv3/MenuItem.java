package lv3;

public class MenuItem {

    // 속성
    private String hamburgerName;
    private double price;
    private String description;

    // 생성자
    MenuItem(String hamburgerName, double price, String description) {
        this.hamburgerName = hamburgerName;
        this.price = price;
        this.description = description;
    }

    // 속성

    //getter

    public String getHamburgerName() {
        return hamburgerName;
    }

    public double getPrice (){
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void getMenuItem(){
        System.out.println("햄버거 = " + getHamburgerName());
        System.out.println("가격 = " + getPrice());
        System.out.println("설명 = " + getDescription());
    }

}
