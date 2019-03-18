package com.jarek.wechatdemo;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bluesky on 2018/10/31.
 */

public class ShareAdapter extends ArrayAdapter<Share> {
    private int resourceId;
    public ShareAdapter(Context context,int textViewResourceId,List<Share> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Share share=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView headImage=(ImageView)view.findViewById(R.id.headimage);
        TextView shareName=(TextView)view.findViewById(R.id.sharename);
        TextView shareWords=(TextView)view.findViewById(R.id.sharewords);
        ImageView shareImages=(ImageView)view.findViewById(R.id.shareimages);
        TextView shareDate=(TextView)view.findViewById(R.id.sharedate);
        Button commentButton=(Button)view.findViewById(R.id.commentbutton);
        TextView shareComment=(TextView)view.findViewById(R.id.sharecomment);
        headImage.setImageResource(share.getHeadImage());
        shareName.setText(share.getShareName());
        shareWords.setText(share.getShareWords());
        shareImages.setImageResource(share.getShareImages());
        shareDate.setText(share.getShareDate());
        shareComment.setText(share.getShareComment());
        return view;
    }
}
