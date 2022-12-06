import java.util.Scanner;

class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number greater than or equal to 2.");
        int num = input.nextInt();


        while (num<2) {
            System.out.println(num +" is not greater than or equal to 2, please try again.");
            num = input.nextInt();
        }

        int sum = 0;
        for (int i = 2; i <= num; i++){
            if (i%2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all even numbers between 2 and " + num + " (inclusive) is: "+sum);
    }
}

/*
Enter a number greater than or equal to 2.
1
1 is not greater than or equal to 2, please try again.
10
The sum of all even numbers between 2 and 10 (inclusive) is: 30
 */
