package com.huiqu.app_two;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.huiqu.app_two.mvp.ISplashActivityContract;
import com.huiqu.app_two.mvp.SplashTimerPresenter;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@ViewInject(mainlayoutid = R.layout.activity_splash)
public class SplashActivity extends BaseActivity implements ISplashActivityContract.Iview{

    @BindView(R.id.vv_play)
    FullScreenVideoView mVideoView;
    @BindView(R.id.tv_splash_timer)
    TextView mTvTimer;

    private ISplashActivityContract.IPresenter timerPresenter;



    @Override
    public void afterViewBind() {
        initTimerPresenter();
        initListener();
        initVideo();
    }

    private void initVideo() {
        mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + File.separator + R.raw.splash));
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
    }

    private void initListener() {
        mTvTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });
    }
    private void initTimerPresenter() {
        timerPresenter = new SplashTimerPresenter(this);
        timerPresenter.initTimer();

    }

    @OnClick({R.id.vv_play, R.id.tv_splash_timer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.vv_play:
                break;
            case R.id.tv_splash_timer:
                break;
        }
    }

    @Override
    public void setTvTimer(String timer) {
            mTvTimer.setText(timer);
    }
}
