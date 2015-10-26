package info.dabu.imagecompresstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;

import tools.ImageCompress;

/**
 * Created by AlexY on 2015/9/29.
 * 图片压缩测试
 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        要压缩的图片文件
        String path = "/storage/sdcard0/44.jpg";
        Log.e("image path", path);


        File aa = new File(path);

//        压缩后保存的路径
        String newPath = "/storage/sdcard0/446.jpg";
        Log.e("image newpath", newPath);

        ImageCompress.saveBitmapToFile(aa, newPath);


    }
}
