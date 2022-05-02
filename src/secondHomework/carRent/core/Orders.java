package secondHomework.carRent.core;

import secondHomework.carRent.util.SysConst;

import java.util.ArrayList;
import java.util.HashMap;


public class Orders extends ArrayList<Order> {
    public Orders(){
        super();
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("your orders are:\n");
        for(int i=0;i<this.size();i++){
            sb.append("order ").append(i+1).append(":\n");
            sb.append(this.get(i));
        }
        return sb.toString();
    }

}
class Order extends HashMap<Automobile,Integer> {
    Order(AutoList list){
        super();
        while(true){
            System.out.println("please input the index of automobile you want to rent(-1 to exit)");
            int id= SysConst.INPUT.nextInt();
            if(id==-1)
                break;
            System.out.println("please input the number of days you want to rent");
            int days=SysConst.INPUT.nextInt();
            this.put(list.get(id),days);
        }
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(Automobile auto:this.keySet()){
            sb.append("<").append(auto.getBrand()).append(",").append(this.get(auto)).append("days> ");
        }
        sb.append("\nTotal price: ").append(this.getTotalPrice());
        sb.append("\nTotal cap to carry people: ").append(this.getTotalPeopleCap());
        sb.append("\nTotal cap to carry goods: ").append(this.getTotalGoodsCap());
        sb.append("\n");
        return sb.toString();
    }
    private int getTotalPeopleCap(){
        int total=0;
        for(Automobile auto:this.keySet()){
            total+=auto.getPeopleCap();
        }
        return total;
    }
    private double getTotalGoodsCap(){
        double total=0.0;
        for(Automobile auto:this.keySet()){
            total+=auto.getGoodsCap();
        }
        return total;
    }
    private double getTotalPrice(){
        double total=0.0;
        for(Automobile am:this.keySet()){
            total+= am.getPrice()*this.get(am);
        }
        return total;
    }
}
