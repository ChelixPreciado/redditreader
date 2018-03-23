package com.chelix.redditreader;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.ViewGroup;

import com.chelix.redditreader.mvp.TopEntries.TopEntriesContract;
import com.chelix.redditreader.webservices.BaseActivity;
import com.chelix.redditreader.webservices.models.RedditEntry;
import com.chelix.redditreader.webservices.models.RedditEntryData;
import com.chelix.redditreader.webservices.models.RedditResponse;
import com.chelix.redditreader.webservices.models.RedditResponseData;

import butterknife.BindView;

public class MainActivity extends BaseActivity<TopEntriesContract.Presenter> implements TopEntriesContract.View {

    @BindView(R.id.vg_root)
    ViewGroup vgRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.getTopEntries();
    }

    @Override
    public void showSuccess(RedditResponse redditResponse) {
        for (RedditResponseData responseData : redditResponse.getData()) {
            for (RedditEntry entry : responseData.getData()) {
                for (RedditEntryData ed : entry.getData()) {
                    Log.i("Chelix", "AUTOR: " + ed.getAuthor());
                }
            }
        }
    }

    @Override
    public void showWSError() {
        Snackbar.make(vgRoot, R.string.network_error, Snackbar.LENGTH_SHORT).show();
    }
}
