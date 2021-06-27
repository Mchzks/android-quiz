package com.example.quizgame;

public class Questions {

    public String myQuestions [] = {
            "Which is the latest version of Android?",
            "Which version is the most widely used?",
            "From which version did the ART became the default runtime?"
    };

    public String myChoices [][] = {
            {"Lollipop","Android 11","Pie","Froyo"},
            {"Lollipop","Android 11","Pie","Froyo"},
            {"Lollipop","Android 11","Pie","Froyo"}
    };

    public String correctAnswer [] = {"Android 11","Pie","Lollipop"};

    public String getQuestion(int a) {
        String question = myQuestions[a];
        return question;
    };

    public String getChoice1(int a) {
        String choice = myChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = myChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = myChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = myChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswer[a];
        return answer;
    };

}
