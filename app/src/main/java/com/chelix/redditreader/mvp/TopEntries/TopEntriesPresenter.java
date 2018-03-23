package com.chelix.redditreader.mvp.TopEntries;

import com.chelix.redditreader.mvp.base.BasePresenter;
import com.chelix.redditreader.webservices.models.RedditResponse;
import com.chelix.redditreader.webservices.repository.RedditTopsRepository;

import javax.inject.Inject;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class TopEntriesPresenter extends BasePresenter<TopEntriesContract.View> implements TopEntriesContract.Presenter {

    private RedditTopsRepository repository;

    @Inject
    public TopEntriesPresenter(RedditTopsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void getTopEntries() {
        repository.getTopEntries();
    }

    private SingleObserver<RedditResponse> processResponse() {
        return  new SingleObserver<RedditResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(RedditResponse redditResponse) {
                mView.showSuccess(redditResponse);
            }

            @Override
            public void onError(Throwable e) {
                mView.showWSError();
            }
        };
    }
}
