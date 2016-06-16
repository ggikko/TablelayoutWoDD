package ggikko.me.tablelayoutwodd.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

import ggikko.me.tablelayoutwodd.MainActivity;

/**
 * Created by ggikko on 16. 4. 28..
 */
public class CustomHorizontalScrollView extends HorizontalScrollView {

    Context mContext;

    public CustomHorizontalScrollView(Context context) {
        super(context);
        this.mContext = context;
    }

    public CustomHorizontalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public CustomHorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        View view = (View) getChildAt(getChildCount()-1);
        int diff = (view.getBottom()-(getHeight()+getScrollY()));

        int scrollX = getScrollX();
        final float scale = getContext().getResources().getDisplayMetrics().density;

        ((MainActivity)mContext).setHorizontalScrollValue(scrollX);

        super.onScrollChanged(l, t, oldl, oldt);
    }
}

