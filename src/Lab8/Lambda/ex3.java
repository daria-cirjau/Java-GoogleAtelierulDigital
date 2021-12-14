package Lab8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ex3 {
    public static List<String> replace(List<String> words){

        return words.stream().map(s-> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words= Arrays.asList("IoNel","nU","esTE");

        System.out.println(replace(words));    }
}
