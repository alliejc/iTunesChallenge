package com.alisonjc.ituneschallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TrackAdapter mAdapter;
    private TrackInterface mTrackInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpRecyclerView();
    }

    private void setUpRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        mAdapter = new TrackAdapter(this);
        recyclerView.setAdapter(mAdapter);
        getTracks();
    }

    private void getTracks(){
        String mUrl = "https://itunes.apple.com/";

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        mTrackInterface = retrofit.create(TrackInterface.class);
        Call call = getTracksCall();
         call.enqueue(new Callback<Track>() {
            @Override
            public void onResponse(Call<Track> call, Response<Track> response) {
                List<Result> list = response.body().getResults();
                Log.e("MainActivity", String.valueOf(response.body()));

                if(response.isSuccessful()) {
                    Log.e("MainActivity", String.valueOf(response.body()));
                    mAdapter.updateAdapter(response.body().getResults());
                } else {
                    Log.e("not successful", response.message());

                }

            }

            @Override
            public void onFailure(Call<Track> call, Throwable t) {
                Log.e("t", t.getLocalizedMessage());
                Log.e("MainActivity", t.getMessage());
            }
        });
    }


    public Call<Track> getTracksCall(){
        return mTrackInterface.getTracks();
    }
}
