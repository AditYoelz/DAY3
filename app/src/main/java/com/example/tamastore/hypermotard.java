package com.example.tamastore;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class hypermotard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypermotard);

        Button shareButton = findViewById(R.id.shr);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareDescription();
            }
        });

        Button checkoutButton = findViewById(R.id.checkout);
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCheckoutButtonClick(v);
            }
        });
    }

    private void shareDescription() {
        ImageView imageView = findViewById(R.id.v4s);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);

        BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();

        String description = descriptionTextView.getText().toString();

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Title", null);
        Uri imageUri = Uri.parse(path);

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        shareIntent.putExtra(Intent.EXTRA_TEXT, description);
        startActivity(Intent.createChooser(shareIntent, "Share Ke"));
    }

    public void onCheckoutButtonClick(View view) {
        Toast.makeText(this, "Mohon Periksa Saldo Anda, Kalau mau beli Langsung ke Website saja", Toast.LENGTH_SHORT).show();
    }
}
