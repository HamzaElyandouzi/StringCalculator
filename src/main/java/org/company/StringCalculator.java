package org.company;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

    //this variabele will keep count how many times this class has bein called up
    private static int calledCount;

    {
        //will increment each time the class has been called
        calledCount++;
    }

    //the main method of the class which will check the string input and return the total collective output.
    public int add(String Number) {

        //will hold the integers that where found in the String
        ArrayList<Integer> NumberTotal = new ArrayList<>();

        //the total amount will be incremented throughout the method and will eventually be return to the user.
        int total=0;

        try {

            //checks if there is context int the String and if not will return 0
        if (Number.equals("")){

            ArrayList <String> NumbersArray = new ArrayList<>();
            NumbersArray.add("0");

        }else{
            //if there is context to the string then everything that that doesnt fall under the following filter will be
            //replaced with " ". leaving only a String of numbers/Integers
            Number = Number.replaceAll("[^-?0-9]+", " ");

            //the String wil the be split apart by there spaces in between and saved in to the Arraylist as separate String.
            ArrayList <String> NumbersArray =
                    new ArrayList (Arrays.asList(Number.trim().split(" ")));

            //the following enhanced for loop will go over the past ArrayList and then parse them to Integers and save and them
            //to the total amount and the ArrayList of NumberTotal.
            //while also checking if there below 1000 and if so ignoring them accordingly.
            for(String numberString : NumbersArray){
                int numb = Integer.parseInt(numberString);
                if(numb<1000) {
                    NumberTotal.add(Integer.parseInt(numberString));
                    total += numb;
                }
            }
        }

        //if the for loop contains a negative number an exception will be thrown
        for (int check: NumberTotal){
            if (check<0){
                throw new Exception();
            }
        }

        //which will print out the following text followed by a printout of al the negative numbers.
       }catch (Exception e){
            System.out.println("No Negative Numbers Allowed");
            PrintNegativeNumber(NumberTotal);
       }
        return total;
    }

    //method to call up the calledCount
    public int getCalledCount(){
        return calledCount;
    }

    //a print methode that uses a for loop if the arraylis contains a negative number
    public void PrintNegativeNumber(ArrayList print){
        for(int i = 0;i<print.size();i++){
            if (i<0){
                System.out.println(i);
            }
        }
    }
}
