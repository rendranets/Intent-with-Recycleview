package com.dicoding.medicinal_plants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    public static final String ExtraImage = "extra_image";
    public static final String ExtraName = "extra_name";
    public static final String ExtraLatinName = "extra_latin_name";
    public static final String ExtraDescription = "extra_description";
    public static final String ExtraDescription2 = "extra_description2";
    public static final String ExtraLink = "extra_link";
    public String link;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ImageView tvImageReceived = findViewById(R.id.tv_image_description);

        int image_link = getIntent().getIntExtra(ExtraImage,0);
        tvImageReceived.setImageResource(image_link);

        TextView tvDescReceived = findViewById(R.id.tvDataDescription);
        TextView tvNameReceived = findViewById(R.id.tvDataName);
        TextView tvLatinNameReceived = findViewById(R.id.tvDataLatinName);

        String name = getIntent().getStringExtra(ExtraName);
        tvNameReceived.setText(name);

        String latin_name = getIntent().getStringExtra(ExtraLatinName);
        tvLatinNameReceived.setText(latin_name);

        String desc = getIntent().getStringExtra(ExtraDescription);
        String desc2 = getIntent().getStringExtra(ExtraDescription2);

         link = getIntent().getStringExtra(ExtraLink);

        String descrip ="Deskripsi : \n\n" + desc + ",\n\n" + desc2;
        tvDescReceived.setText(descrip);
}


    public void goToLink (View view) {
        goToUrl (link);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
