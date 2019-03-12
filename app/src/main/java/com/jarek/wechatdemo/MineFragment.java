package com.jarek.wechatdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MineFragment extends Fragment {
    private ViewPager viewPager;
    private ArrayList<View> pageview;
    private TextView videoLayout;
    private TextView musicLayout;
    // 滚动条图片
    private ImageView scrollbar;
    // 滚动条初始偏移量
    private int offset = 0;
    // 当前页编号
    private int currIndex = 0;
    // 滚动条宽度
    private int bmpW;
    //一倍滚动量
    private int one;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.mine_fragment, container, false);

//        setContentView(R.layout.my_collect);
//
//        viewPager = (ViewPager) findViewById(R.id.viewPager);
//        //查找布局文件用LayoutInflater.inflate
//        LayoutInflater inflater =getLayoutInflater();
//        View view1 = inflater.inflate(R.layout.video_player, null);
//        View view2 = inflater.inflate(R.layout.media_player, null);
//        videoLayout = (TextView)findViewById(R.id.videoLayout);
//        musicLayout = (TextView)findViewById(R.id.musicLayout);
//        scrollbar = (ImageView)findViewById(R.id.scrollbar);
//        videoLayout.setOnClickListener(this);
//        musicLayout.setOnClickListener(this);
//        pageview =new ArrayList<View>();
//        //添加想要切换的界面
//        pageview.add(view1);
//        pageview.add(view2);
//        //数据适配器
//        PagerAdapter mPagerAdapter = new PagerAdapter(){
//            @Override
//            //获取当前窗体界面数
//            public int getCount() {
//                // TODO Auto-generated method stub
//                return pageview.size();
//            }
//            @Override
//            //判断是否由对象生成界面
//            public boolean isViewFromObject(View arg0, Object arg1) {
//                // TODO Auto-generated method stub
//                return arg0==arg1;
//            }
//            //使从ViewGroup中移出当前View
//            public void destroyItem(View arg0, int arg1, Object arg2) {
//                ((ViewPager) arg0).removeView(pageview.get(arg1));
//            }
//            //返回一个对象，这个对象表明了PagerAdapter适配器选择哪个对象放在当前的ViewPager中
//            public Object instantiateItem(View arg0, int arg1){
//                ((ViewPager)arg0).addView(pageview.get(arg1));
//                return pageview.get(arg1);
//            }
//        };
//        //绑定适配器
//        viewPager.setAdapter(mPagerAdapter);
//        //设置viewPager的初始界面为第一个界面
//        viewPager.setCurrentItem(0);
//        //添加切换界面的监听器
//        viewPager.addOnPageChangeListener(new MyOnPageChangeListener());
//        // 获取滚动条的宽度
//        bmpW = BitmapFactory.decodeResource(getResources(), R.drawable.scrollbar).getWidth();
//        //为了获取屏幕宽度，新建一个DisplayMetrics对象
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        //将当前窗口的一些信息放在DisplayMetrics类中
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        //得到屏幕的宽度
//        int screenW = displayMetrics.widthPixels;
//        //计算出滚动条初始的偏移量
//        offset = (screenW / 2 - bmpW) / 2;
//        //计算出切换一个界面时，滚动条的位移量
//        one = offset * 2 + bmpW;
//        Matrix matrix = new Matrix();
//        matrix.postTranslate(offset, 0);
//        //将滚动条的初始位置设置成与左边界间隔一个offset
//        scrollbar.setImageMatrix(matrix);


        return view;
    }
}
