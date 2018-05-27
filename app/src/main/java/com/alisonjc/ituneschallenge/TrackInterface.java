package com.alisonjc.ituneschallenge;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by acaldwell on 5/21/18.
 */

public interface TrackInterface {

    @GET("https://itunes.apple.com/")
    Call <Track> getTracks();
}
