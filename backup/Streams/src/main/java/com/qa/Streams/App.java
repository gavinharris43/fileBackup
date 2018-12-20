package com.qa.Streams;
import java.util.stream.*;
/**
 *Streams
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     IntStream.range(1,101).forEach(System.out::println);
     IntStream.range(100,1000).forEach(System.out::println);
     IntStream.range(1,1000).map(num -> num * 10).forEach(System.out::println);
    }
}