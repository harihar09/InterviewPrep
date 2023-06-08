package com.interviewPrep.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    public static void main(String[] args) throws IOException {
        File file = new File("R:\\Java\\git_Tutorial\\Git commands.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.readLine() !=null){
            System.out.println(br.readLine());
        }
    }
}
