public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileObserver = new MobileApp("Android");
        Observer webObserver = new WebApp("Dashboard");

        market.registerObserver(mobileObserver);
        market.registerObserver(webObserver);

        market.setStockPrice("TCS", 3640.50);
        market.setStockPrice("INFY", 1512.75);
    }
}
