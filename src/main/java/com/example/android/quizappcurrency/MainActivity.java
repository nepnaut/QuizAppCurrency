package com.example.android.quizappcurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quizappcurrency.R;

public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Score button is clicked.
     */
    public void finalResult(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Called question checking methods.
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();

        //Toast - Shows player name and score
        Toast.makeText(this, "Name: " + name +"\nScore: " + score +" of 6", Toast.LENGTH_SHORT).show();

        // Resets the variable score (The number of correct answers) to 0.
        score=0;
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score +=1;
        return score;
    }

    /**
     * This method counter correct answers in question 1
     * "Which countries use the euro as a currency? (There may be more accurate answers."
     */
    public void question_1() {
        //Figure out if the user chose "France" answer
        CheckBox Answer11CheckBox = (CheckBox) findViewById(R.id.answer_1_1_checkbox);
        boolean hasAnswer11 = Answer11CheckBox.isChecked();

        //Figure out if the user chose "Finland" answer
        CheckBox Answer13CheckBox = (CheckBox) findViewById(R.id.answer_1_3_checkbox);
        boolean hasAnswer13 = Answer13CheckBox.isChecked();

        if (hasAnswer11 && hasAnswer13) {
            increment_score();
            increment_score();
        } else if (hasAnswer11 || hasAnswer13){
            increment_score();
        }  else {
            score=0;
        }
    }

    /**
     * This method counter correct answers in question 2
     * "Which currency is used in China?"
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_4_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     * "Which currency is used in USA?"
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_3_3_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_3_3_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_3_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_3_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_3_4_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * "Which currency is used in Botswana?"
     */
    public void question_4() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_4);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_4_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_3_3_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_4_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_4_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_4_4_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 5
     * "Which currency is used in Mexico?"
     */
    public void question_5() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_5);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_5_3_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_5_3_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_5_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_5_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_5_4_radiobutton);
        }
    }
}

