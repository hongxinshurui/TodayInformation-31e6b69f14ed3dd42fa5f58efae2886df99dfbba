package com.huiqu.app_two.mvp.base;

import android.content.Intent;
import android.os.Bundle;

import com.huiqu.app_two.mvp.IMvpView;
import com.huiqu.app_two.mvp.presenter.LifeCircleMvpPresenter;

public abstract class BaseMvpPresenter<T extends IMvpView> extends LifeCircleMvpPresenter<T> {
    public BaseMvpPresenter(T iMvpView) {
        super(iMvpView);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void destroyView() {

    }

    @Override
    public void onViewDestroy() {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {

    }
}
