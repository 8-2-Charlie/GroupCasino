package com.github.zipcodewilmington.casino.games.numberguess;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessGame {
public int num;

    public NumberGuessGame() {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }


    public int getRandomNumber(){

        return (int)(Math.random()*10)+1;
    }
    public Boolean numberCompare(){
        String result="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
         num = in.nextInt();
        System.out.println(num);

        return num==getRandomNumber();
//
    }
    public String resultToString(){
        NumberGuessGame numGuess =  new NumberGuessGame();
        String result="";
        if(numGuess.numberCompare()){
            return result+=("You win, our number is "+ num);
        }else{
            return result+=("You lose. My number is "+ getRandomNumber()+
                    "\nYour number is "+ num);

        }
    }
}