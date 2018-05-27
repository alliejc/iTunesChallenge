package com.alisonjc.ituneschallenge;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by acaldwell on 5/21/18.
 */

public class TrackViewHolder extends RecyclerView.ViewHolder {
    public TextView mArtist;

    public TrackViewHolder(View itemView) {
        super(itemView);
        mArtist = itemView.findViewById(R.id.artist_text);
    }

    public void onBind(Result result){
        mArtist.setText(result.getArtistName());
    }
}
