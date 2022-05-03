package secondHomework.carRent.core;

import java.util.ArrayList;

public class AutoList extends ArrayList<Automobile> {
    public AutoList(){
        super();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("------The automobiles you own------\n").append("index\t\tbrand\t\tprice\t\tpeopleCap\t\tgoodsCap\n");
        for(int i=0;i<this.size();i++){
            sb.append(i).append("\t\t").append(this.get(i).getBrand()).append("\t\t");
            sb.append(this.get(i).getPrice()).append("\t\t");
            sb.append(this.get(i).getPeopleCap()).append("\t\t");
            sb.append(this.get(i).getGoodsCap()).append("\t\t\n");
        }
        return sb.toString();
    }
}
