import java.util.Scanner;
//Initially wrote this all in Java aiming to run it but I did not know I could not run Java files directly on the browsers
//Hence, I remodeled everything to write it in javascript using essentially the same structure with some CSS
//Enjoy the game! Happy Halloween!
public class backend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String namePerson = scanner.nextLine();
        System.out.println(namePerson + ", Are you ready (Y/N)");
        String responseUser = scanner.nextLine();
        if(responseUser.equals("Y")){
            System.out.println("Rate how you feel 1 is worst and 5 is best (1-5) NUMBERS ONLY!!");
            int ratingUser = scanner.nextInt();
            if(ratingUser == 1){
                System.out.println("I'm sorry you are having a bad day. Take a walk if you can.");
            } else if (ratingUser == 2){
                System.out.println("Remember, it's okay for life to have its ups and downs you got this!");
            } else if(ratingUser == 3){
                System.out.println("Feeling in the middle? Me too girl!");
            } else if(ratingUser == 4){
                System.out.println("Yay! Glad to hear! Hope you have a wonderful rest of your day");
            } else if (ratingUser == 5) {
                System.out.println("Keep up the positivity!!");
            } else {
                System.out.println("Invalid Choice :((");
                }
        } else {
            System.out.println("Let's play a Halloween themed game because I am ironically programming this on Halloween :D)!! Say HALLOWEEN to get started!!");
            String halloween = scanner.nextLine();
            System.out.println("Would you rather eat CANDY CORNS or SNICKERS (ALL CAPS PLEASE) ");
            String candyChoice = scanner.nextLine();
            String respond = candyChoice.equals("CANDY CORNS") ? "Not my favorite but they are pretty good still. " : (candyChoice.equals("SNICKERS")) ? "Perfect balance of sweet and salty! " : "Neither! Wow, well alright.";
            System.out.println(respond);
            System.out.println("Last Question: Is Halloween your favorite holiday? (Y/N) ");
            String halOp = scanner.nextLine();
            String checker = " ";
            if(halOp.equals("Y")){
                checker = "Yayy!";
            } else {
                checker = "WHAT? Yes is the right answer (I am just joking!!) ";
            }
            System.out.println(checker);
            System.out.println("Thank you for playing! It was really fun!");
        }
    }

}
