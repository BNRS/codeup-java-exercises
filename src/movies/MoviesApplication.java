package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();

        do {
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - view movies in the musical category");
            int choice = input.getIntWithinRange("Enter your choice of number: ", 0, 6);
            getUserChoice(choice);
            System.out.println("======================================");
        } while (input.yesNo("Would you like to continue? Y/N"));
            System.out.println("Goodbye");
    }

        public static void showMovies(String category) {
            Movie[] movies = MoviesArray.findAll();
            System.out.println("Movies in the " + category + " category:");
            System.out.println("======================================");
            for (Movie m : movies) {
                if (m.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all movies")) {
                    System.out.println("TITLE: " + m.getName() + " CATEGORY: " + m.getCategory());
                }
            }
        }


        public static void getUserChoice(int choice) {
            switch (choice) {
                case 1:
                    showMovies("all movies");
                    break;
                case 2:
                    showMovies("animated");
                    break;
                case 3:
                    showMovies("drama");
                    break;
                case 4:
                    showMovies("horror");
                    break;
                case 5:
                    showMovies("scifi");
                    break;
                case 6:
                    showMovies("musical");
                    break;
                default:
                    break;
            }
        }


}