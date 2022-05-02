package secondHomework.carRent.core;

import secondHomework.carRent.util.Management;
import secondHomework.carRent.util.SysConst;


public class AutomobileManager implements Management{
    private final AutoList List;
    public AutomobileManager(AutoList list){
        this.List=list;
    }
    public void init() {
        boolean flag=true;
        while(flag) {
            this.showMenu();
            flag=this.getUserInput();
        }
    }
    private void showMenu(){
        System.out.println("---------Automobile Manager---------");
        System.out.println("1.Add a new automobile");
        System.out.println("2.Delete an automobile");
        System.out.println("3.show all automobiles");
        System.out.println("4.Exit");
        System.out.println("Please choose an option(1-4):");
    }
    private boolean getUserInput(){
        if(SysConst.INPUT.hasNextInt()){
            int choice=SysConst.INPUT.nextInt();
            switch(choice){
                case 1:
                    this.add();
                    break;
                case 2:
                    this.delete();
                    break;
                case 3:
                    this.show();
                    break;
                case 4:
                    return false;
                default:
                    System.out.println("Illegal input!");
                    break;
            }
        }
        return true;
    }
    public void add(){
        System.out.println("Please input what kind of automobile you want to add:");
        System.out.println("1 for car, 2 for truck, 3 for PickUp");
        if(SysConst.INPUT.hasNextInt()){
            int choice=SysConst.INPUT.nextInt();
            switch(choice){
                case 1:
                    Car car=new Car();
                    List.add(car);
                case 2:
                    Truck truck=new Truck();
                    List.add(truck);
                case 3:
                    PickUp pickup=new PickUp();
                    List.add(pickup);
                default:
                    System.out.println("Illegal input!");
                    break;
            }
        }
    }
    public void delete(){
        System.out.println("Please input the index of automobile you want to delete");
        int index=SysConst.INPUT.nextInt();
        List.remove(index);
        System.out.println("delete the automobile successfully");
    }
    public void show(){
        System.out.println("------The automobiles you own------");
        System.out.println("index\t\tbrand\t\tprice\t\tpeopleCap\t\tgoodsCap");
        int count=1;
        for(Automobile am : List){
            System.out.println(count+"\t\t"+am.toString());
            count++;
        }
    }
}