public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.setMostPopularTopping("pep");
        String topping = BurgerTools.getMostPopularTopping();

        BurgerTools.setAverageDaysBeforeExpiration(1);
        int days = BurgerTools.getAverageDaysBeforeExpiration();

        BurgerTools.setTemperatureWhenCooked(170);
        int temp = BurgerTools.getTemperatureWhenCooked();

        System.out.println("Our most popular topping is: " + topping + "\n " +
               "Expires: "+ days + "\n " +
               "Cook Temp: " + temp);
        BurgerTools.grill();

    }

}
