package secondHomework.carRent.core;
import secondHomework.carRent.util.CanCarryPeople;
import secondHomework.carRent.util.SysConst;

public class Car extends Automobile implements CanCarryPeople {
    private int peopleCap;
    Car(){
        super();
        System.out.println("Please input the capacity to carry people");
        this.peopleCap=SysConst.INPUT.nextInt();
    }
    public int getPeopleCap() {
        return peopleCap;
    }
    public void setPeopleCap(int peopleCap) {
        this.peopleCap = peopleCap;
    }
    public String toString(){
        return String.format("%s\t\t%.2f\t\t%d\t\t%.2f",super.getBrand(),super.getPrice(),this.peopleCap,0.0);
    }
}
