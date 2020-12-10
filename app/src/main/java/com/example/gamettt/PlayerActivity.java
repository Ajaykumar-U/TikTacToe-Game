package com.example.gamettt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity{

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView tvResult;
    EditText etPlayerOne,etPlayerTwo;
    boolean num=true;
    int arr[][]={{9,9,9},{9,9,9},{9,9,9}};
    static int sum;
    String playerOne,playerTwo;
    boolean btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;

    int p1=0,p2=0;
    TextView player1WonTimes,player2WonTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        tvResult=findViewById(R.id.res);
        player1WonTimes = findViewById(R.id.tvPlayerOneGame);
        player2WonTimes = findViewById(R.id.tvPlayerTwoGame);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        button1();
        button2();
        button3();
        button4();
        button5();
        button6();
        button7();
        button8();
        button9();
    }

    /**
     * <p>Show the result as who won the game</p>
     */
    void resultOn(){
        playerOne = "Player 1 won the game";
        playerTwo = "Player 2 won the game";
        int arrSize=3;
        sum=0;
        //All button clicked
        boolean aC =  allClicked();
        if(aC==true){
            tvResult.setText("Draw Game");
            onResetGame();
        }
        //Step 1
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if(i==j) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn1.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn1.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step2
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if(i+j==arrSize-1) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn3.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn3.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step3
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn1.setTextColor(0xFF00FF00);
            btn2.setTextColor(0xFF00FF00);
            btn3.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn1.setTextColor(0xFF00FF00);
            btn2.setTextColor(0xFF00FF00);
            btn3.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step4
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==1) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn4.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn4.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step5
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==2) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn7.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn7.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step6
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==0) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn1.setTextColor(0xFF00FF00);
            btn4.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn1.setTextColor(0xFF00FF00);
            btn4.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step7
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==1) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn2.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn2.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            onResetGame();
        }
        sum=0;

        //step8
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==2) {
                    sum +=arr[i][j];
                }
            }
        }
        if(sum==3) {
            tvResult.setText(playerOne);
            ++p1;
            player1WonTimes.setText("Player1 Points : "+p1);
            btn3.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
        else if(sum==0) {
            tvResult.setText(playerTwo);
            ++p2;
            player2WonTimes.setText("Player2 Points : "+p2);
            btn3.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            onResetGame();
        }
    }

    boolean allClicked(){
        boolean aC=true;
        if(btnOne==true){
            aC=true;
        }
        else {
            return false;
        }
        if(btnTwo==true){
            aC=true;
        }
        else {
            return false;
        }
        if(btnThree==true){
            aC=true;
        }else {
            return false;
        }
        if(btnFour==true){
            aC=true;
        }else {
            return false;
        }
        if(btnFive==true){
            aC=true;
        }else {
            return false;
        }
        if(btnSix==true){
            aC=true;
        }else {
            return false;
        }
        if(btnSeven==true){
            aC=true;
        }else {
            return false;
        }
        if(btnEight==true){
            aC=true;
        }else {
            return false;
        }
        if(btnNine==true){
            aC=true;
        }else {
            return false;
        }
        return true;
    }

    /**
     * <p>Reset Game after the winner decides</p>
     */
    public void onResetGame() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("?");
                btn2.setText("?");
                btn3.setText("?");
                btn4.setText("?");
                btn5.setText("?");
                btn6.setText("?");
                btn7.setText("?");
                btn8.setText("?");
                btn9.setText("?");
                btn1.setTextColor(0xffcc0000);
                btn2.setTextColor(0xffcc0000);
                btn3.setTextColor(0xffcc0000);
                btn4.setTextColor(0xffcc0000);
                btn5.setTextColor(0xffcc0000);
                btn6.setTextColor(0xffcc0000);
                btn7.setTextColor(0xffcc0000);
                btn8.setTextColor(0xffcc0000);
                btn9.setTextColor(0xffcc0000);
                for (int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        arr[i][j]=9;
                    }
                }
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);
                btnOne=false;
                btnTwo=false;
                btnThree=false;
                btnFour=false;
                btnFive=false;
                btnSix=false;
                btnSeven=false;
                btnEight=false;
                btnNine=false;
            }
        }, 300);
    }

    void button1(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn1.setText("P1");
                    arr[0][0]=1;
                    btn1.setClickable(false);
                    btnOne=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn1.setText("P2");
                    arr[0][0]=0;
                    btn1.setClickable(false);
                    btnOne=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button2(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn2.setText("P1");
                    arr[0][1]=1;
                    btn2.setClickable(false);
                    btnTwo=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn2.setText("P2");
                    arr[0][1]=0;
                    btn2.setClickable(false);
                    btnTwo=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button3(){
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn3.setText("P1");
                    arr[0][2]=1;
                    btn3.setClickable(false);
                    btnThree=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn3.setText("P2");
                    arr[0][2]=0;
                    btn3.setClickable(false);
                    btnThree=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button4(){
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn4.setText("P1");
                    arr[1][0]=1;
                    btn4.setClickable(false);
                    btnFour=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn4.setText("P2");
                    arr[1][0]=0;
                    btn4.setClickable(false);
                    btnFour=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button5(){
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn5.setText("P1");
                    arr[1][1]=1;
                    btn5.setClickable(false);
                    btnFive=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn5.setText("P2");
                    arr[1][1]=0;
                    btn5.setClickable(false);
                    btnFive=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button6(){
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn6.setText("P1");
                    arr[1][2]=1;
                    btn6.setClickable(false);
                    btnSix=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn6.setText("P2");
                    arr[1][2]=0;
                    btn6.setClickable(false);
                    btnSix=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button7(){
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn7.setText("P1");
                    arr[2][0]=1;
                    btn7.setClickable(false);
                    btnSeven=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn7.setText("P2");
                    arr[2][0]=0;
                    btn7.setClickable(false);
                    btnSeven=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button8(){
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn8.setText("P1");
                    arr[2][1]=1;
                    btn8.setClickable(false);
                    btnEight=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn8.setText("P2");
                    arr[2][1]=0;
                    btn8.setClickable(false);
                    btnEight=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    void button9(){
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                if(num==true){
                    btn9.setText("P1");
                    arr[2][2]=1;
                    btn9.setClickable(false);
                    btnNine=true;
                    resultOn();
                    num=false;
                }
                else if(num==false){
                    btn9.setText("P2");
                    arr[2][2]=0;
                    btn9.setClickable(false);
                    btnNine=true;
                    resultOn();
                    num=true;
                }
                else{
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}