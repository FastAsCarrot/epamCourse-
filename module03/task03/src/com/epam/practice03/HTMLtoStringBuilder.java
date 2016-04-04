package com.epam.practice03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vrama on 02.04.2016.
 */
public class HTMLtoStringBuilder {

    public static StringBuilder toStringBuilder(String path) {

        StringBuilder htmlDoc = new StringBuilder();
        String temp;

        try (BufferedReader br
                     = new BufferedReader(new FileReader(path))) {

            while((temp = br.readLine())!=null) {
                htmlDoc.append(temp);
            }

        } catch (IOException fnf) {
            System.err.println("IOException");

            return null;
        }

        return htmlDoc;
    }
}
