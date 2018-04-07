package com.androidstudio.money_lover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.androidstudio.money_lover.Model.Thuchilist;

public class infoActivity extends AppCompatActivity {
    EditText etnoidung, etsotien;
    RadioButton thu, chi;
    Button them, nhaplai, hienthi;
    RadioGroup hinhthuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        anhxa();

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int isChecked = hinhthuc.getCheckedRadioButtonId();
                Thuchilist thuchilist = new Thuchilist();
                thuchilist.setNoidung(etnoidung.getText().toString());
                thuchilist.setSotien(etsotien.getText().toString());

                if(isChecked == R.id.radioButton_thu)
                {
                    thuchilist.setHinhthuc(true);
                }
                else
                {
                    thuchilist.setHinhthuc(false);
                }
                Activity1.Objects.add(thuchilist);
                Toast.makeText(infoActivity.this, "Bạn đã thêm thành công", Toast.LENGTH_SHORT).show();
            }
        });
        hienthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Show();
            }
        });

        nhaplai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
            }

    public void Show()
    {
        Intent intent = new Intent(infoActivity.this, Activity1.class);
        startActivity(intent);
    }

    public void anhxa()
    {
        etnoidung = (EditText) findViewById(R.id.et_noidung);
        etsotien = (EditText) findViewById(R.id.et_sotien);
        thu = (RadioButton) findViewById(R.id.radioButton_thu);
        chi = (RadioButton) findViewById(R.id.radioButton_chi);
        them = (Button) findViewById(R.id.btnthem);
        nhaplai = (Button) findViewById(R.id.btnnhaplai);
        hienthi = (Button) findViewById(R.id.btnhienthi);
        hinhthuc = (RadioGroup) findViewById(R.id.radioGroup1);
    }

        void reset(){
        etnoidung.setText("");
        etsotien.setText("");
        thu.setChecked(false);
        chi.setChecked(false);
        etnoidung.requestFocus();
        }
}
