package id.sch.smktelkom_mlg.learn.project1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Web_home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_home);

        findViewById(R.id.imageViewBasic1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Web_home.this, WebB1_1.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewBasic2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Web_home.this, WebB2_1.class);
                startActivity(intent);

            }
        });

    }

}

