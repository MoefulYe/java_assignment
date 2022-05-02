package secondHomework.carRent.core;
import secondHomework.carRent.util.CanCarryPeople;
import secondHomework.carRent.util.CanCarryGoods;
import secondHomework.carRent.util.SysConst;

public class PickUp extends Automobile implements CanCarryGoods,CanCarryPeople{
    private int peopleCap;
    private double goodsCap;
    PickUp(){
        super();
        System.out.println("Please input the capacity to carry people");
        this.peopleCap= SysConst.INPUT.nextInt();
        System.out.println("Please input the capacity to carry goods");
        this.goodsCap=SysConst.INPUT.nextDouble();
    }
    public int getPeopleCap() {
        return peopleCap;
    }
    public void setPeopleCap(int peopleCap) {
        this.peopleCap = peopleCap;
    }
    public double getGoodsCap() {
        return goodsCap;
    }
    public void setGoodsCap(double goodsCap) {
        this.goodsCap = goodsCap;
    }
    public String toString(){
        return String.format("%s\t\t%.2f\t\t%d\t\t%.2f",super.getBrand(),super.getPrice(),this.peopleCap,this.goodsCap);
    }
}
