package com.company.Tasks_Template.BufferedReader.Input.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово");
        String word = reader.readLine();
        System.out.println(word);
    }
}
