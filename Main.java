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
        StocksObservable iphoneObservable = new ConcreteIphoneObservable();
        StocksObservable shoeObservable = new ConcreteShoeObservable();


        NotifObserver iphoneOb1 = new PhoneNotifObserver("anmol_suri", iphoneObservable);
        NotifObserver iphoneOb2 = new EmailNotifObserver("anmolsuri321@gmail.com", iphoneObservable);

        NotifObserver shoeOb1 = new PhoneNotifObserver("arman_suri", shoeObservable);
        NotifObserver shoeOb2 = new EmailNotifObserver("armansuri321@gmail.com", shoeObservable);

        iphoneObservable.addObserver(iphoneOb1);
        iphoneObservable.addObserver(iphoneOb2);

        shoeObservable.addObserver(shoeOb1);
        shoeObservable.addObserver(shoeOb2);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(10);
        System.out.println(iphoneObservable.getStockCount());

        shoeObservable.setStockCount(26);
        shoeObservable.setStockCount(32);
        System.out.println(shoeObservable.getStockCount());
    }
}