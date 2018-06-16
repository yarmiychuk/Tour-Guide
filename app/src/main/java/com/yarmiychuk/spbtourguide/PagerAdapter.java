package com.yarmiychuk.spbtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yarmiychuk.spbtourguide.fragments.MuseumsFragment;
import com.yarmiychuk.spbtourguide.fragments.ParksFragment;
import com.yarmiychuk.spbtourguide.fragments.TheatresFragment;
import com.yarmiychuk.spbtourguide.fragments.OtherFragment;

/**
 * Created by DmitryYarmiychuk on 13.06.2018.
 * Создал DmitryYarmiychuk 13.06.2018
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private Context context;

    /**
     * Constructor of adapter
     *
     * @param context         - Activity
     * @param fragmentManager - Fragment Manager
     */
    PagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
    }

    /**
     * Get Fragment fo current position
     * @param position of fragment in adapter
     * @return fragment
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case MainActivity.CATEGORY_MUSEUMS:
            default:
                return new MuseumsFragment();
            case MainActivity.CATEGORY_THEATRES:
                return new TheatresFragment();
            case MainActivity.CATEGORY_PARKS:
                return new ParksFragment();
            case MainActivity.CATEGORY_OTHER:
                return new OtherFragment();
        }

    }

    /**
     * Get title for current fragment
     * @param position of fragment in adapter
     * @return title
     */
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case MainActivity.CATEGORY_MUSEUMS:
            default:
                return context.getString(R.string.category_museums);
            case MainActivity.CATEGORY_THEATRES:
                return context.getString(R.string.category_theatres);
            case MainActivity.CATEGORY_PARKS:
                return context.getString(R.string.category_parks);
            case MainActivity.CATEGORY_OTHER:
                return context.getString(R.string.category_other);
        }
    }

    /**
     * Get count of fragments
     * @return count
     */
    @Override
    public int getCount() {
        return MainActivity.TOTAL_CATEGORIES;
    }
}
