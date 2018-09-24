package dev.dworks.apps.anexplorer.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;

public class LinearLayoutManagerCompat extends LinearLayoutManager {

    public LinearLayoutManagerCompat(Context context) {
        super(context);
    }

    public LinearLayoutManagerCompat(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public LinearLayoutManagerCompat(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}