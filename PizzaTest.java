public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza NYCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(NYCheesePizza);

         PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza ChicagoVeggiePizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println(ChicagoVeggiePizza);
    }
}
