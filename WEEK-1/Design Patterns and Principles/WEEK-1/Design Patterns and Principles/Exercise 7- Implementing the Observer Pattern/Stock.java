public interface Stock {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);  // THIS LINE IS IMPORTANT
    void notifyObservers();
}
