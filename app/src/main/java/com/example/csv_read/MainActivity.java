package com.example.csv_read;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CsvReader parser_6 = new CsvReader();
        CsvReader parser_7 = new CsvReader();
        CsvReader parser_mini = new CsvReader();
        CsvReader parser_numb3 = new CsvReader();
        CsvReader parser_numb4 = new CsvReader();
        CsvReader parser_bingo5 = new CsvReader();

        parser_6.reader_6(getApplicationContext());
        ListViewAdapter listViewAdapter_6 = new ListViewAdapter(this, 0, parser_6.objects);
        parser_7.reader_7(getApplicationContext());
        ListViewAdapter listViewAdapter_7 = new ListViewAdapter(this, 0, parser_7.objects);
        parser_mini.reader_mini(getApplicationContext());
        ListViewAdapter listViewAdapter_mini = new ListViewAdapter(this, 0, parser_mini.objects);
        parser_numb3.reader_numb3(getApplicationContext());
        ListViewAdapter listViewAdapter_numb3 = new ListViewAdapter(this, 0, parser_numb3.objects);
        parser_numb4.reader_numb4(getApplicationContext());
        ListViewAdapter listViewAdapter_numb4 = new ListViewAdapter(this, 0, parser_numb4.objects);
        parser_bingo5.reader_bingo5(getApplicationContext());
        ListViewAdapter listViewAdapter_bingo5 = new ListViewAdapter(this, 0, parser_bingo5.objects);

        final ListView listView_6 = (ListView)findViewById(R.id.list_6);
        listView_6.setAdapter(listViewAdapter_6);
        listView_6.setVisibility(View.GONE);
        final ListView listView_7 = (ListView)findViewById(R.id.list_7);
        listView_7.setAdapter(listViewAdapter_7);
        listView_7.setVisibility(View.GONE);
        final ListView listView_mini = (ListView)findViewById(R.id.list_mini);
        listView_mini.setAdapter(listViewAdapter_mini);
        listView_mini.setVisibility(View.GONE);
        final ListView listView_numb3 = (ListView)findViewById(R.id.list_numb3);
        listView_numb3.setAdapter(listViewAdapter_numb3);
        listView_numb3.setVisibility(View.GONE);
        final ListView listView_numb4 = (ListView)findViewById(R.id.list_numb4);
        listView_numb4.setAdapter(listViewAdapter_numb4);
        listView_numb4.setVisibility(View.GONE);
        final ListView listView_bingo5 = (ListView)findViewById(R.id.list_bingo5);
        listView_bingo5.setAdapter(listViewAdapter_bingo5);
        listView_bingo5.setVisibility(View.GONE);

        // ここからSwitch------------------------------------------------------
        final Switch switchButton_6 = (Switch) findViewById(R.id.switch1);
        final Switch switchButton_7 = (Switch) findViewById(R.id.switch2);
        final Switch switchButton_mini = (Switch) findViewById(R.id.switch3);
        final Switch switchButton_numb3 = (Switch) findViewById(R.id.switch4);
        final Switch switchButton_numb4 = (Switch) findViewById(R.id.switch5);
        final Switch switchButton_bingo5 = (Switch) findViewById(R.id.switch6);

        switchButton_6.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ロト６過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_7.setChecked(false);
                            switchButton_mini.setChecked(false);
                            switchButton_numb3.setChecked(false);
                            switchButton_numb4.setChecked(false);
                            switchButton_bingo5.setChecked(false);
                            listView_6.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_6.setVisibility(View.GONE);
                        }
                    }
                }
        );
        switchButton_7.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ロト７過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_6.setChecked(false);
                            switchButton_mini.setChecked(false);
                            switchButton_numb3.setChecked(false);
                            switchButton_numb4.setChecked(false);
                            switchButton_bingo5.setChecked(false);
                            listView_7.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_7.setVisibility(View.GONE);
                        }
                    }
                }
        );
        switchButton_mini.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ミニロト過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_7.setChecked(false);
                            switchButton_6.setChecked(false);
                            switchButton_numb3.setChecked(false);
                            switchButton_numb4.setChecked(false);
                            switchButton_bingo5.setChecked(false);
                            listView_mini.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_mini.setVisibility(View.GONE);
                        }
                    }
                }
        );
        switchButton_numb3.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ナンバーズ３過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_7.setChecked(false);
                            switchButton_6.setChecked(false);
                            switchButton_mini.setChecked(false);
                            switchButton_numb4.setChecked(false);
                            switchButton_bingo5.setChecked(false);
                            listView_numb3.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_numb3.setVisibility(View.GONE);
                        }
                    }
                }
        );
        switchButton_numb4.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ナンバーズ４過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_7.setChecked(false);
                            switchButton_6.setChecked(false);
                            switchButton_mini.setChecked(false);
                            switchButton_numb3.setChecked(false);
                            switchButton_bingo5.setChecked(false);
                            listView_numb4.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_numb4.setVisibility(View.GONE);
                        }
                    }
                }
        );
        switchButton_bingo5.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener(){
                    public void onCheckedChanged(CompoundButton comButton, boolean isChecked){
                        if(isChecked){
                            Toast toast = Toast.makeText(MainActivity.this, "ビンゴ５過去当選履歴を表示中", Toast.LENGTH_SHORT);
                            toast.show();
                            switchButton_7.setChecked(false);
                            switchButton_6.setChecked(false);
                            switchButton_mini.setChecked(false);
                            switchButton_numb3.setChecked(false);
                            switchButton_numb4.setChecked(false);
                            listView_bingo5.setVisibility(View.VISIBLE);
                        }
                        else{
                            listView_bingo5.setVisibility(View.GONE);
                        }
                    }
                }
        );
    }
}
