package com.chelix.redditreader.webservices.repository;

import com.chelix.redditreader.webservices.models.RedditResponse;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditTopsDataSource implements RedditTopsRepository {

    private Retrofit mRetrofit;

    @Inject
    public RedditTopsDataSource(Retrofit mRetrofit) {
        this.mRetrofit = mRetrofit;
    }


    @Override
    public Single<RedditResponse> getTopEntries() {
        return mRetrofit.create(RedditTopsService.class)
                .getTopEntries()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
