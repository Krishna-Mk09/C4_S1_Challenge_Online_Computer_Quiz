/*
 * Author Name : M.Krishna.
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package com.niit.jdp;

public class QuizDemo {
    /**
     * It takes an array of strings, and an array of integers, and returns the name of the school with the highest score
     *
     * @param nameOfSchool an array of strings containing the names of the schools
     * @param scores       an array of integers
     * @return The name of the school with the highest score.
     */
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

    public String[] convertAllNamesToCapital(String[] name) {
        return new String[0];
    }
}








