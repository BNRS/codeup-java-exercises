public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        dish.setCostInCents(50);
        int cost = dish.getCostInCents();

        dish.setNameOfDish("chicken");
        String chicken = dish.getNameOfDish();

        dish.setWouldRecommend(true);
        boolean isrec = dish.getWouldRecommend();


        System.out.println(cost + " " + chicken + " " + isrec);
        dish.eat();

    }

}
