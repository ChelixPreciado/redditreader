package com.chelix.redditreader;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditReaderApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
    }
}
