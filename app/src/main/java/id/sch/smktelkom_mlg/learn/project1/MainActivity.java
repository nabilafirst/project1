package id.sch.smktelkom_mlg.learn.project1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] listArray = {"Android", "Dekstop", "Web", "Java"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Apa yang ingin kamu pelajari?");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_materi, listArray);
        ListView listview = (ListView) findViewById(R.id.listViewMateri);
        listview.setAdapter(adapter);
    }
}