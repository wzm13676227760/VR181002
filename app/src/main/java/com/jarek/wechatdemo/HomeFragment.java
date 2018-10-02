package com.jarek.wechatdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements View.OnClickListener
{
    private View view;
    private ViewPager viewPager;
    private ArrayList<View> pageview;
    private ImageView imageView;
    private ImageView[] imageViews;
    // 包裹小圆点的LinearLayout
    private ViewGroup group;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_fragment, container, false);
        init();
        return view;
    }
    public void init(){

//        VideoView videoView1=(VideoView)view.findViewById(R.id.video1);
//        VideoView videoView2=(VideoView)view.findViewById(R.id.video2);
//        VideoView videoView3=(VideoView)view.findViewById(R.id.video3);
//        VideoView videoView4=(VideoView)view.findViewById(R.id.video4);
//        VideoView videoView5=(VideoView)view.findViewById(R.id.video5);
//        VideoView videoView6=(VideoView)view.findViewById(R.id.video6);

        ImageButton imageButton1 = (ImageButton)view.findViewById(R.id.ImageButton1);//首页6个图片按钮
        ImageButton imageButton2 = (ImageButton)view.findViewById(R.id.ImageButton2);//2018.10.02
        ImageButton imageButton3 = (ImageButton)view.findViewById(R.id.ImageButton3);
        ImageButton imageButton4 = (ImageButton)view.findViewById(R.id.ImageButton4);
        ImageButton imageButton5 = (ImageButton)view.findViewById(R.id.ImageButton5);
        ImageButton imageButton6 = (ImageButton)view.findViewById(R.id.ImageButton6);
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);


        ImageView search=(ImageView)view.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getActivity(),DemoActivity.class);
                startActivity(intent);
            }
        });

        EditText serchcontent=(EditText)view.findViewById(R.id.search_content);
        TextView searchview=(TextView)view.findViewById(R.id.searchView);

        viewPager=(ViewPager)view.findViewById(R.id.viewPager);
        //查找布局文件用LayoutInflater.inflate
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view1 = inflater.inflate(R.layout.item01, null);
        View view2 = inflater.inflate(R.layout.item02, null);
        View view3 = inflater.inflate(R.layout.item03, null);
        //将view装入数组
        pageview =new ArrayList<View>();
        pageview.add(view1);
        pageview.add(view2);
        pageview.add(view3);
        group = (ViewGroup)view.findViewById(R.id.viewGroup);
        //有多少张图就有多少个点点
        imageViews = new ImageView[pageview.size()];
        for(int i =0;i<pageview.size();i++){
            imageView = new ImageView(getActivity());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(20,20));
            imageView.setPadding(20, 0, 20, 0);
            imageViews[i] = imageView;

            //默认第一张图显示为选中状态
            if (i == 0) {
                imageViews[i].setBackgroundResource(R.drawable.page_indicator_focused);
            } else {
                imageViews[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
            }

            group.addView(imageViews[i]);
        }

        //绑定适配器
        viewPager.setAdapter(mPagerAdapter);
        //绑定监听事件
        viewPager.setOnPageChangeListener(new GuidePageChangeListener());
    }

    //数据适配器
    PagerAdapter mPagerAdapter = new PagerAdapter(){

        @Override
        //获取当前窗体界面数
        public int getCount() {
            // TODO Auto-generated method stub
            return pageview.size();
        }

        @Override
        //断是否由对象生成界面
        public boolean isViewFromObject(View arg0, Object arg1) {
            // TODO Auto-generated method stub
            return arg0==arg1;
        }
        //是从ViewGroup中移出当前View
        public void destroyItem(View arg0, int arg1, Object arg2) {
            ((ViewPager) arg0).removeView(pageview.get(arg1));
        }

        //返回一个对象，这个对象表明了PagerAdapter适配器选择哪个对象放在当前的ViewPager中
        public Object instantiateItem(View arg0, int arg1){
            ((ViewPager)arg0).addView(pageview.get(arg1));
            return pageview.get(arg1);
        }
    };

    @Override
    public void onClick(View v) {

    switch(v.getId()){
        case R.id.ImageButton1:Intent intent1=new Intent(getActivity(),DemoActivity.class);//2018.10.02
           intent1.putExtra("name","ab");                                                   //传递一个name数据，实现一个demo可以显示不同的照片
            startActivity(intent1);
            break;
        case R.id.ImageButton2:Intent intent2=new Intent(getActivity(),DemoActivity.class);
            intent2.putExtra("name","bc");
            startActivity(intent2);
            break;
        case R.id.ImageButton3:Intent intent3=new Intent(getActivity(),DemoActivity.class);
            intent3.putExtra("name","abc");
            startActivity(intent3);

            break;
        case R.id.ImageButton4:Intent intent4=new Intent(getActivity(),DemoActivity.class);
            startActivity(intent4);
            break;
        case R.id.ImageButton5:Intent intent5=new Intent(getActivity(),DemoActivity.class);
            startActivity(intent5);
            break;
        case R.id.ImageButton6:Intent intent6=new Intent(getActivity(),DemoActivity.class);
            startActivity(intent6);
            break;
    }

    }

    //pageView监听器
    class GuidePageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrollStateChanged(int arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            // TODO Auto-generated method stub

        }

        @Override
        //如果切换了，就把当前的点点设置为选中背景，其他设置未选中背景
        public void onPageSelected(int arg0) {
            // TODO Auto-generated method stub
            for(int i=0;i<imageViews.length;i++){
                imageViews[arg0].setBackgroundResource(R.drawable.page_indicator_focused);
                if (arg0 != i) {
                    imageViews[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
                }
            }

        }

    }

}
