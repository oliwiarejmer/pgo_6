package zadanie4;

import java.util.Scanner;

public class Zad4Test {

    public static void main(String [] args){
        int [] array = new int[10];
        fillArray(array);

        int counter = 0;
        for(int a: array){
            counter++;
            System.out.println("Wprowadzona liczba numer: [" +counter + "] ==> " + a );
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        if(userChoice<0) throw new NegativeNumberException("Negative numbers are not allowed");
        return userChoice;
    }

    public static void fillArray(int [] array)  {

        for(int i=0; i< array.length; i++){
            try {
                System.out.print("Podaj " + (i+1) + " liczbę: ");
                array[i] = readNumber();

            }catch(NegativeNumberException nne){
                System.out.println(nne.getMessage());
                array[i]=0;
            }
        }
    }
}
