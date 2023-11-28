package Generics;

public class GenericArrayPrint{

    public static <T> void print(T[] arr)
    {
        for(T it : arr)
        {
            System.out.println(it);
        }
    }

    public static void main(String[] args)
    {
        Integer[] IntArr = {1,2,3,4};
        System.out.println("Integer Array: ");
        print(IntArr);

        String[] StringArr = {"car","toy","apple"};
        System.out.println("String Array: ");
        print(StringArr);

        Double[] DoubleArr = {1.0,1.1,1.2,1.3};
        System.out.println("Double Array: ");
        print(DoubleArr);
    }
}