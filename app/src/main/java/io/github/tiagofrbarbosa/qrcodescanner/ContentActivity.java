package io.github.tiagofrbarbosa.qrcodescanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {

    ImageView imgPhotos, imgVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        imgPhotos = (ImageView) findViewById(R.id.imgPhoto);
        imgVideos = (ImageView) findViewById(R.id.imgVideo);

        imgPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplication().getBaseContext(),"Photos",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplication().getBaseContext(),ImageActivity.class));
            }
        });

        imgVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplication().getBaseContext(),"Videos",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplication().getBaseContext(),SelectVideoActivity.class));
            }
        });
    }
}
