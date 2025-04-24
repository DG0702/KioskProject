package lv4;

public class Beverage implements MenuItem{
    // 속성
    private int number;
    private String beverageName;
    private double price;
    private String description;

    // 생성자
    public Beverage(int number, String beverageName, double price, String description) {
        this.number = number;
        this.beverageName = beverageName;
        this.price = price;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴 출력
    @Override
    public String getMenu(){
        return "선택한 메뉴는 " + getNumber() + "번 " +
                "햄버거 : " + getBeverageName() +
                " 가격 : " + getPrice() +
                " 설명 :" +getDescription();
    }
}
