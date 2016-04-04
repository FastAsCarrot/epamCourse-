package com.epam.practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by vrama on 30.03.2016.
 */
public class HTMLsearcher {
    private Pattern pat;
    private Matcher match;
    private StringBuilder htmlDocument;

    HTMLsearcher(StringBuilder htmlDoc) {
        this.htmlDocument = htmlDoc;
    }

    public boolean isImagesConsistent() {
        pat = Pattern.compile("(р*Р*ис.\\s*[0-9]{1,3}(\\W[а-я])*)|(Р*р*исуно*к*(е|ах)\\s*(,[а-яА-Я])*[0-9]*)");
        match = pat.matcher(htmlDocument);
        String stringDigitCompar;
        List<Integer> valuesArray = new ArrayList<>();


        while(match.find()) {
            stringDigitCompar = match.group()+"  ";

            for (int i = 0; i < stringDigitCompar.length()-2; i++) {
                if(Character.isDigit(stringDigitCompar.charAt(i))) {

                    if(Character.isDigit(stringDigitCompar.charAt(i+1))) {
                        valuesArray.add(Integer.valueOf(stringDigitCompar.substring(i, i+2)));
                        i++;
                    } else {
                        valuesArray.add(Integer.valueOf(stringDigitCompar.substring(i, i+1)));
                    }

                }
            }

        }

        for (int i = 0; i < valuesArray.size() - 1; i++) {

            if ((valuesArray.get(i) != valuesArray.get(i+1) + 1) || (valuesArray.get(i) != valuesArray.get(i+1) - 1)) {
                return false;
            }

        }

        return true;
    }

    public void imageReferencesList() {

    }



}
