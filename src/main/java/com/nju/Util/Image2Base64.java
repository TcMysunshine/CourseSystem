package com.nju.Util;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Image2Base64 {

    /**
     * 已知图片地址，将图片转换为base64编码
     * @param path
     * @return
     */
    public static String getImageStr(String path){
        InputStream stream;
        byte[] data = null;

        try {
            stream = new FileInputStream(path);
            data = new byte[stream.available()];
            stream.read(data);
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        String prefix = path.substring(path.lastIndexOf('.')+1);
        String str = "data:image/"+prefix+";base64,"+encoder.encode(data);
        return str;
    }
}
