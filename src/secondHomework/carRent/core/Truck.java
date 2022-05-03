package secondHomework.carRent.core;

import secondHomework.carRent.util.CanCarryGoods;
import secondHomework.carRent.util.SysConst;

public class Truck extends Automobile implements CanCarryGoods {
    private double goodsCap;
    Truck(){
        super();
        System.out.println("Please input the capacity to carry goods");
        this.goodsCap= SysConst.INPUT.nextDouble();
    }
    public double getGoodsCap() {
        return goodsCap;
    }
    public void setGoodsCap(double goodsCap) {
        this.goodsCap = goodsCap;
    }
    public String toString(){
        return String.format("%s\t\t%.2f\t\t%d\t\t%.2f",super.getBrand(),super.getPrice(),0,this.goodsCap);
    }
}
