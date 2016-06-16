package ggikko.me.tablelayoutwodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import ggikko.me.tablelayoutwodd.custom.CustomHorizontalScrollView;
import ggikko.me.tablelayoutwodd.event.ItemClickListener;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    /** left & right list */
    @BindView(R.id.recycler_left) RecyclerView mRecycler_left;
    @BindView(R.id.recycler_right) RecyclerView mRecycler_right;

    /** header 1, header 2, section divider */
    @BindView(R.id.table_divider_header) View table_divider_header;
    @BindView(R.id.table_divider_header2) View table_divider_header2;
    @BindView(R.id.table_divider_content) View table_divider_content;

    @BindView(R.id.title_header_list) CustomHorizontalScrollView title_header_list;
    @BindView(R.id.content_list) CustomHorizontalScrollView content_list;

    /** dynamic + header  */
    @BindView(R.id.right_title_header) LinearLayout right_title_header;

    /** arrow for direction */
    @BindView(R.id.arrow) ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    /** horizontal sync */
    public void setHorizontalScrollValue(int horizontalScrollValue) {
        if (horizontalScrollValue == 0) {
            table_divider_header.setVisibility(View.GONE);
            table_divider_content.setVisibility(View.GONE);
            table_divider_header2.setVisibility(View.GONE);
            arrow.setVisibility(View.VISIBLE);
        } else {
            table_divider_header.setVisibility(View.VISIBLE);
            table_divider_content.setVisibility(View.VISIBLE);
            table_divider_header2.setVisibility(View.VISIBLE);
            arrow.setVisibility(View.GONE);
        }

        title_header_list.scrollTo(horizontalScrollValue, 0);
        content_list.scrollTo(horizontalScrollValue, 0);
    }

}
