//package com.alisonjc.myapplication;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
///**
// * Created by acaldwell on 5/21/18.
// */
//
//public class TrackClient {
//    public TrackClient mTrackClient;
//    private TrackInterface mTrackInterface;
//    private String mUrl = "https://itunes.apple.com/";
//
//  public TrackClient getInstance(){
//      if(mTrackClient != null){
//          return mTrackClient;
//      } else {
//          mTrackClient = new TrackClient();
//          return mTrackClient;
//      }
//  }
//
//    public TrackClient() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(mUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        mTrackInterface = retrofit.create(TrackInterface.class);
//    }
//
//}
