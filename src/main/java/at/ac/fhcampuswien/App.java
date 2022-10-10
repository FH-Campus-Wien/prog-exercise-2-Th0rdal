package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double biggest = 0.0;
        int counter = 1;
        String outputString = "Number "+counter+":";
        do {
            outputString = "Number "+counter+": ";
            System.out.print(outputString);
            double userinput = scanner.nextDouble();
            counter = counter + 1;
            if (userinput <= 0.0) {
                break;
            } else if (userinput > biggest) {
                biggest = userinput;
            }
        }while (true);
        if (biggest <= 0.0) {
            System.out.println("No number entered.");
            return;
        }
        System.out.printf("The largest number is %.2f",biggest);
        System.out.println("");
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int userinput = scanner.nextInt();
        int counter = 1;

        if (userinput <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < userinput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                System.out.print(" ");
                counter = counter + 1;
            }
            System.out.println("");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int space = 5;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            space = space - 1;
            System.out.println("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int height = scanner.nextInt();
        System.out.print("c: ");
        String userinput = scanner.next();
        char letter = userinput.charAt(0);
        int spaces = height / 2;
        int temp = 0;

        if (height % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0; i < height/2; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                temp = (int)letter-j;
                System.out.print((char) temp);
            }
            for (int j = 1; j <= i; j++) {
                temp = (int)letter-j;
                System.out.print((char)(temp));
            }
            System.out.println("");
            spaces = spaces - 1;
        }

        spaces = 0;
        for (int i = height/2; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                temp = (int)letter-j;
                System.out.print((char)temp);
            }
            for (int j = 1; j <= i; j++){
                temp = (int)letter-j;
                System.out.print((char)temp);
            }
            System.out.println("");
            spaces = spaces + 1;
        }


    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int userinput = 0;
        int count5 = 0;
        int sum = 0;
        int counter = 0;
        double average = 0.0;

        do {
            System.out.print("Mark " + (counter+1) + ": ");
            userinput = scanner.nextInt();
            if (userinput == 0) {
                break;
            }else if (userinput > 5) {
                System.out.println("Invalid mark!");
                continue;
            }else if (userinput == 5) {
                count5++;
            }
            sum = sum + userinput;
            counter++;
        }while (true);

        if (sum != 0) {
            average = (double) sum / (double) counter;
        }
        System.out.printf("Average: %.2f", average);
        System.out.println("");
        System.out.println("Negative marks: " + count5);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int userinput = scanner.nextInt();
        int sadNumber1 = 4;
        int sadNumber2 = 16;
        int sadNumber3 = 37;
        int sadNumber4 = 58;
        int sadNumber5 = 89;
        int sadNumber6 = 145;
        int sadNumber7 = 42;
        int sadNumber8 = 20;
        int number = userinput;
        int calc = 0;

        int temp = 0;
        while (calc != 1) {
            calc = 0;
            while (number != 0) {
                temp = number % 10;
                calc = calc + (temp*temp);
                number = number/10;
            }
            number = calc;
            if (calc == sadNumber1 || calc == sadNumber2 || calc == sadNumber3 || calc == sadNumber4 || calc == sadNumber5 || calc == sadNumber6 || calc == sadNumber7 || calc == sadNumber8) {
                System.out.println("Sad number!");
                return;
            }
        }
        System.out.println("Happy number!");

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}