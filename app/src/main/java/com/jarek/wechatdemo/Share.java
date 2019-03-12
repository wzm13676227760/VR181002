package com.jarek.wechatdemo;

import java.util.Date;

/**
 * Created by Bluesky on 2018/10/31.
 */

public class Share {
    private String shareName;//分享人名称
    private int headImage;//分享人头像
    private String shareWords;//分享文字
    private int shareImages;//分享图片
    private String shareDate;
    private String shareComment;
    private int shareId;

    public Share(int shareId,String shareName,int headImage,String shareWords,int shareImages,String shareDate,String shareComment){
        this.shareId=shareId;
        this.shareName=shareName;
        this.headImage=headImage;
        this.shareWords=shareWords;
        this.shareImages=shareImages;
        this.shareDate=shareDate;
        this.shareComment=shareComment;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getHeadImage() {
        return headImage;
    }

    public void setHeadImage(int headImage) {
        this.headImage = headImage;
    }

    public int getShareImages() {
        return shareImages;
    }

    public void setShareImages(int shareImages) {
        this.shareImages = shareImages;
    }

    public String getShareWords() {
        return shareWords;
    }

    public void setShareWords(String shareWords) {
        this.shareWords = shareWords;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }

    public String getShareComment() {
        return shareComment;
    }

    public void setShareComment(String shareComment) {
        this.shareComment = shareComment;
    }

    public int getShareId() {return shareId;}

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }
}
