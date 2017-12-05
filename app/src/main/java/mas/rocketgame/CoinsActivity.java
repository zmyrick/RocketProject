package mas.rocketgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class CoinsActivity extends AppCompatActivity {

    TextView displayQuestion;
    Button buttonTrue, buttonFalse, buttonA, buttonB, buttonC, buttonD;
    Questions myQuestions;

    ArrayList<Item> questionsList;

    int questionsLength;
    int currentQuestion = 0;
    boolean winner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coins);
        setTheme(android.R.style.Theme_Material_NoActionBar);
        setTheme(android.R.style.Theme_Material_NoActionBar);

        //int stuff
        displayQuestion = (TextView) findViewById(R.id.displayQuestion);

        buttonTrue = (Button) findViewById(R.id.trueButton);
        buttonFalse = (Button) findViewById(R.id.falseButton);
//        buttonA = (Button) findViewById(R.id.aButton);
//        buttonB = (Button) findViewById(R.id.bButton);
//        buttonC = (Button) findViewById(R.id.cButton);
//        buttonD = (Button) findViewById(R.id.dButton);

        myQuestions = new Questions();
        questionsLength = myQuestions.myQuestions.length;

        questionsList = new ArrayList<>();


        for(int i = 0; i < questionsLength; i++)
        {
            questionsList.add(new Item(myQuestions.getQuestion(i), myQuestions.getAnswer(i)));
        }

        //shuffle the questions
        Collections.shuffle(questionsList);

        //start the game
        setQuestion(currentQuestion);


        buttonTrue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(checkQuestion(currentQuestion))
                {
                    currentQuestion++;


                    if(currentQuestion < questionsLength) {

                        setQuestion(currentQuestion);
                        winner = true;
                        toastDisplay();

                    } else{

                        //TODO: code to execute once user has answered all of the questions
                    }
                }
                else
                {
                    toastDisplay();
                }

            }
        });



        buttonFalse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!checkQuestion(currentQuestion)){

                    currentQuestion++;
                    if(currentQuestion < questionsLength) {
                        setQuestion(currentQuestion);
                        winner = true;
                        toastDisplay();
                    }
                    else{
                        //TODO: code to execute once user has answered all of the questions

                    }
                }else
                {
                    toastDisplay();
                }
            }
        });




//        buttonA.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//            }
//        });
//
//        buttonB.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//            }
//        });
//
//        buttonC.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//            }
//        });
//
//        buttonD.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//            }
//        });
//
    }
//
//    //show question on the screen
    private void setQuestion(int number){
    displayQuestion.setText(questionsList.get(number).getQuestion());
    winner = false;
    }
//
//
//    //check if the answer is right
    private boolean checkQuestion(int number){
        String answer = questionsList.get(number).getAnswer();
        return answer.equals("true");
    }
//
    //display whether user got correct or incorrect
    private void toastDisplay(){
        if(winner)
        {
            Toast.makeText(this, "Congratulations! You've earned +5 coins", Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(this, "Sorry, that is incorrect.", Toast.LENGTH_SHORT).show();
        }
    }

}
