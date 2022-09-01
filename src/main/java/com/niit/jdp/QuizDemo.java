/*
 * Author Name : M.Krishna.
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class QuizDemo {
    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException

    public String highestScore(String[] nameOfSchool, String[] scores) {
        int MaxScore;
        try {
            MaxScore = Integer.parseInt(scores[0]);
            for (int index = 0; index < scores.length; index++) {
                if (Integer.parseInt(scores[index]) > MaxScore) {
                    MaxScore = index;
                }
            }
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
        return nameOfSchool[MaxScore];
    }

    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String[] name) {
        return new String[0];
    }
}








