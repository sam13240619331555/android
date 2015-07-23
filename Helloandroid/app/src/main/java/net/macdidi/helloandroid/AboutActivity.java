package net.macdidi.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


public class AboutActivity extends Activity {    //extend 要記得改

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隱去電池等圖示和一切修飾部分（狀態列部分）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about);
    }
    public void clickOk(View view) {
        // 呼叫這個方法結束Activity元件
        finish();
    }

}
