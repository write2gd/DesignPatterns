package com.gd.factorymathod;

/**
 *
 * @author dasg
 */
public class INStylePepperoniPizza extends Pizza {

    public INStylePepperoniPizza() {
        name = "India Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
