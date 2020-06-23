package com.example.quizapp;

import java.util.Arrays;

public class Question {
    private int id;
    private String questionName;
    public byte[] answers;
    private String rightAnswer;

    public Question(int id, String questionName, byte[] answers, String rightAnswer) {
        this.id = id;
        this.questionName = questionName;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public byte[] getAnswers() {
        return answers;
    }

    public void setAnswers(byte[] answers) {
        this.answers = answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionName='" + questionName + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", rightAnswer='" + rightAnswer + '\'' +
                '}';
    }
}
