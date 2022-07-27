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
        String[] list = new String[10];
        list[0] = "111";
        list[1] = "222";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("list1");
        list1.add("list2");
        list1.add("list3");

        ExcelUtil excelUtil = ExcelUtil.INSTANCE;
        button.setOnClickListener(view -> {
            excelUtil.initExcel(path+"/name.xls","test",1,list);
            excelUtil.writeObjListToExcel(list1,path+"/name.xls",1);
        });

    }

}