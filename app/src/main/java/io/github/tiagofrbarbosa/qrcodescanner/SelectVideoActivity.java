package io.github.tiagofrbarbosa.qrcodescanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectVideoActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_video);

        btn1 = (Button) findViewById(R.id.btn_video01);
        btn2 = (Button) findViewById(R.id.btn_video02);
        btn3 = (Button) findViewById(R.id.btn_video03);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplication().getBaseContext(),"video 01",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplication().getBaseContext(),VideoActivity.class);
                intent.putExtra("url", getString(R.string.media_url_02));
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplication().getBaseContext(),"video 02",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplication().getBaseContext(),VideoActivity.class);
                intent.putExtra("url", getString(R.string.media_url_03));
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplication().getBaseContext(),"video 02",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplication().getBaseContext(),VideoActivity.class);
                intent.putExtra("url", getString(R.string.media_url_01));
                startActivity(intent);
            }
        });
    }
}
