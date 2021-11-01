import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        String str="xRpSLbFo";

        List<String> myArray = new ArrayList<String>();

        String[] ch = str.split("");
        myArray=Arrays.asList(ch);
        Collections.sort(myArray, new MainClass.CompareStrings());
        str="";
        for(String h:myArray)
            str+=h;
        System.out.println(str);


    }

    public static class CompareStrings implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
           return s1.compareToIgnoreCase(s2);
        }
    }
}