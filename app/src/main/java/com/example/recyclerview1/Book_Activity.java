package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtittle,tvdescription,tvCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtittle = findViewById(R.id.tvtittle_id);
        tvdescription = findViewById(R.id.tvdescription_id);
        tvCategory = findViewById(R.id.category);
        img = findViewById(R.id.bookthumbnail);


        //receives Data
        Intent intent = getIntent();
        String Tittle = intent.getExtras().getString("Tittle");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //setting values

        tvtittle.setText(Tittle);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}
