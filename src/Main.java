/*
Write a Queue client that takes a command-line argument k and prints the kth from the last string
found on standard input (assuming that standard input has k or more strings).
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Please provide k as a command-line argument.");
            return;
        }// if statement

        int k = Integer.parseInt(args[0]);

        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String word = scanner.next();
            queue.add(word); // Add new word to the queue

            if (queue.size() > k)
            {
                queue.poll();

            }//emd if statement
        }//end while loop
        scanner.close();

        if (queue.size() < k)
        {
            System.out.println("Not enough words in input.");
        } // end if statement
        else
        {
            System.out.println("The " + k + "-th last word is: " + queue.peek());
        }// end else condition

    }//end main
}//end class