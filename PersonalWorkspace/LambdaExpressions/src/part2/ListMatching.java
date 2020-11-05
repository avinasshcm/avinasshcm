package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import part1.Cars;

public class ListMatching {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "Good Morning", "Will be back");
        System.out.println("Original List");
        System.out.println(words);

        Predicate<String> matcher = s -> s.length() < 4;
        List<String> shortWords = StringUtils.allMatches(words, matcher);
        System.out.println("-----------------------------------");
        System.out.println("Shorter that 4 Char");
        System.out.println(shortWords);

        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        System.out.println("-----------------------------------");
        System.out.println("Contains b");
        System.out.println(wordsWithB);

        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println("-----------------------------------");
        System.out.println("Even Letters");
        System.out.println(evenLengthWords);
        
        System.out.println("-----------------------------------");
        System.out.println("Numbers Greater than 500");
        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n > 500);
        System.out.println(bigNums);
        
        
        System.out.println("-----------------------------------");
        System.out.println("Exciting Words");
        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println(excitingWords);
        
        
        System.out.println("-----------------------------------");
        System.out.println("eye Words");
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println(eyeWords);
        
        System.out.println("-----------------------------------");
        System.out.println("Uppercase Words");
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println(upperCaseWords);
    
        System.out.println("-----------------------------------");
        System.out.println("Word Lengths");
        List<Integer> wordLengths = StringUtils.transformedList(words, String::length);
        System.out.println(wordLengths);
        
    }
}
