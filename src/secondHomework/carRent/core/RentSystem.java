package secondHomework.carRent.core;

import secondHomework.carRent.util.SysConst;


public class RentSystem {
    private final AutoList autoList;
    private final Orders orders;
    public RentSystem(AutoList autoList, Orders orders){
        this.autoList=autoList;
        this.orders=orders;
    }
    public void init(){
        do {
            Order order = new Order(autoList);
            orders.add(order);
            System.out.println("your orders are:");
            System.out.println(orders);
            System.out.println("Do you want to continue?(y/n)");
        } while (!SysConst.INPUT.next().equals("n"));
    }
}
