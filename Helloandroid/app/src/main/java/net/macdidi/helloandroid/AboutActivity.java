package net.macdidi.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


public class AboutActivity extends Activity {    //extend �n�O�o��

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //���h�q�����ϥܩM�@���׹������]���A�C�����^
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about);
    }
    public void clickOk(View view) {
        // �I�s�o�Ӥ�k����Activity����
        finish();
    }

}
