import LLD.DecoratorDesignPattern.BasePizza;
import LLD.DecoratorDesignPattern.CheesePizza;
import LLD.DecoratorDesignPattern.Pizza;
import LLD.DecoratorDesignPattern.VeggiePizza;
import LLD.FactoryDesignPattern.Android;
import LLD.FactoryDesignPattern.IOS;
import LLD.FactoryDesignPattern.OS;
import LLD.FactoryDesignPattern.OSFactory;
import LLD.FactoryDesignPattern.Windows;
import LLD.ObserverDesignPattern.Observable.ConcreteIphoneObservable;
import LLD.ObserverDesignPattern.Observable.ConcreteShoeObservable;
import LLD.ObserverDesignPattern.Observable.StocksObservable;
import LLD.ObserverDesignPattern.Observer.EmailNotifObserver;
import LLD.ObserverDesignPattern.Observer.NotifObserver;
import LLD.ObserverDesignPattern.Observer.PhoneNotifObserver;
import LLD.StrategyDesign.NormalVehicle;
import LLD.StrategyDesign.SportsVehicle;
import LLD.StrategyDesign.Vehicle;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Main {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os1 = osFactory.getInstance("open");
        os1.spec();

        OS os2 = osFactory.getInstance("closed");
        os2.spec();

        OS os3 = osFactory.getInstance("hello world");
        os3.spec();
    }
}