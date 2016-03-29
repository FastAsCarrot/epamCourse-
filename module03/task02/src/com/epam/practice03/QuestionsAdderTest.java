package com.epam.practice03;

import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by vrama on 25.03.2016.
 */
public class QuestionsAdderTest {


    @Test
    public void getQuestionsTest() {
        QuestionsAdder qa = new QuestionsAdder();

        qa.getQuestions("ru");
        qa.getAnswer(1);

        qa.getQuestions("eng");
        qa.getAnswer(1);

        qa.getQuestions("fr");
        qa.getAnswer(1);
    }

}
