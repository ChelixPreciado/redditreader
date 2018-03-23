package com.chelix.redditreader.webservices.repository;

import com.chelix.redditreader.webservices.models.RedditResponse;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public interface RedditTopsService {

    @GET("top/.json")
    Single<RedditResponse> getTopEntries ();
}
