package example.codeclan.com.topalbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_album);

        ArrayList<Album> topAlbums = new TopAlbums().getList();

//        ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<Movie>(this, R.layout.title, topMovies.getList());

        TopAlbumsAdapter albumsAdapter = new TopAlbumsAdapter(this, topAlbums);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(albumsAdapter);

    }
}
