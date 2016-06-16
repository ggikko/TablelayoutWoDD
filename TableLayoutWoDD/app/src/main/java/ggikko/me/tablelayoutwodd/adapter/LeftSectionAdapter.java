package ggikko.me.tablelayoutwodd.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import ggikko.me.tablelayoutwodd.R;
import ggikko.me.tablelayoutwodd.event.ItemClickListener;

/**
 * Created by admin on 16. 6. 16..
 */
public class LeftSectionAdapter extends RecyclerView.Adapter<LeftSectionAdapter.LeftSideViewHolder> {

    private ItemClickListener mItemClickListener;
    private Context mContext;

    public LeftSectionAdapter(Context context, ItemClickListener itemClickListener){
        this.mContext =context;
        this.mItemClickListener = itemClickListener;
    }

    public void setItem(){

    }

    @Override
    public LeftSideViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.invest_left_row,parent,false);
        return new LeftSideViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LeftSideViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /** left side viewholder */
    public class LeftSideViewHolder extends RecyclerView.ViewHolder {

        public LeftSideViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
