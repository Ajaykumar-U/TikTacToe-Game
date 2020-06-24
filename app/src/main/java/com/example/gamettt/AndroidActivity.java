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

public class AndroidActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView tvResult;
    EditText etPlayerOne, etPlayerTwo;
    boolean btn1Clicked, btn2Clicked, btn3Clicked, btn4Clicked, btn5Clicked, btn6Clicked, btn7Clicked,
            btn8Clicked, btn9Clicked;
    boolean num = true;
    int arr[][] = {{9, 9, 9}, {9, 9, 9}, {9, 9, 9}};
    static int sum;
    String playerOne, playerTwo;
    boolean btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        tvResult = findViewById(R.id.res);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        etPlayerOne = findViewById(R.id.etPlayerOne);
        etPlayerTwo = findViewById(R.id.etPlayerTwo);

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
     * <p>To find the result as who won the game</p>
     */
    int resultOn() {
        int resPass = 0;
        playerOne = "Player won the game";
        playerTwo = "Android won the game";
        int arrSize = 3;
        sum = 0;
        //All button clicked
        boolean aC =  allClicked();
        if(aC==true){
            tvResult.setText("Draw Game");
            onResetGame();
        }
        //Step 1
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn1.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn1.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step2
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (i + j == arrSize - 1) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn3.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn3.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step3
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn1.setTextColor(0xFF00FF00);
            btn2.setTextColor(0xFF00FF00);
            btn3.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn1.setTextColor(0xFF00FF00);
            btn2.setTextColor(0xFF00FF00);
            btn3.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step4
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 1) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn4.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn4.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step5
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 2) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn7.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn7.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step6
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn1.setTextColor(0xFF00FF00);
            btn4.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn1.setTextColor(0xFF00FF00);
            btn4.setTextColor(0xFF00FF00);
            btn7.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step7
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 1) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn2.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn2.setTextColor(0xFF00FF00);
            btn5.setTextColor(0xFF00FF00);
            btn8.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        sum = 0;

        //step8
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 2) {
                    sum += arr[i][j];
                }
            }
        }
        if (sum == 3) {
            tvResult.setText(playerOne);
            btn3.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        } else if (sum == 0) {
            tvResult.setText(playerTwo);
            btn3.setTextColor(0xFF00FF00);
            btn6.setTextColor(0xFF00FF00);
            btn9.setTextColor(0xFF00FF00);
            resPass = 1;
            onResetGame();
        }
        return resPass;
    }

    /**
     * <p>Reseting the Game after the players won the game</p>
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
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr[i][j] = 9;
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
                num=true;
            }
        }, 1000);
    }

    boolean allClicked() {
        boolean aC = true;
        if (btnOne == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnTwo == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnThree == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnFour == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnFive == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnSix == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnSeven == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnEight == true) {
            aC = true;
        } else {
            return false;
        }
        if (btnNine == true) {
            aC = true;
        } else {
            return false;
        }
        return true;
    }

    /**
     * <p>onClick of button1: </p>
     */
    void button1() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn1.setText("X");
                arr[0][0] = 1;
                btn1Clicked = true;
                btnOne=true;
                btn1.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button2: </p>
     */
    void button2() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn2.setText("X");
                arr[0][1] = 1;
                btn2Clicked = true;
                btnTwo=true;
                btn2.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button3: </p>
     */
    void button3() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn3.setText("X");
                arr[0][2] = 1;
                btn3Clicked = true;
                btnThree=true;
                btn3.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button4: </p>
     */
    void button4() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn4.setText("X");
                arr[1][0] = 1;
                btn4Clicked = true;
                btnFour=true;
                btn4.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button5: </p>
     */
    void button5() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn5.setText("X");
                arr[1][1] = 1;
                btn5Clicked = true;
                btnFive=true;
                btn5.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button6: </p>
     */
    void button6() {
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn6.setText("X");
                arr[1][2] = 1;
                btn6Clicked = true;
                btnSix=true;
                btn6.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button7: </p>
     */
    void button7() {
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn7.setText("X");
                arr[2][0] = 1;
                btn7Clicked = true;
                btnSeven=true;
                btn7.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button8: </p>
     */
    void button8() {
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn8.setText("X");
                arr[2][1] = 1;
                btn8Clicked = true;
                btnEight=true;
                btn8.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>onClick of button9: </p>
     */
    void button9() {
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Result");
                btn9.setText("X");
                arr[2][2] = 1;
                btn9Clicked = true;
                btnNine=true;
                btn9.setClickable(false);
                int resPass = resultOn();
                if (resPass == 0) {
                    playerAndroid();
                }
            }
        });
    }

    /**
     * <p>Android playing the game</p>
     */
    void playerAndroid() {
        int r = (int) ( Math.random() * 9 ) + 1;
        num = false;
        if (r == 1) {
            if(btn1Clicked==true){
                playerAndroid();
            }
            else{
                btn1.setText("O");
                arr[0][0] = 0;
                btn1Clicked = true;
                btnOne=true;
                btn1.setClickable(false);
                resultOn();
            }
        } else if (r == 2) {
            if(btn2Clicked==true){
                playerAndroid();
            }
            else {
                btn2.setText("O");
                arr[0][1] = 0;
                btn2Clicked = true;
                btnTwo=true;
                btn2.setClickable(false);
                resultOn();
            }
        } else if (r == 3) {
            if(btn3Clicked==true){
                playerAndroid();
            }
            else {
                btn3.setText("O");
                arr[0][2] = 0;
                btn3Clicked = true;
                btnThree=true;
                btn3.setClickable(false);
                resultOn();
            }
        } else if (r == 4) {
            if(btn4Clicked==true){
                playerAndroid();
            }
            else {
                btn4.setText("O");
                arr[1][0] = 0;
                btn4Clicked = true;
                btnFour=true;
                btn4.setClickable(false);
                resultOn();
            }
        } else if (r == 5) {
            if(btn5Clicked==true){
                playerAndroid();
            }
            else {
                btn5.setText("O");
                arr[1][1] = 0;
                btn5Clicked = true;
                btnFive=true;
                btn5.setClickable(false);
                resultOn();
            }
        } else if (r == 6) {
            if(btn6Clicked==true){
                playerAndroid();
            }
            else {
                btn6.setText("O");
                arr[1][2] = 0;
                btn6Clicked = true;
                btnSix=true;
                btn6.setClickable(false);
                resultOn();
            }
        } else if (r == 7) {
            if(btn7Clicked==true){
                playerAndroid();
            }
            else {
                btn7.setText("O");
                arr[2][0] = 0;
                btn7Clicked = true;
                btnSeven=true;
                btn7.setClickable(false);
                resultOn();
            }
        } else if (r == 8) {
            if(btn8Clicked==true){
                playerAndroid();
            }
            else {
                btn8.setText("O");
                arr[2][1] = 0;
                btn8Clicked = true;
                btnEight=true;
                btn8.setClickable(false);
                resultOn();
            }
        } else if (r == 9) {
            if(btn9Clicked==true){
                playerAndroid();
            }
            else {
                btn9.setText("O");
                arr[2][2] = 0;
                btn9Clicked = true;
                btnNine=true;
                btn9.setClickable(false);
                resultOn();
            }
        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }
}