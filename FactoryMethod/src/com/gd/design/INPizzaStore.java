package com.gd.design;

/**
 *
 * @author dasg
 */
public class INPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new INStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new INStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new INStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new INStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
