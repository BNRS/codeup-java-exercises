import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question.
//        He answers 'Whoa, chill out!' if you yell at him.
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//        He answers 'Whatever.' to anything else.


        Scanner sc = new Scanner(System.in);

        System.out.println("Ask Bob a question: ");
        String response = sc.nextLine();


        if (response.endsWith("?")) {
            System.out.println("Sure");
        } else if (response.trim().equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (response.endsWith("!") || response.toUpperCase().equals(response)) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }


    }
}
