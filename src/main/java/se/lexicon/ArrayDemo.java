package se.lexicon;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        sortNumber();


        /*
        int[] numbers = new int[]{5,8,7,3,2};
        //new int[3] = {1 , 2 ,3};
        String[] str = new String[]{"mondey" , "holoween" , "weekwnd"};
        String[] names = {"mohamad" , "fafa" , "hossein"};
        System.out.println(numbers.length);
        System.out.println(String.valueOf(names[1]));
         */
    }
    public static void ex1(){
        String[] names = new String[3];
        System.out.println("size is: "+ names.length);
        names[0] = "John";
        System.out.println(names[0]);
        System.out.println(names[1]);
        names[names.length -1] = "Jane";
        System.out.println(names[2]);
    }

    public static void ex2(){
        int[] numbers = {1,2,3,4,5,6};
        //System.out.println(numbers[0]);
        for(int i = 0; i < numbers.length ; i++){
            if (i == 2){
                numbers[i] = 746;
            }
            System.out.println(numbers[i]);
        }
        System.out.println("--------------");
        for(int element : numbers){
            System.out.println(element);
        }
    }

    public static void ex3(){
        // todo Arrays sort
        int[] orinArray = {5,7,3,4};
        int[] newArray = new int[orinArray.length +1];
        //System.out.println(newArray[2]);
        for(int i = 0 ; i < orinArray.length ; i++){
            newArray[i] = orinArray[i];
        }
        newArray[orinArray.length] = 68;
        System.out.println(newArray[4]);

    }

    public static void maxNumber(){
        int[] numbers = {21,17,34,64};
        int max = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
        if(numbers[i] > max){
            max = numbers[i];
        }
        }
        System.out.println(max);
    }

    public static void ex4(){
        String[][] board = new String [3][4];
        board[0][0] = "✨";
        board[0][1] = "🎭";
        board[1][1] = "🎢";
        board[2][1] = "👓";
        board[2][3] = "🎨";
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }


    }

    public static void sortNumber() {
        int[] numbers = {21,78,45,4,577,6};
        Arrays.sort(numbers);
        for(int element : numbers){
            System.out.println(element);
        }


        }
    }

