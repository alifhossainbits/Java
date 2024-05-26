import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        ///// User Input ///
        Scanner doollaaloo = new Scanner(System.in);

        System.out.println("your name? ");
        String name = doollaaloo.nextLine();
        System.out.println("Whats your age? ");
        int age = doollaaloo.nextInt();
        System.out.println("What's your favorite food?");
        doollaaloo.nextLine();
        String food = doollaaloo.nextLine(); // it's skipped at first because after nextInt() it left a extra new line /n (enter) so when it came for food's turn it skipped. to fix it we can add doollaaloo.nextLine() before food.

        System.out.println("Hello Mr."+name+". You're "+age+" years old. and your favorite food is "+food);



        //////// Swap Two Variable /////
        // String x = "water";
        // String y = "red-bull";
        // String temp;

        // temp = x;
        // x = y;
        // y = temp;

        // System.out.println(temp);
        // System.out.println(x);
        // System.out.println(y);


        // System.out.println("Hello world");
        // int x = 300;
        // int y = 400;
        // int total = x + y;
        // System.out.println(total);

    }
}
