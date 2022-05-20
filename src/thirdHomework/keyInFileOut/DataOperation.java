package thirdHomework.keyInFileOut;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class DataOperation {
    private static final String FILE_NAME="./input.txt";
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
               str+="\n";
               fos.write(str.getBytes());
           }
           fos.close();
       } catch (IOException e){
           e.printStackTrace();
       }
    }

    public void read(){
        try{
            fis=new FileInputStream(file);
            byte[] bytes=new byte[1024];
            fis.read(bytes);
            String str= new String(bytes, "UTF-8");
            System.out.print(str);
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void bufferedRead(){
        try {
            fis=new FileInputStream(file);
            bis=new BufferedInputStream(fis);
            byte[] bytes=new byte[1024];
            bis.read(bytes);
            String str= new String(bytes, "UTF-8");
            System.out.print(str);
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedWrite(){
        try {
            fos=new FileOutputStream(file);
            bos=new BufferedOutputStream(fos);
            for (String str = readFromKeyBoard(); !str.equals("-1"); str=readFromKeyBoard()){
                str+="\n";
                bos.write(str.getBytes());
                bos.flush();
            }
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
