package com.example.upastithi;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    Context context;
    int not;
    PagerAdapter(Context context, FragmentManager fm, int not)
    {

         super(fm);

        this.context=context;
      this.not=not;


    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0) {
            Student_Fragment tab1 = new Student_Fragment();
            return tab1;
        } else if (i == 1) {
            Teacher_Fragment tab2 = new Teacher_Fragment();
            return tab2;
        }else
        {
            return null;
        }

    }

    @Override
    public int getCount() {
        return not;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                    return context.getString(R.string.student_tab);
            case 1:
                    return context.getString(R.string.teacher_tab);

            default:return null;

        }
    }
}
