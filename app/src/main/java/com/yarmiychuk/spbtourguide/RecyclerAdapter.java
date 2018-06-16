package com.yarmiychuk.spbtourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DmitryYarmiychuk on 13.06.2018.
 * Создал DmitryYarmiychuk 13.06.2018
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Sight> sights;
    private int color;

    public RecyclerAdapter(Context context, ArrayList<Sight> sights, int category) {
        this.sights = sights;
        switch (category) {
            case MainActivity.CATEGORY_MUSEUMS:
                color = ContextCompat.getColor(context, R.color.color_museums);
                break;
            case MainActivity.CATEGORY_THEATRES:
                color = ContextCompat.getColor(context, R.color.color_theatres);
                break;
            case MainActivity.CATEGORY_PARKS:
                color = ContextCompat.getColor(context, R.color.color_parks);
                break;
            case MainActivity.CATEGORY_OTHER:
                color = ContextCompat.getColor(context, R.color.color_sports);
                break;
            default:
                color = ContextCompat.getColor(context, R.color.color_unknown);
                break;
        }
    }

    // Create new views
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LinearLayout view = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    /**
     * TODO Fill view with sight data
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvSightName.setText(sights.get(position).getSightName());
        holder.tvSightName.setTextColor(color);
        holder.ivPicture.setImageResource(sights.get(position).getImageResourceId());
        holder.tvSightDescription.setText(sights.get(position).getDescription());
        holder.tvSightLink.setText(sights.get(position).getLink());
        holder.tvSightLink.setLinkTextColor(color);
    }

    @Override
    public int getItemCount() {
        return sights.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSightName, tvSightDescription, tvSightLink;
        private ImageView ivPicture;

        private ViewHolder(View view) {
            super(view);
            this.tvSightName = view.findViewById(R.id.tv_sight_name);
            this.ivPicture = view.findViewById(R.id.iv_sight_image);
            this.tvSightDescription = view.findViewById(R.id.tv_sight_description);
            this.tvSightLink = view.findViewById(R.id.tv_sight_link);
        }
    }
}
