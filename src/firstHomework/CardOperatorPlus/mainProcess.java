package firstHomework.CardOperatorPlus;

public class mainProcess {
    public static void main(String[] args) {
        CardOperatorPlus cop=new CardOperatorPlus(2);
        cop.shuffleCards();
        cop.dealCards();
        System.out.println("发牌后:");
        cop.showDealCards();
        System.out.println("按斗地主规则排序后:");
        cop.rankCardsDDZType();
        cop.showDealCards();
        System.out.println("按照拖拉机规则排序后:");
        cop.rankCardsTLJType();
        cop.showDealCards();
    }
}
