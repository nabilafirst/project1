package id.sch.smktelkom_mlg.learn.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroidB1_1 extends Activity {

    Button bA, bB, bC, bD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_b1_1);

        bA = (Button) findViewById(R.id.buttonA);
        bB = (Button) findViewById(R.id.buttonB);
        bC = (Button) findViewById(R.id.buttonC);
        bD = (Button) findViewById(R.id.buttonD);

        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidB1_1.this, AndroidB1_2.class);
                startActivity(intent);
            }
        });


    }
}
