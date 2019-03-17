package com.jarek.wechatdemo;
import java.util.Random;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import com.jarek.wechatdemo.wxdemo.ImagePickerAdapter;
//import com.jarek.wechatdemo.wxdemo.WxDemoActivity;

public class MessageFragment extends Fragment implements View.OnClickListener{
    private List<Share> shareList=new ArrayList<>();
//private String[] data={"apple","pear","orange","banana","watermelon","strawberry"};
    private ImageView shareImage;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.message_fragment, container, false);
        initShare();//初始化分享数据
        ShareAdapter adapter=new ShareAdapter(getActivity(),R.layout.share_item,shareList);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        ListView sharelist=(ListView)view.findViewById(R.id.shareList);
        sharelist.setAdapter(adapter);


        shareImage= (ImageView)view.findViewById(R.id.share);
        shareImage.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.share:
                //startActivity(new Intent(this, WxDemoActivity.class));
                break;
        }
    }

    public int randomByMinMax(int min, int max) {
        return new Random().nextInt(max + 1 - min) + min;
    }
    private void initShare(){
        SimpleDateFormat  formatter  =new  SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
//        Date curDate =new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999));//获取当前时间
//        String str =formatter.format(curDate);
        for (int i=0;i<8;i++){
            //int shareId,String shareName,int headImage,String shareWords,int shareImages,String shareDate,String shareComment
            Share shareuser1=new Share(1,"apple",R.drawable.header1,"apple is delicious",R.drawable.lijiang1,formatter.format(new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999))),"yes I think so that.");
            shareList.add(shareuser1);
            Share shareuser2=new Share(2,"orange",R.drawable.header2,"orange is delicious",R.drawable.lijiang2,formatter.format(new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999))),"yes I think so that.");
            shareList.add(shareuser2);
            Share shareuser3=new Share(3,"pear",R.drawable.header3,"pear is delicious",R.drawable.hangzhou1,formatter.format(new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999))),"yes I think so that.");
            shareList.add(shareuser3);
            Share shareuser4=new Share(4,"pear",R.drawable.header4,"pear is delicious",R.drawable.hangzhou2,formatter.format(new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999))),"yes I think so that.");
            shareList.add(shareuser4);
            Share shareuser5=new Share(5,"pear",R.drawable.header5,"pear is delicious",R.drawable.hangzhou3,formatter.format(new Date(System.currentTimeMillis()+ randomByMinMax(10000, 99999))),"yes I think so that.");
            shareList.add(shareuser5);
        }
    }
}
