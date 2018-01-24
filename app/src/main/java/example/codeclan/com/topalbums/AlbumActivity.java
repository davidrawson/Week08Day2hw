package example.codeclan.com.topalbums;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Intent intent = getIntent();
        Album album = (Album)intent.getSerializableExtra("album");

        TextView artistView = findViewById(R.id.artist);
        artistView.setText(album.getArtist().toString());

        TextView titleView = findViewById(R.id.title);
        titleView.setText(album.getTitle().toString());

        ImageView imageView = findViewById(R.id.cover_art);
        imageView.setImageResource(album.getCoverArt());

    }
}
