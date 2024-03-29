package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MAX = 100;
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.askQuestions("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int a = Utils.getRandomNumber(MAX);
        int b = Utils.getRandomNumber(MAX);
        int correctAnswer = calculateGcd(a, b);
        questionAndAnswer[0] = a + " " + b;
        questionAndAnswer[1] = String.valueOf(correctAnswer);
        return questionAndAnswer;
    }

    public static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGcd(b, a % b);
    }
}
