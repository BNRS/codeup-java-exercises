package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    private static Movie[] movie = MoviesArray.findAll();

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
            System.out.println("7 - add a new movie");
            int choice = input.getIntWithinRange("Enter your choice of number: ", 0, 7);
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
                case 7:
                    addMovie();
                    break;
                default:
                    break;
            }
        }

    private static void addMovie() {
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();
        Input choice = new Input();
        Movie[] newList = Arrays.copyOf(movies, movies.length + 1);
        String title = input.getString("please add a movie: ");
        System.out.println("1 for animated");
        System.out.println("2 for drama");
        System.out.println("3 for horror");
        System.out.println("4 for scifi");
        System.out.println("5 for musical");
        System.out.println("Select a category: ");
        int category = choice.getInt("what category?");
        switch (category) {
            case 1:
                newList[newList.length - 1] = new Movie(title, "animated");
                movie = newList;
                break;
            case 2:
                newList[newList.length - 1] = new Movie(title, "drama");
                movie = newList;
                break;
            case 3:
                newList[newList.length - 1] = new Movie(title, "horror");
                movie = newList;
                break;
            case 4:
                newList[newList.length - 1] = new Movie(title, "scifi");
                movie = newList;
                break;
            case 5:
                newList[newList.length - 1] = new Movie(title, "musical");
                movie = newList;
                break;
            default:
                addMovie();
        }
    }

}