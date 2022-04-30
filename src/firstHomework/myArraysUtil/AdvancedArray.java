package firstHomework.myArraysUtil;

import java.util.Random;

public class AdvancedArray extends BasicArray implements BasicArrayOperation, AdvancedArrayOperation {
    public AdvancedArray(int[] array) {
        super.array= array;
        super.size= array.length;
    }
    public AdvancedArray(int size) {
        super.array= new int[size];
        super.size= size;
    }
    public AdvancedArray() {
        super.array= new int[0];
        super.size= 0;
    }
    public void setArray(int[] array) {
        super.array= array;
        super.size= array.length;
    }
    public int getSize() {
        return super.size;
    }
    public int getElement(int index) {
        return super.array[index];
    }
    public void setElement(int index, int value) {
        super.array[index]= value;
    }
    public int getMaxValue(){
        int max=super.array[0];
        for(int i=1;i<super.size;i++){
            if(super.array[i]>max){
                max=super.array[i];
            }
        }
        return max;
    }
    public int getMinValue(){
        int min=super.array[0];
        for(int i=1;i<super.size;i++){
            if(super.array[i]<min){
                min=super.array[i];
            }
        }
        return min;
    }
    public void insert(int index, int value) {
        int[] newArray=new int[super.size+1];
        for(int i=0;i<index;i++){
            newArray[i]=super.array[i];
        }
        newArray[index]=value;
        for(int i=index;i<super.size;i++){
            newArray[i+1]=super.array[i];
        }
        super.array=newArray;
        super.size++;
    }
    public void move(int offset) {
        if (offset == 0) {
            return;
        }else if (offset < 0) {
            offset= -offset;
            offset%=super.size;
            reverse(super.array, 0, offset-1);
            reverse(super.array, offset, super.size-1);
            reverse(super.array, 0, super.size-1);
        }else if (offset > 0) {
            offset%=super.size;
            reverse(super.array, 0, super.size-offset-1);
            reverse(super.array, super.size-offset, super.size-1);
            reverse(super.array, 0, super.size-1);
        }
    }
    private void reverse(int[] array, int left, int right) {
        for(int i=left, j=right; i<j; i++, j--) {
            array[i]=array[i]^array[j];
            array[j]=array[i]^array[j];
            array[i]=array[i]^array[j];
        }
    }
    public void printArray() {
        for(int i=0;i<super.size;i++){
            System.out.print(super.array[i]+" ");
        }
        System.out.println();
    }
    public int binarySearch(int key) {
        for(int left=0,right=super.size-1,m=(left+right)/2;left<=right;m=(left+right)/2){
            if(key==super.array[m]){
              return m;
            }else if(key<super.array[m]){
                right=m-1;
            }else{
                left=m+1;
            }
        }
        return -1;
    }
    public void shuffle(){
        Random rd=new Random();
        for(int i=0;i<super.size;i++){
            int randomIndex=rd.nextInt(super.size);
            int temp=super.array[i];
            super.array[i]=super.array[randomIndex];
            super.array[randomIndex]=temp;
        }
    }
    public void quickSort(int left, int right) {
        if(left>=right){
            return;
        }else{
            int pivot=super.array[left];
            int i=left,j=right;
            while(i<j){
                while(i<j&&super.array[j]>=pivot){
                    j--;
                }
                super.array[i]=super.array[j];
                while(i<j&&super.array[i]<=pivot){
                    i++;
                }
                super.array[j]=super.array[i];
            }
            super.array[i]=pivot;
            quickSort(left,i-1);
            quickSort(i+1,right);
        }
    }
}
