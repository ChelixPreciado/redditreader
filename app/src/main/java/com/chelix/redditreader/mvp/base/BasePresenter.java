package com.chelix.redditreader.mvp.base;

/**
 * Base class to extend if you're creating a Presenter.
 * <p>
 * It takes care of attaching and detaching the view.
 */

public abstract class BasePresenter<T extends MvpContract.View> implements MvpContract.Presenter<T> {

    /**
     * The View linked to this Presenter
     */

    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
