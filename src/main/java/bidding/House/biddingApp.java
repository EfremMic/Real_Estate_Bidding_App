package bidding.House;

import java.util.ArrayList;
import java.util.List;

public class biddingApp {
    public static void main(String[] args) {
        List<house> houses = new ArrayList<>();
        houses.add(new house("House 1", 250000.0));
        houses.add(new house("House 2", 300000.0));
        houses.add(new house("House 3", 200000.0));

        biddingLogic biddingLogic = new biddingLogic(houses);
        biddingLogic.runBiddingApp();
    }
}