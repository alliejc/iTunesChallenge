package com.alisonjc.ituneschallenge;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acaldwell on 5/21/18.
 */

public class TrackAdapter extends RecyclerView.Adapter<TrackViewHolder> {
    private List<Result> mList = new ArrayList<>();
    private Context mContext;

    public TrackAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public TrackViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.item_track, parent, false);
        return new TrackViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TrackViewHolder holder, int position) {
        Result result = mList.get(holder.getAdapterPosition());
        holder.onBind(result);
    }

    @Override
    public int getItemCount() {
        if(mList.size() < 0){
            return 0;
        } else {
            return mList.size();
        }
    }

    public void updateAdapter(List<Result> list){
        mList = list;
        notifyDataSetChanged();
    }
}
