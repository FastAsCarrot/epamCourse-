package com.epam.practice03;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vrama on 30.03.2016.
 */
public class HTMLsearcherTest {

    HTMLsearcher htmLsearcher;

    @Test
    public void isImageConsistentTest() {

        StringBuilder htmlDoc = new StringBuilder();

        htmlDoc = HTMLtoStringBuilder.toStringBuilder("Java.SE.03.Information handling_task_attachment.html");


        htmLsearcher = new HTMLsearcher(htmlDoc);

        System.out.println("Author refers to images successively: " + htmLsearcher.isImagesConsistent());


    }
}
