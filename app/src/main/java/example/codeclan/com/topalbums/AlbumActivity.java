package example.codeclan.com.topalbums;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import static example.codeclan.com.topalbums.R.id.list_view;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Intent intent = getIntent();
        Album album = (Album)intent.getSerializableExtra("album");
        Log.d("AlbumActivity: ", album.getTitle());

        AlbumCoverAdapter albumCoverAdapter = new AlbumCoverAdapter(this, album);

//        ListView listView = findViewById(list_view);
//        listView.setAdapter(albumCoverAdapter);

    }
}
