package com.dh.sx520;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn_feature_1;
    private Button btn_feature_2;
    private Button btn_feature_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewInit();
    }


    private void viewInit(){
        btn_feature_1 = findViewById(R.id.btn_feature1);
        btn_feature_2 = findViewById(R.id.btn_feature2);
        btn_feature_2 = findViewById(R.id.btn_feature3);
    }


    /**
     * feature-1
     * display HelloWorld
     * @param view view
     */
    public void feature1(View view){
        Log.i("MainActivity","feature1代码优化！");
        if (btn_feature_1.getText().toString().equals("功能1")){
            btn_feature_1.setText(R.string.feature_1_dis);
        }else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }

    /**
     * feature-2
     * display HelloWorld
     * @param view view
     */
    public void feature2(View view){
        if (btn_feature_2.getText().toString().equals("功能2")){
            btn_feature_2.setText(R.string.feature_2_dis);
        }else {
            btn_feature_2.setText(R.string.feature_2);
        }
    }
    /**
     * feature-3
     * display HelloWorld
     * @param view view
     */
    public void feature3(View view){
        if (btn_feature_3.getText().toString().equals("功能3")){
            btn_feature_3.setText(R.string.feature_3_dis);
        }else {
            btn_feature_3.setText(R.string.feature_3);
        }
    }

}
