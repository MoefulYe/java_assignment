package thirdHomework.randomReal;

import java.util.Scanner;

public class MainProcess{
    private DataOperation dataOper;

    public MainProcess() {
        dataOper = new DataOperation();
    }

    public void init() {
        for(;;){
            showMainMenu();
            getUserInput();
        }
    }

    private void showMainMenu(){
        System.out.println("1. write ramdom real number to file(every line is five real number split by \"|\")");
        System.out.println("2. type the column number to calculate the average");
        System.out.println("3. exit");
    }

    private void getUserInput(){
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                sc.nextLine();
                dataOper.write();
                break;
            case 2:
                sc.nextLine();
                System.out.println("please input the column number(1-5)");
                int col=sc.nextInt()-1;
                System.out.println("the average is "+dataOper.getAverage(col));
                break;
            case 3:
                System.exit(0);
        }
    }
    public static void main(String[] args){
        MainProcess mainProcess=new MainProcess();
        mainProcess.init();
    }
}
