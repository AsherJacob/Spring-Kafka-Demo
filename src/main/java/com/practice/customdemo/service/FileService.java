package com.practice.customdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class FileService {

    private final Publisher publisher;

    public String getResponse(){
        return "Hey man!";
    }

    public String getFile(){

        try{
            File file = new File("Readme.txt");
            Scanner myReader = new Scanner(file);
            StringBuilder data = new StringBuilder();

            while (myReader.hasNextLine()){
                String lineOfText = myReader.nextLine();
                data.append(lineOfText).append("\n");
                publisher.publishToTopic(lineOfText);
            }

            myReader.close();
            return data.toString();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "Error!";
        }
    }
}
