package io.github.tiagofrbarbosa.qrcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    ImageView img01, img02, img03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        img01 = (ImageView) findViewById(R.id.img01);
        img02 = (ImageView) findViewById(R.id.img02);
        img03 = (ImageView) findViewById(R.id.img03);

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(img01);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(img02);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(img03);
    }
}
