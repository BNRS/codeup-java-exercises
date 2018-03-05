public class BurgerTools {

    private static String MostPopularTopping;
    private static int averageDaysBeforeExpiration;
    private static int temperatureWhenCooked;

    public static String getMostPopularTopping() {
        return MostPopularTopping;
    }

    public static void setMostPopularTopping(String mostPopularTopping) {
        MostPopularTopping = mostPopularTopping;
    }

    public static int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public static void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        BurgerTools.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }

    public static int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }

    public static void setTemperatureWhenCooked(int temperatureWhenCooked) {
        BurgerTools.temperatureWhenCooked = temperatureWhenCooked;
    }

    public static void grill() {

    }

}
