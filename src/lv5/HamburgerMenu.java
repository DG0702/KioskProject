package lv5;

public class HamburgerMenu implements MenuItem  {

    // 속성 (필드) -> 캡슐화
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

    // 메뉴 (햄버거) 번호
    public int getNumber(){
        return number;
    }

    // 메뉴 (햄버거) 이름
    public String getHamburgerName(){
        return hamburgerName;
    }

    // 메뉴 (햄버거) 가격
    public double getPrice(){
        return price;
    }

    // 메뉴 (햄버거) 설명
    public String getDescription(){
        return description;
    }

    // 메뉴판
    @Override
    public String showMenu(){
        return  getNumber() + "번 " +
                "   |   햄버거 : " + getHamburgerName() +
                "   |   가격 : " + getPrice() +
                "   |   설명 :" +getDescription();
    }
    
    // 메뉴 출력
    @Override
    public String selectMenu(){
        return "선택한 메뉴 : " + getNumber() + "번" +
                "   |  햄버거 : " + getHamburgerName() +
                "   |  가격 : " + getPrice() +
                "   |  설명 : " + getDescription();
    }
}
