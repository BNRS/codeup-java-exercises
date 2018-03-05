public class ServerNameGenerator {

    public static String[] tenNouns = {
            "person",
            "place",
            "thing",
            "dog",
            "cat",
            "bike",
            "car",
            "boat",
            "house",
            "texas"
    };

    public static String[] tenAdjectives = {
            "aggressive",
            "agreeable",
            "ambitious",
            "brave",
            "calm",
            "delightful",
            "eager",
            "faithful",
            "short",
            "tall",
    };

    public static String getRandom(String[] array) {
        return array[(int)(Math.floor(Math.random()*array.length))];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(getRandom(tenAdjectives) + "-" + getRandom(tenNouns));
    }

}
