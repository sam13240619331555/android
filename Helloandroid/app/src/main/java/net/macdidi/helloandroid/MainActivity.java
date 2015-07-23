
package net.macdidi.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private final String[]data= {
            "關於Android Tutorial的事情",
            "一隻非常可愛的小狗狗!",
            "一首非常好聽的音樂！"};
    private ArrayAdapter<String> adapter ;
    private ListView item_list;
    private TextView show_app_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        processViews();
        processControllers();
        int layoutId = android.R.layout.simple_list_item_1;
        adapter = new ArrayAdapter<String>(this, layoutId, data);
        item_list = (ListView) findViewById(R.id.item_list);
        item_list.setAdapter(adapter);
    }


    private void processViews() {
        item_list = (ListView)findViewById(R.id.item_list);
        //show_app_name = (TextView) findViewById(R.id.app_name);
    }
    private void processControllers() {
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this,
                        data[position], Toast.LENGTH_LONG).show();
            }
        };
        item_list.setOnItemClickListener(itemListener);

    }
    public void clickMenuItem(MenuItem item) {
        int itemId = item.getItemId();

        // 判斷該執行什麼工作，目前還沒有加入需要執行的工作
        switch (itemId) {
            case R.id.search_item:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    public void aboutApp(View view) {

        Intent intent = new Intent(this,  AboutActivity.class);
        startActivity(intent);
    }

}
