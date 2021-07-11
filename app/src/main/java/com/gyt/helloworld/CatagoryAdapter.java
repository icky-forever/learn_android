package com.gyt.helloworld;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CatagoryAdapter extends FragmentPagerAdapter {
    public CatagoryAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new PlantsFragment();
        }
        else if (position == 1)
        {
            return new MyPlantsFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return context.getString(R.string.category_plants);
        }
        else if (position == 1)
        {
            return context.getString(R.string.category_my_plants);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    private Context context;
}
