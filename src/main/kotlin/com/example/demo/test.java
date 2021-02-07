package com.example.demo;

import kotlin.SinceKotlin;

import java.util.stream.IntStream;

public class test {

    public static void main(String[] args) {
        IntStream.range(1,9).forEach(System.out::println);
    }
}