package thirdHomework.multiThread;

import java.util.Scanner;

public class MainProcess{
    private DataOperation[] dataOpers;

    public void init() throws InterruptedException {
        for(;;){
            showMainMenu();
            getUserInput();
            while(Thread.activeCount()>1);
        }
    }

    private void showMainMenu(){
        System.out.println("1. multiThread write");
        System.out.println("2. multuThread read");
        System.out.println("3. exit");
    }

    private void getUserInput(){
        Scanner sc=new Scanner(System.in);
        DataOperation.featureCode=sc.nextInt();
        if (DataOperation.featureCode==3){
            System.exit(0);
        }else{
            sc.nextLine();
            dataOpers=new DataOperation[10];
            for(int i=0;i<dataOpers.length;i++){
                dataOpers[i]=new DataOperation("Thread"+i);
                dataOpers[i].start();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main process start");
        MainProcess mainProcess=new MainProcess();
        mainProcess.init();
    }
}
