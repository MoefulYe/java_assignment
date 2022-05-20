package thirdHomework.keyInFileOut;

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
        System.out.println("1. byte-stream IO");
        System.out.println("2. buffered byte-stream IO");
        System.out.println("3. exit");
    }

    private void getUserInput(){
        Scanner sc=new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                sc.nextLine();
                dataOper.write();
                dataOper.read();
                break;
            case 2:
                sc.nextLine();
                dataOper.bufferedWrite();
                dataOper.bufferedRead();
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
