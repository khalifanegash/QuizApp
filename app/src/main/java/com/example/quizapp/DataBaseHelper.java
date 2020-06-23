package com.example.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {


    private static final String QUESTION = "question";
    private static final String QUESTION_NAME = "QUESTION_NAME";
    private static final String ANSWERS = "ANSWERS";
    private static final String CORRECT_ANSWER = "CORRECT_ANSWER";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "Quiz.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTable = "CREATE TABLE  " + QUESTION + "  ( ID INTEGER PRIMARY KEY AUTOINCREMENT, " + QUESTION_NAME + " TEXT, " + ANSWERS + " TEXT, " + CORRECT_ANSWER + " TEXT ) ";

        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addQuestion(Question question) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(QUESTION_NAME, question.getQuestionName());
        contentValues.put(ANSWERS, question.getAnswers());
        contentValues.put(CORRECT_ANSWER, question.getRightAnswer());
        long insert = db.insert(QUESTION, null, contentValues);
        if (insert == -1) {
            return false;
        }

        return true;
    }

}
