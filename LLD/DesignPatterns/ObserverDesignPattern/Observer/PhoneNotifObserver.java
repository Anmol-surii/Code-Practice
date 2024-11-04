package LLD.DesignPatterns.ObserverDesignPattern.Observer;

import LLD.DesignPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class PhoneNotifObserver implements NotifObserver {
    String userName;
    StocksObservable observable;

    public PhoneNotifObserver(String userName, StocksObservable ob) {
        this.userName = userName;
        this.observable = ob;
    }

    @Override
    public void update() {
        int countOfUnits = observable.getStockCount();
        System.out.println("Hurry up " + userName + " Stock is back, " + observable.getType() + " units left: " + countOfUnits);
    }
    
}
