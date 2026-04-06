public class Main {
    static void main(String[] args){

//        Item coke = new Item("drink", "coke", 8);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Burger burger = new Burger("regular", 12);
//        burger.addToppings("BACON","CHEESE","");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.printItemizedList();
//
//        MealOrder cheeseBurger = new MealOrder("cheeseburger", "coke", "fries");
//        cheeseBurger.printItemizedList();
//        cheeseBurger.addBurgerTopping("cheese","bacon","");
//        cheeseBurger.setDrinkSize("LARGE");
//        cheeseBurger.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "sprite","fries");
        deluxeMeal.addBurgerTopping("PICLES", "CHEESE", "BACON", "MEAT", "MEAT");
        deluxeMeal.setDrinkSize("LARGE");
        deluxeMeal.printItemizedList();

    }
}
