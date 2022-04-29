package secondHomework.recordKeeping.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Account implements AccountFeature {
    private ArrayList<Record> records;
    private double balance;
    public void init() throws illegalInputException {
        this.balance=0.0;
        this.records=new ArrayList<Record>();
        while(true){
            this.showMainMenu();
            this.getUserInput();
        }
    }
    public void showMainMenu(){
        System.out.println("-----------------家庭账本-----------------");
        System.out.println("1.收支明细");
        System.out.println("2.登记收入");
        System.out.println("3.登记支出");
        System.out.println("4.退出账本");
        System.out.println("请选择(1-4):");
    }
    public void showDetailMenu(){
        System.out.println("-----------------收支明细-----------------");
        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n","日期","收支","收支金额","账户金额","备注");
        for (Record record:this.records){
            System.out.printf("%-10s\t%-10s\t%-10.2f\t%-10.2f\t%-10s\n",record.getDate(),record.getRecordType(),record.getAmountOfMoney(),record.getCurBalance(),record.getComment());
        }
    }
    public void editIncomeInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入收入金额:");
        double amountOfMoney=sc.nextDouble();
        System.out.println("请输入备注:");
        String comment=sc.next();
        updateBalance("in",amountOfMoney);
        this.setRecord("in",this.balance,amountOfMoney,comment,new Date());
    }
    public void ed
                    illegalInputException e=new illegalInputException(choice);
                    e.printStackTrace();itSpendInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入支出金额:");
        double amountOfMoney=sc.nextDouble();
        System.out.println("请输入备注:");
        String comment=sc.next();
        updateBalance("out",amountOfMoney);
        this.setRecord("out",this.balance,amountOfMoney,comment,new Date());
    }
    public void exitAccount(){
        System.out.println("bye");
        System.exit(0);
    }
    private void getUserInput() throws illegalInputException {
        Scanner sc= new Scanner(System.in);
        if (sc.hasNextInt()){
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    this.showDetailMenu();
                    break;
                case 2:
                    this.editIncomeInfo();
                    break;
                case 3:
                    this.editSpendInfo();
                    break;
                case 4:
                    this.exitAccount();
                default:
                    throw new illegalInputException(choice);
            }
        }
    }
    private void setRecord(String recordType,double curBalance,double amountOfMoney,String comment,Date date){
        Record record=new Record();
        record.setRecordType(recordType);
        record.setCurBalance(curBalance);
        record.setAmountOfMoney(amountOfMoney);
        record.setComment(comment);
        record.setDate(date);
        this.records.add(record);
    }
    private void updateBalance(String op,double amountOfMoney){
        if (op.equals("in")){
            this.balance+=amountOfMoney;
        }else if (op.equals("out")){
            this.balance-=amountOfMoney;
        }
    }

}
