package ggikko.me.tablelayoutwodd.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import ggikko.me.tablelayoutwodd.R;
import ggikko.me.tablelayoutwodd.event.ItemClickListener;

/**
 * Created by admin on 16. 6. 16..
 */
public class RightSectionAdapter extends RecyclerView.Adapter<RightSectionAdapter.RightSideViewHolder>  {

    private ItemClickListener mItemClickListener;
    private Context mContext;

    public RightSectionAdapter(Context context, ItemClickListener itemClickListener){
        this.mContext =context;
        this.mItemClickListener = itemClickListener;
    }

    public void setItem(){

    }

    @Override
    public RightSideViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.invest_right_row,parent,false);
        return new RightSideViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RightSideViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /** right side viewholder */
    public class RightSideViewHolder extends RecyclerView.ViewHolder {

        public RightSideViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
