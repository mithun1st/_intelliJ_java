package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //object create
        Persone x,y,z;

        //initial object
        x=new Persone();
        y=new Persone();
        z=new Persone();

        //profile x
        x.name="Mr. X";
        x.photo="xPhoto.jpg";
        x.video="xClips.mp4";
        x.viewProfile();


        //profile y
        y.name="Mr. Y";
        y.photo="yImage.png";
        y.video="yVideo.avi";
        y.viewProfile();


        //profile z
        z.name="Mr. Z";
        z.photo="zPicture.svg";
        z.video="zVlog.mkv";
        z.viewProfile();

    }
}
