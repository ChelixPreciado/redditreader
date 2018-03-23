package com.chelix.redditreader.mvp.TopEntries;

import com.chelix.redditreader.mvp.base.MvpContract;
import com.chelix.redditreader.webservices.models.RedditResponse;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public interface TopEntriesContract {

    interface View extends MvpContract.View {

        void showSuccess(RedditResponse redditResponse);

        void showWSError();

    }

    interface Presenter extends MvpContract.Presenter<TopEntriesContract.View> {
         void getTopEntries();
    }

}
