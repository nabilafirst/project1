package id.sch.smktelkom_mlg.learn.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WebB3_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_b3_2);

        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebB3_2.this, WebB3_3.class);
                startActivity(intent);
            }
        });

    }
}
