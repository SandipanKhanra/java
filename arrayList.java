package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();

        ar.add("hello");
        ar.add("World");


        System.out.println(ar.size()); //Returns the size
        System.out.println(ar.get(1));
        //ar.remove(ar.get(1)); //Remove a element
        System.out.println(ar.isEmpty()); //Returns a boolean

        System.out.println(ar.indexOf("World"));

        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

    }
}
