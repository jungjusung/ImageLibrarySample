package com.example.android.imagelibrarysample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView glideImage;
    ImageView picassoImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        glideImage = (ImageView) findViewById(R.id.iv_glide);
        picassoImage = (ImageView) findViewById(R.id.iv_picasso);
        String Url = "http://platum.kr/wp-content/uploads/2016/12/15094929_418158311905755_4216989854352981261_n-700x315.jpg";
        Picasso.with(context).load(Url).into(picassoImage);
        Glide.with(context).load(Url).into(glideImage);
        /*Picasso.with(context)
                .load(Url)
                .resize(300,200)
                .centerCrop()
                .error(R.mipmap.ic_launcher)
                .into(picassoImage);
        */
        //resize() : 크기를 재정의 해준다.
        //centerCrop() : 이미지의 가운데를 크롭해준다
        //error() : 에러 발생시 다음의 이미지를 나타나게 한다.


        /*Glide.with(context)
                .load(Url)
                .override(300,200)
                .error(R.mipmap.ic_launcher)
                .animate(R.anim.fadein)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(glideImage);
        */
        //override() : 크기를 재정의 해준다.
        //error() : 에러 발생시 다음의 이미지를 나타나게 한다.
        //animate() : 이미지에 애니메이션 효과를 준다.
        //애니메이터 사용은 지양되고 있고, Anim폴더에 있는 xml파일로 제어하는것을 지향한다.
        //diskCacheStrategy(DiskCacheStrategy.ALL) : Glide는 변경된 이미지의 크기를 캐싱하는데,
        //이를 기존의 이미지를 캐싱하도록 해주는 설정이다.
    }
}
