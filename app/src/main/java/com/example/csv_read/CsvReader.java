package com.example.csv_read;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    List<ListData> objects = new ArrayList<ListData>();
    public void reader_6(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            // CSVファイルの読み込み
            InputStream inputStream = assetManager.open("loto6-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {

                //カンマ区切りで１つづつ配列に入れる
                ListData data = new ListData();
                String[] RowData = line.split(",");

                //CSVの左([0]番目)から順番にセット
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                data.setInt02(RowData[3]);
                data.setInt03(RowData[4]);
                data.setInt04(RowData[5]);
                data.setInt05(RowData[6]);
                data.setInt06(RowData[7]);

                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader_7(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            InputStream inputStream = assetManager.open("loto7-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ListData data = new ListData();
                String[] RowData = line.split(",");
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                data.setInt02(RowData[3]);
                data.setInt03(RowData[4]);
                data.setInt04(RowData[5]);
                data.setInt05(RowData[6]);
                data.setInt06(RowData[7]);
                data.setInt07(RowData[8]);
                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader_mini(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            InputStream inputStream = assetManager.open("mini-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ListData data = new ListData();
                String[] RowData = line.split(",");
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                data.setInt02(RowData[3]);
                data.setInt03(RowData[4]);
                data.setInt04(RowData[5]);
                data.setInt05(RowData[6]);
                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader_numb3(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            InputStream inputStream = assetManager.open("numb3-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ListData data = new ListData();
                String[] RowData = line.split(",");
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader_numb4(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            InputStream inputStream = assetManager.open("numb4-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ListData data = new ListData();
                String[] RowData = line.split(",");
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader_bingo5(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            InputStream inputStream = assetManager.open("bingo5-cut.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                ListData data = new ListData();
                String[] RowData = line.split(",");
                data.setId(RowData[0]);
                data.setCdate(RowData[1]);
                data.setInt01(RowData[2]);
                data.setInt02(RowData[3]);
                data.setInt03(RowData[4]);
                data.setInt04(RowData[5]);
                data.setInt05(RowData[6]);
                data.setInt06(RowData[7]);
                data.setInt07(RowData[8]);
                data.setInt08(RowData[9]);
                objects.add(data);
            }
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

