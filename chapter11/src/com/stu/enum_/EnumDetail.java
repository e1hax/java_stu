package com.stu.enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Phone.CLASSICMUSIC.playing();
    }
}

interface Mp3{
     void playing();
}

enum Phone implements Mp3{
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("MP3在播放好听的音乐。。。");
    }
}
