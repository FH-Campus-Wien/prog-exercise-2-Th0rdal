package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double dBiggest = 0.0;
        int iCounter = 1;
        String sOutput = "Number "+iCounter+":";
        do {
            sOutput = "Number "+iCounter+": ";
            System.out.print(sOutput);
            double dUserinput = scanner.nextDouble();
            iCounter = iCounter + 1;
            if (dUserinput <= 0.0) {
                break;
            } else if (dUserinput > dBiggest) {
                dBiggest = dUserinput;
            }
        }while (true);
        if (dBiggest <= 0.0) {
            System.out.println("No number entered.");
            return;
        }
        System.out.printf("The largest number is %.2f",dBiggest);
        System.out.println("");
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int iUserinput = scanner.nextInt();
        int iCounter = 1;

        if (iUserinput <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < iUserinput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(iCounter);
                System.out.print(" ");
                iCounter = iCounter + 1;
            }
            System.out.println("");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int iSpace = 5;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < iSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            iSpace = iSpace - 1;
            System.out.println("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int iHeight = scanner.nextInt();
        System.out.print("c: ");
        String sUserinput = scanner.next();
        char cLetter = sUserinput.charAt(0);
        int iSpace = iHeight / 2;
        int iTemp = 0;

        if (iHeight % 2 == 0) { //remove invalid heights
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0; i < iHeight/2; i++) { //pyramid
            for (int j = 0; j < iSpace; j++) {  //spaces
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) { //char left of the middle
                iTemp = (int)cLetter-j;
                System.out.print((char) iTemp);
            }
            for (int j = 1; j <= i; j++) { //char right of the middle
                iTemp = (int)cLetter-j;
                System.out.print((char)(iTemp));
            }
            System.out.println("");
            iSpace = iSpace - 1;
        }

        iSpace = 0;
        for (int i = iHeight/2; i >= 0; i--) {  //reverse pyramide
            for (int j = 0; j < iSpace; j++) {  //spaces
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {  //char left of the middle
                iTemp = (int)cLetter-j;
                System.out.print((char)iTemp);
            }
            for (int j = 1; j <= i; j++){   //char right of the middle
                iTemp = (int)cLetter-j;
                System.out.print((char)iTemp);
            }
            System.out.println("");
            iSpace = iSpace + 1;
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
        int iUserinput = scanner.nextInt();
        int iSadNumber = 4;
        int iNumber = iUserinput;
        int iCalc = 0;

        int iTemp = 0;
        while (iCalc != 1) {
            iCalc = 0;
            while (iNumber != 0) {
                iTemp = iNumber % 10;
                iCalc = iCalc + (iTemp*iTemp);
                iNumber = iNumber/10;
            }
            iNumber = iCalc;
            if (iCalc == iSadNumber) {
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