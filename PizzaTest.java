public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza NYCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + nyPizzaStore.CheesePizza.getName() + "\n");

        Pizza ChicagoVeggiePizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println("Ordered a " + nyPepperoniPizza.getName() + "\n");
    }
}
