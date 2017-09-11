package atomic.one;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Main {
    public static final int BROKERS_COUNT = 30;

    public static void main(String[] args) {
//        Market market = new Market(new AtomicLong(100));
        MarketInt market = new MarketInt(100);
        market.start();
        for (int i = 0; i < BROKERS_COUNT; i++) {
            new BrokerInt(market).start();
        }
    }
}
