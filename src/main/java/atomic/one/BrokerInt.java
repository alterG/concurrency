package atomic.one;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class BrokerInt extends Thread {
    MarketInt market;
    private static final int PAUSE = 500;
    public BrokerInt(MarketInt market) {
        this.market = market;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(market.getIndex());
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
