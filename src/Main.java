import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        Class c1 = l1.getClass();
        Class c2 = l2.getClass();

        System.out.println(Arrays.toString(c1.getTypeParameters()));
        System.out.println(Arrays.toString(c2.getTypeParameters()));

    }

}