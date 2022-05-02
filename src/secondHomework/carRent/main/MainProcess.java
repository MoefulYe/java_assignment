package secondHomework.carRent.main;

import secondHomework.carRent.core.AutoList;
import secondHomework.carRent.core.Orders;
import secondHomework.carRent.util.SysConst;
import secondHomework.carRent.core.RentSystem;
import secondHomework.carRent.core.AutomobileManager;


public class MainProcess {
    public static void main(String[] args){
        AutoList autoList=new AutoList();
        Orders orders=new Orders();
        RentSystem rentSystem=new RentSystem(autoList,orders);
        AutomobileManager automobileManager=new AutomobileManager(autoList);
        while(true){
            int choice=SysConst.INPUT.nextInt();
            switch (choice) {
                case 1 -> automobileManager.init();
                case 2 -> rentSystem.init();
                case 3 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please input the correct number!");
            }
        }
    }
}
