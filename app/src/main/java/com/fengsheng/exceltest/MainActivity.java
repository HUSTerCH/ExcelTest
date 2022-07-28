package com.fengsheng.exceltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        String path = this.getExternalFilesDir(null).getAbsolutePath();
        String[] list = new String[5];
        list[0] = "避雷器名称";
        list[1] = "电压等级";
        list[2] = "测试模式";
        list[3] = "参考源";
        list[4] = "参考相";

        ArrayList<DeviceDataBean> list1 = new ArrayList<>();
        list1.add(new DeviceDataBean("启亦001避雷器",1,
                0, "电压分析法",
                0, "主机PT单相电压参考",
                0,"A"));
//        list1.add("list2");
//        list1.add(new DeviceDataBean("启亦002避雷器",2,
//                0, "电压分析法",
//                0, "主机PT单相电压参考",
//                0,"A"));

        ExcelUtil excelUtil = ExcelUtil.INSTANCE;
        button.setOnClickListener(view -> {
            excelUtil.initExcel(path+"/name.xls","test",1,list);
            excelUtil.writeObjListToExcel(list1,path+"/name.xls",1);
        });

    }

}