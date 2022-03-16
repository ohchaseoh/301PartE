package com.example.a301parte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.textView3);

        //Test button
        Button tButton = (Button) findViewById(R.id.testbutton);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //clears text
                editText.setText("");

                GameState firstInstance = new GameState();
                //needs: copied by deep constructor, call each method and
                //print results to screen
                GameState firstCopy = new GameState(firstInstance);
                //needs: copied by deep constructor, call each method and
                //print results to screen

                //call for toString
                editText.append(firstInstance.toString());
                //call for isWin
                if(firstInstance.isWin()){
                    editText.append("A player has won the game");
                }else{
                    editText.append("No player has won the game");
                }
                //Call for drawTile
                if(firstInstance.getCurr_turn() == 0){
                    firstInstance.drawTile();
                    editText.append("Player 0 has drawn a tile");
                }
                else if(firstInstance.getCurr_turn() == 1) {
                    firstInstance.drawTile();
                    firstInstance.changeTurn();
                }

                //Instantiation of secondInstance and secondCopy
                GameState secondInstance = new GameState();
                GameState secondCopy = new GameState(secondInstance);
                //prints to system
                firstCopy.toString();
                secondCopy.toString();
                //
                editText.append(firstCopy.toString());
                editText.append(secondCopy.toString());




            }
        });

    }
}