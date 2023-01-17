import java.util.Scanner;

public class Guess {

    Guess(){}

    public void guess(){

        Scanner sc = new Scanner(System.in);

        int i;
        int n = 7;
        int number = 1 + (int)(100 * Math.random());
        int guess;
        int cnt = 0;


        System.out.println("A number from 1 to 100 is genertated.");
        System.out.println("Guess the number!");

        for (i=0;i< n;i++)
        {
            System.out.println("Guess the number");

            guess = sc.nextInt();

            if(guess == number)
            {
                cnt++;
                System.out.println("You guessed the number in: "+ cnt + " attempts");
                break;
            } else if (guess < number && i!=n-1) {
                System.out.println("Number is greater than " + guess);
                cnt++;
            } else if (guess > number && i!=n-1) {
                System.out.println("Number is less than " + guess);
                cnt++;
            }

        }
        if(i == n)
        {
            System.out.println("You have exhausted" + n + "trials");
            System.out.println("The number was: " + number);
        }
    }
}
