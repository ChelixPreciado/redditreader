package com.chelix.redditreader.webservices;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chelix.redditreader.mvp.base.MvpContract;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.AndroidInjection;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public abstract class BaseActivity<T extends MvpContract.Presenter> extends AppCompatActivity implements MvpContract.View {

    private Unbinder unbinder;

    @Inject
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        if (this.presenter != null) {
            this.presenter.attachView(this);
        }
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (unbinder != null) {
            unbinder.unbind();
        }

        if (this.presenter != null) {
            this.presenter.detachView();
        }
        this.presenter = null;
    }
}
