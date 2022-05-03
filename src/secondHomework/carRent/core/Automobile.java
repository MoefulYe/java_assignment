package secondHomework.carRent.core;

import secondHomework.carRent.util.SysConst;

public class Automobile {
    private final String brand;
    private final double price;
    Automobile() {
        System.out.println("Please input the brand");
        this.brand=SysConst.INPUT.next();
        System.out.println("Please input the price");
        this.price=SysConst.INPUT.nextDouble();
    }
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getPeopleCap(){
        return 0;
    }
    public double getGoodsCap(){
        return 0.0;
    }
}