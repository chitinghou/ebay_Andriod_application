package com.example.hw4;

import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
   private String[] titles = new String[]{"Search", "Wishlist"};
   private static final String TAG = "MyFragmentPagerAdapter";

   public MyFragmentPagerAdapter(FragmentManager fm) {
      super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
      Log.d(TAG, "get 1");
   }

   @Override
   public Fragment getItem(int position) {
      Log.d(TAG, "get 2"+position+"\n");
      switch (position) {
         case 0:
            return new SearchFragment();
         case 1:
            return new WishlistFragment();
      }
      return null;
   }

   @Override
   public int getCount() {
      Log.d(TAG, "get 3"+titles.length+"\n");
      return titles.length;
   }

   @Nullable
   @Override
   public CharSequence getPageTitle(int position) {
      Log.d(TAG, "get 4");
      return titles[position];
   }
}
