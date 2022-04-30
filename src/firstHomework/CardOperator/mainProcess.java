package firstHomework.CardOperator;

public class mainProcess {
    public static void main(String args[]){
        CardOperator co=new CardOperator(2);
        System.out.println("卡牌初始化：");
        co.showCards();
        System.out.println("卡牌洗牌后：");
        co.shuffleCards();
        co.showCards();
        System.out.println("卡牌理牌后：");
        co.rankCards();
        co.showCards();
    }
}
