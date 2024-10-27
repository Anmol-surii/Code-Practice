import LLD.DecoratorDesignPattern.BasePizza;
import LLD.DecoratorDesignPattern.CheesePizza;
import LLD.DecoratorDesignPattern.Pizza;
import LLD.DecoratorDesignPattern.VeggiePizza;
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
        Pizza pizza = new BasePizza();
        System.out.println("Cost of " + pizza.pizzaType() + ": " + pizza.cost());

        pizza = new CheesePizza(pizza);
        System.out.println("Cost of " + pizza.pizzaType() + ": " + pizza.cost());

        pizza = new VeggiePizza(pizza);
        System.out.println("Cost of " + pizza.pizzaType() + ": " + pizza.cost());

        pizza = new CheesePizza(pizza);
        System.out.println("Cost of " + pizza.pizzaType() + ": " + pizza.cost());
    }
}