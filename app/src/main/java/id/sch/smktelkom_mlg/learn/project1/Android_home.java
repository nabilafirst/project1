package id.sch.smktelkom_mlg.learn.project1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Android_home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_home);

        findViewById(R.id.imageViewBasic1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Android_home.this, AndroidB1_1.class);
                startActivity(intent);

            }
        });
    }
}
