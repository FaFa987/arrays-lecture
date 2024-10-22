package se.lexicon;

public class ArrayDemo {
    public static void main(String[] args) {
        ex1();


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
}
