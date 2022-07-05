package jp.suntech.s21044.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView name=findViewById(R.id.name);
        name.setOnItemClickListener(new ListItemClickListener());


    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item=(String)parent.getItemAtPosition(position);
            TextView country=findViewById(R.id.select);
            country.setText(item);
        }
    }
}