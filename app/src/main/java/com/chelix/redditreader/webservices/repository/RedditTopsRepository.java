package com.chelix.redditreader.webservices.repository;

import com.chelix.redditreader.webservices.models.RedditResponse;

import io.reactivex.Single;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public interface RedditTopsRepository {

    Single<RedditResponse> getTopEntries ();
}
