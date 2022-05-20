package thirdHomework.multiThread;

import java.io.*;
import java.util.Scanner;

public class DataOperation extends Thread {
    private static final String FILE_NAME="./write.txt";
    private File file=null;
    private final int ROWS=100;
    public static int featureCode=0;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private BufferedWriter bw;

    private static Object lock=new Object();

    public DataOperation(String name){
        super(name);
        file = new File(FILE_NAME);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void run(){
        switch (featureCode){
            case 1:
                write();
                break;
            case 2:
                read();
                break;
        }
    }

    private double[] genRandomData(){
        double[] data=new double[5];
        for (int i=0;i<5;i++){
            data[i]=Math.round(Math.random()*1000)/100.0;
        }
        return data;
    }

    public void write(){
        try{
            fw=new FileWriter(file,true);
            bw=new BufferedWriter(fw);
            for (int i=0;i<ROWS;i++){
                synchronized (lock){
                    double[] data=genRandomData();
                    StringBuilder sb=new StringBuilder().append(data[0]).append("|").append(data[1]).append("|").append(data[2]).append("|").append(data[3]).append("|").append(data[4]).append("\n");
                    bw.write(sb.toString());
                    bw.flush();
                    System.out.print(Thread.currentThread().getName()+" write "+sb.toString());
                }
                sleep(5);
            }
            bw.close();
            fw.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try{
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(Thread.currentThread().getName()+" read "+line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
