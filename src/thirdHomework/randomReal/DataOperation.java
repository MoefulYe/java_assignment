package thirdHomework.randomReal;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataOperation {
    private static final String FILE_NAME="./output.txt";
    private File file=null;
    private static final Scanner INPUT=new Scanner(System.in);

    private FileInputStream fis;
    private FileOutputStream fos;
    private BufferedInputStream bis;
    private BufferedOutputStream bos;

    public DataOperation(){
        file = new File(FILE_NAME);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private String readFromKeyBoard(){
        return INPUT.nextLine();
    }

    public void write(){
        try{
            fos=new FileOutputStream(file);
            for (String str = readFromKeyBoard(); !str.equals("-1"); str=readFromKeyBoard()){
                fos.write(str.getBytes());
            }
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String read(){
        try{
            fis=new FileInputStream(file);
            byte[] bytes=new byte[1024];
            fis.read(bytes);
            String str= new String(bytes, "UTF-8");
            System.out.println(str);
            fis.close();
            return str;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public double getAverage(int col){
         String[] strs=read().split("\\|");
         ArrayList<Double> nums=new ArrayList<>();
         for(int i=col;i<strs.length-1;i+=5){
             nums.add(Double.parseDouble(strs[i]));
         }
         double sum=0;
         for(double num:nums){
             sum+=num;
         }
         return sum/nums.size();
    }
}
