package firstHomework.CardOperator;
import java.util.Arrays;
import java.util.Random;

public class CardOperator {
    protected final static int numPerSet =52;
    protected final static String[] suit={"♠","♥","♦","♣"};
    protected final static String[] value={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    protected int setsNum;
    protected int[][] cards;
    public CardOperator(int userInputSetsNum){
        this.setsNum=userInputSetsNum;
        initCards();
    }
    protected void initCards(){
        cards=new int[this.setsNum][];
        for(int i=0;i<this.setsNum;i++){
            cards[i]=new int[numPerSet];
            for(int j=0;j<numPerSet;j++){
                cards[i][j]=j;
            }
        }
    }
    protected String getCardSuit(int cardCode){
        return suit[cardCode/13];
    }
    protected String getCardValue(int cardCode){
        return value[cardCode%13];
    }
    public void showCards(){
        for(int i=0;i<this.setsNum;i++){
            System.out.println("第"+(i+1)+"副牌");
            for(int j=0;j<numPerSet;j++){
                System.out.print(getCardSuit(cards[i][j])+getCardValue(cards[i][j])+",");
                if((j+1)%13==0){
                    System.out.print("\n");
                }
            }
        }
    }
    public void shuffleCards(){
        Random rd=new Random();
        for(int i=0;i<this.setsNum;i++){
            for(int j=0;j<numPerSet;j++){
                int temp=cards[i][j];
                int randomIndex= rd.nextInt(numPerSet);
                cards[i][j]=cards[i][randomIndex];
                cards[i][randomIndex]=temp;
            }
        }
    }
    public void rankCards(){
        for(int i=0;i<this.setsNum;i++){
            Arrays.sort(cards[i]);
        }
    }
}
