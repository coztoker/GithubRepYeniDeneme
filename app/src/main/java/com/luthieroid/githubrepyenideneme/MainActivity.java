package com.luthieroid.githubrepyenideneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Degisiklik yaptiginda MainActivity dosyasinin sol paneldeki rengi mavi oldu:
    //Mavi => Kodda yaptigin bazi degisiklikler oldu ve bunlari Github'a henuz gondermedin!!

    private void TestUpload()
    {
        int i = 1+1;

        int ii = 2+2;

        int iii = i + ii;
    }

}
