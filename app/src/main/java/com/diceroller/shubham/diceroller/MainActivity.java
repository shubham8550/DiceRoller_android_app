package com.diceroller.shubham.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDicy1;
    private ImageView imageViewDicy2;
    private Random myrandomNumber1= new Random();
    private Random myrandomNumber2= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //imageViewDicy=findViewById(R.id.imageView);


    }




    public void Roller(View view){

        rollOurDice();
    }



    private void rollOurDice(){
        imageViewDicy1=findViewById(R.id.imageView1);
        imageViewDicy2=findViewById(R.id.imageView2);
        int myRanNumber1=myrandomNumber1.nextInt(6) + 1;


        switch (myRanNumber1){


            case 1:
                imageViewDicy1.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicy1.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicy1.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicy1.setImageResource(R.drawable.dice4);
                break;

            case 5:
                imageViewDicy1.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDicy1.setImageResource(R.drawable.dice6);
                break;
        }

        int myRanNumber2=myrandomNumber2.nextInt(6) + 1;
switch (myRanNumber2){


            case 1:
                imageViewDicy2.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicy2.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicy2.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicy2.setImageResource(R.drawable.dice4);
                break;

            case 5:
                imageViewDicy2.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDicy2.setImageResource(R.drawable.dice6);
                break;
        }

    }




}
