package com.kun.statusbartest;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window window = getWindow();
//            // Translucent status bar
//            window.setFlags(
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image= (ImageView) findViewById(R.id.image);

    }
    int i=0;
    public void click(View view) {
        if(i%2==0){
            image.setImageResource(R.drawable.title_bar_nav_bg_incognito_pad);
        }else {
            image.setImageResource(R.drawable.title_bar_nav_bg_pad);
        }
        i++;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
