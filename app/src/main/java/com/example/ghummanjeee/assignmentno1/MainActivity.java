package com.example.ghummanjeee.assignmentno1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView rs;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnpLus, btnmius, btneql, btndide, btnratio, btnpercent, btnMupt,btnclr;
    EditText showResult;
    String mValueone,mValueTwo;
    boolean mAddation,mMP,mDivide,mPercentage,mRatio,mMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    private void Init() {
        btn0 = (Button) findViewById(R.id.btnzero);
        btn1 = (Button) findViewById(R.id.btnone);
        btn2 = (Button) findViewById(R.id.btntwo);
        btn3 = (Button) findViewById(R.id.btnthre);
        btn4 = (Button) findViewById(R.id.btnfour);
        btn5 = (Button) findViewById(R.id.btnfive);
        btn6 = (Button) findViewById(R.id.btnsix);
        btn7 = (Button) findViewById(R.id.btnSeven);
        btn8 = (Button) findViewById(R.id.btneight);
        btn9 = (Button) findViewById(R.id.btnninw);
        btnpLus = (Button) findViewById(R.id.btnplus);
        btnMupt = (Button) findViewById(R.id.btnMultiply);
        btnmius = (Button) findViewById(R.id.btnSubtract);
        btneql = (Button) findViewById(R.id.btneq);
        btndide = (Button) findViewById(R.id.btnDivide);
        btnratio = (Button) findViewById(R.id.btnrt);
        btnpercent = (Button) findViewById(R.id.btnPercent);
        btnclr = (Button) findViewById(R.id.btAc);
        showResult = (EditText) findViewById(R.id.edt);
        //  rs = (TextView) findViewById(R.id.txtvw);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnpLus.setOnClickListener(this);
        btnpercent.setOnClickListener(this);
        btnmius.setOnClickListener(this);
        btndide.setOnClickListener(this);
        btneql.setOnClickListener(this);
        btnratio.setOnClickListener(this);
        btnMupt.setOnClickListener(this);
        btnclr.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnone:
                showResult.setText(showResult.getText()+"1");
                break;
            case R.id.btntwo:
                showResult.setText(showResult.getText()+"2");
                break;
            case R.id.btnthre:
                showResult.setText(showResult.getText()+"3");
                break;
            case R.id.btnfour:
                showResult.setText(showResult.getText()+"4");
                break;
            case R.id.btnfive:
                showResult.setText(showResult.getText()+"5");
                break;
            case R.id.btnsix:
                showResult.setText(showResult.getText()+"6");
                break;
            case R.id.btnSeven:
                showResult.setText(showResult.getText()+"7");
                break;
            case R.id.btneight:
                showResult.setText(showResult.getText()+"8");
                break;
            case R.id.btnninw:
                showResult.setText(showResult.getText()+"9");
                break;
            case R.id.btnzero:
                showResult.setText(showResult.getText()+"0");
                break;
            case R.id.btneq:
                mValueTwo=showResult.getText().toString();
                if(mAddation==true){
                    float Result=Float.parseFloat(mValueone)+Float.parseFloat(mValueTwo);
                    mAddation=false;
                    showResult.setText(Result+"");
                }
                if(mMinus==true){
                    float Result=Float.parseFloat(mValueone)-Float.parseFloat(mValueTwo);
                    mMinus=false;
                    showResult.setText(Result+"");
                }
                if(mDivide==true){
                    float Result=Float.parseFloat(mValueone)/Float.parseFloat(mValueTwo);
                    mDivide=false;
                    showResult.setText(Result+"");
                }
                if(mMP==true){
                    float Result=Float.parseFloat(mValueone)*Float.parseFloat(mValueTwo);
                    mDivide=false;
                    showResult.setText(Result+"");
                }

                break;
            case R.id.btnPercent:
                mValueone=showResult.getText().toString();
                break;
            case R.id.btnrt:
                showResult.append(".");

                break;
            case R.id.btnplus:
                mValueone=showResult.getText().toString();
                mAddation=true;
                break;
            case R.id.btnSubtract:
                mValueone=showResult.getText().toString();
                mMinus=true;
                break;
            case R.id.btnMultiply:
                mValueone=showResult.getText().toString();
                mMP=true;
                break;
            case R.id.btnDivide:
                mValueone=showResult.getText().toString();

                mDivide=true;
                break;
            case R.id.btAc:
                showResult.setText("");
                break;

        }
    }
}
