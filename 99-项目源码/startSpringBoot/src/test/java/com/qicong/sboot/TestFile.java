package com.qicong.cj.C24;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * User LuciferK
 */
public class TestFile {
    public static void main(String[] args) {
        try {
            FileInputStream fil = new FileInputStream("/Users/qicong/Desktop/a1.txt");
            //System.out.println(fil.available());
            byte[] buffer = new byte[fil.available()];
            while(fil.read(buffer)!=-1){
                System.out.println(new String(buffer));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
