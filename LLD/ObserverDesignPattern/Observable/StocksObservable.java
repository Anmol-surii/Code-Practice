package LLD.ObserverDesignPattern.Observable;

import LLD.ObserverDesignPattern.Observer.NotifObserver;

public interface StocksObservable {
    void addObserver(NotifObserver ob);
    void removeObserver(NotifObserver ob);
    void NotifyObserver();
    void setStockCount(int units);
    int getStockCount();
    String getType();
}