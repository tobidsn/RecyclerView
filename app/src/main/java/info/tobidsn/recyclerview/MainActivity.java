package info.tobidsn.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(movieList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Movie movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Test: Test", "Action & Adventure", "2015");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }

}
