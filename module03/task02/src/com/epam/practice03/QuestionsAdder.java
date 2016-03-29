package com.epam.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by vrama on 25.03.2016.
 */
public class QuestionsAdder {

    private String langPref;
    private Locale engLocale = new Locale("en", "EN");
    private ResourceBundle engBundle = ResourceBundle.getBundle("QuestionsBundle", engLocale);

    private Locale frLocale = new Locale("fr", "FR");
    private ResourceBundle frBundle = ResourceBundle.getBundle("QuestionsBundle", frLocale);

    private Locale ruLocale = new Locale("ru", "RU");
    private ResourceBundle ruBundle = ResourceBundle.getBundle("QuestionsBundle", ruLocale);


    public void getQuestions(String localization) {

        this.langPref = localization;

        switch (localization) {
            case "eng":  {
                System.out.println("1." + engBundle.getString("my.question1"));
                System.out.println("2." + engBundle.getString("my.question2"));
                System.out.println("3." + engBundle.getString("my.question3")+ "\n");
                break;
            }

            case "fr": {
                System.out.println("1." + frBundle.getString("my.question1"));
                System.out.println("2." + frBundle.getString("my.question2"));
                System.out.println("3." + frBundle.getString("my.question3")+ "\n");
                break;
            }

            case "ru": {
                System.out.println("1." + ruBundle.getString("my.question1"));
                System.out.println("2." + ruBundle.getString("my.question2"));
                System.out.println("3." + ruBundle.getString("my.question3")+ "\n");
                break;
            }

            default: {
                System.out.println("1." + engBundle.getString("my.question1"));
                System.out.println("2." + engBundle.getString("my.question2"));
                System.out.println("3." + engBundle.getString("my.question3")+ "\n");
                break;
            }

        }

    }

    public void getAnswer(int numOfQuestion) {
        switch(langPref) {
            case "eng":  {
                ResourceBundle engAnswBundle = ResourceBundle.getBundle("AnswersBundle", engLocale);
                System.out.println(numOfQuestion + ". " + engAnswBundle.getString("my.answer" + numOfQuestion)+"\n");
                break;
            }

            case "fr": {
                ResourceBundle frAnswBundle = ResourceBundle.getBundle("AnswersBundle", frLocale);
                System.out.println(numOfQuestion + ". " + frAnswBundle.getString("my.answer" + numOfQuestion)+"\n");
                break;
            }

            case "ru": {
                ResourceBundle ruAnswBundle = ResourceBundle.getBundle("AnswersBundle", ruLocale);
                System.out.println(numOfQuestion + ". " + ruAnswBundle.getString("my.answer" + numOfQuestion) +"\n");
                break;
            }


            default: {
                ResourceBundle engAnswBundle = ResourceBundle.getBundle("AnswersBundle", engLocale);
                System.out.println(numOfQuestion + ". " + engAnswBundle.getString("my.answer" + numOfQuestion)+"\n");
                break;
            }
        }
    }

}
