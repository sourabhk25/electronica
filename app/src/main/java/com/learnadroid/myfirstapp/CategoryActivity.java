package com.learnadroid.myfirstapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Ashish on 09-09-2017.
 */

public class CategoryActivity extends Fragment {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_category,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Category");
        imageView1 = (ImageView) view.findViewById(R.id.cat_mobile_button);
        imageView2 = (ImageView) view.findViewById(R.id.cat_laptop_button);
        imageView3 = (ImageView) view.findViewById(R.id.cat_washing_button);
        imageView4 = (ImageView) view.findViewById(R.id.cat_fridge_button);
        imageView5 = (ImageView) view.findViewById(R.id.cat_tv_button);
        imageView1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Fragment fragment = new ListActivity();
                  FragmentTransaction ft = getFragmentManager().beginTransaction();
                  ft.replace(R.id.content_cat,fragment);
                  ft.commit();
              }
          }
        );
        imageView2.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Fragment fragment = new ListActivity();
                                              FragmentTransaction ft = getFragmentManager().beginTransaction();
                                              ft.replace(R.id.content_cat,fragment);
                                              ft.commit();
                                          }
                                      }
        );
        imageView3.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Fragment fragment = new ListActivity();
                                              FragmentTransaction ft = getFragmentManager().beginTransaction();
                                              ft.replace(R.id.content_cat,fragment);
                                              ft.commit();
                                          }
                                      }
        );
        imageView4.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Fragment fragment = new ListActivity();
                                              FragmentTransaction ft = getFragmentManager().beginTransaction();
                                              ft.replace(R.id.content_cat,fragment);
                                              ft.commit();
                                          }
                                      }
        );
        imageView5.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Fragment fragment = new ListActivity();
                                              FragmentTransaction ft = getFragmentManager().beginTransaction();
                                              ft.replace(R.id.content_cat,fragment);
                                              ft.commit();
                                          }
                                      }
        );
    }
}