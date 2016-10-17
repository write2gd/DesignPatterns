package com.gd.design;

/**
 *
 * @author dasg
 */
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("IN")) {
            if (type.equals("cheese")) {
                pizza = new INStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new INStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new INStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new INStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
