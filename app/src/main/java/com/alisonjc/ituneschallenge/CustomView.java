package com.alisonjc.ituneschallenge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by acaldwell on 5/27/18.
 */

public class CustomView extends FrameLayout implements View.OnClickListener {
    ImageView mAvatarImage;
    ImageView mInitialsImage;

    public CustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.custom_view, this);
        mAvatarImage = findViewById(R.id.avatar_image);
        mInitialsImage = findViewById(R.id.initials_image);
        setOnClickListener(this);
    }

    public void onBind(boolean hasAvatar){
        if(hasAvatar){
            mAvatarImage.setVisibility(View.VISIBLE);
            mInitialsImage.setVisibility(View.GONE);
        } else {
            mAvatarImage.setVisibility(View.GONE);
            mInitialsImage.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onClick(View v) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAvatarImage.getVisibility() == VISIBLE){
                    mAvatarImage.setVisibility(GONE);
                    mInitialsImage.setVisibility(VISIBLE);
                } else {
                    mAvatarImage.setVisibility(VISIBLE);
                    mInitialsImage.setVisibility(GONE);
                }
            }
        });
    }
}
