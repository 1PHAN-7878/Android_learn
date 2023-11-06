package com.example.pwproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Calendar;

public class SettingActivity extends AppCompatActivity {


    private Integer year;
    private Integer month;
    private  Integer day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        TextView usernameLabel = findViewById(R.id.username_label);
        EditText usernameValue = findViewById(R.id.username_value);
        TextView nicknameLabel = findViewById(R.id.nickname_label);
        EditText nicknameValue = findViewById(R.id.nickname_value);
        TextView genderLabel = findViewById(R.id.gender_label);
        RadioGroup genderValue = findViewById(R.id.gender_value);
        RadioButton maleRadioButton = findViewById(R.id.male_radio_button);
        RadioButton femaleRadioButton = findViewById(R.id.female_radio_button);
        TextView birthdayLabel = findViewById(R.id.birthday_label);
        DatePicker birthdayValue = findViewById(R.id.birthday_value);
        Button confirmButton = findViewById(R.id.confirm_button);

        // 获取从上一个Activity传递过来的默认值
        String usernameDefaultValue = getIntent().getStringExtra("username");
        String nicknameDefaultValue = getIntent().getStringExtra("nickname");
        String genderDefaultValue = getIntent().getStringExtra("gender");
        String birthdayDefaultValue = getIntent().getStringExtra("birthday");

        usernameValue.setText(usernameDefaultValue);
        nicknameValue.setText(nicknameDefaultValue);
        RadioGroup genderRadioGroup = findViewById(R.id.gender_value);

        if (genderDefaultValue.equals("男性")) {
            maleRadioButton.setChecked(true);
        } else if (genderDefaultValue.equals("女性")) {
            femaleRadioButton.setChecked(true);
        }
        String tem = "";
        String[] part = birthdayDefaultValue.split("-");
        year = Integer.parseInt(part[0]);
        month = Integer.parseInt(part[1]);
        day = Integer.parseInt(part[2]);
        birthdayValue.updateDate(year, month, day);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 读取用户输入的数据
                String username = usernameValue.getText().toString();
                String nickname = nicknameValue.getText().toString();
                int genderId = genderValue.getCheckedRadioButtonId();

                // 获取选中的性别
                String gender = "";
                if (genderId == R.id.male_radio_button) {
                    gender = "男性";
                } else if (genderId == R.id.female_radio_button) {
                    gender = "女性";
                }

                // 获取生日日期
                int year = birthdayValue.getYear();
                int month = birthdayValue.getMonth();
                int day = birthdayValue.getDayOfMonth();

                // 创建一个Bundle对象并存储用户输入的数据
                Bundle bundle = new Bundle();
                bundle.putString("username", username);
                bundle.putString("nickname", nickname);
                bundle.putString("gender", gender);
                bundle.putInt("year", year);
                bundle.putInt("month", month);
                bundle.putInt("day", day);

                // 创建一个Intent对象，将Bundle作为Extra添加到Intent中
                Intent intent = new Intent();
                intent.putExtras(bundle);

                // 设置返回结果为RESULT_OK，并将Intent作为参数返回给调用它的Activity
                setResult(RESULT_OK, intent);

                // 结束当前Activity
                finish();
            }
        });



    }
}