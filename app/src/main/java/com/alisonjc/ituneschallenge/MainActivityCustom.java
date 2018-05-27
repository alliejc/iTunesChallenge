package com.alisonjc.ituneschallenge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by acaldwell on 5/27/18.
 */

public class MainActivityCustom extends AppCompatActivity{
    boolean hasAvatar = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom);
        final CustomView view = new CustomView(this, null);
        view.onBind(hasAvatar);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.isSelected();
            }
        });

    }


}
