package firstHomework.CardOperatorPlus;
import firstHomework.CardOperator.CardOperator;
import java.util.Arrays;
public class CardOperatorPlus extends CardOperator {
    private static int dealCardsNum= 26;
    private int[] dealCards;
    public CardOperatorPlus(int userInputSetsNum) {
        super(userInputSetsNum);
    }
    public void dealCards(){
        dealCards=Arrays.copyOfRange(cards[1],0,dealCardsNum);
    }
    public void showDealCards(){
        for(int i=0;i<dealCardsNum;i++){
            System.out.print(getCardSuit(dealCards[i])+getCardValue(dealCards[i])+",");
            if(i==dealCardsNum/2-1||i==dealCardsNum-1){
                System.out.println();
            }
        }
    }
    public void rankCardsDDZType(){
        for(int i=0;i<dealCardsNum;i++){
            for(int j=i+1;j<dealCardsNum;j++){
                if(DDZWeight(dealCards[i])>DDZWeight(dealCards[j])){
                    int temp=dealCards[i];
                    dealCards[i]=dealCards[j];
                    dealCards[j]=temp;
                }
            }
        }
    }
    private int DDZWeight(int CardCode){
        int suit=CardCode/13;
        int value=CardCode%13;
        switch(value){
            case 0:
                value=11;
                break;
            case 1:
                value=12;
                break;
            default:
                value-=2;
        }
        return value*4+suit;
    }
    public void rankCardsTLJType(){
        for (int i = 0; i < dealCardsNum; i++) {
            for (int j = i + 1; j < dealCardsNum; j++) {
                if (TLJWeight(dealCards[i]) > TLJWeight(dealCards[j])) {
                    int temp = dealCards[i];
                    dealCards[i] = dealCards[j];
                    dealCards[j] = temp;
                }
            }
        }
    }
    private int TLJWeight(int CardCode){
        return CardCode;
    }
}
