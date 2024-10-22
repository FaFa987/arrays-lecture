package se.lexicon;

public class ArrayDemo {
    public static void main(String[] args) {
        ex2();


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

    }
}
