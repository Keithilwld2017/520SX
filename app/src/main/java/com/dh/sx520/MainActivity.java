package com.dh.sx520;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn_feature_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewInit();
    }


    private void viewInit(){
        btn_feature_1 = findViewById(R.id.btn_feature1);
    }


    /**
     * feature-1
     * display HelloWorld
     * @param view view
     */
    public void feature1(View view){
        if (btn_feature_1.getText().toString().equals("功能1")){
            btn_feature_1.setText(R.string.feature_1_dis);
        }else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }
}
