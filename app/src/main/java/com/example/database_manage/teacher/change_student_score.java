package com.example.database_manage.teacher;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.database_manage.R;
import com.example.database_manage.database.CommonDatabase;


/*
    该界面主要用于修改学生分数的信息
 */
public class change_student_score extends AppCompatActivity {
    private SQLiteDatabase db;
    private Button button_change;
    private Button button_back;
    private Intent intent;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText edit_score;

    private EditText dianming1;
    private EditText dianming2;
    private EditText zuoye1;
    private EditText zuoye2;
    private EditText zuoye3;
    private EditText shangji1;
    private EditText shangji2;
    private EditText shangji3;
    private EditText shangji4;
    private EditText shangji5;
    private EditText email;

    private Button button_jifen;
    private Button button_beifen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_change_student_score);

        init();
        button_jifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String score1p = dianming1.getText().toString();
                float score1= Float.parseFloat(score1p);

                String score2p = dianming2.getText().toString();
                float score2= Float.parseFloat(score2p);

                String score3p = zuoye1.getText().toString();
                float score3= Float.parseFloat(score3p);

                String score4p = zuoye2.getText().toString();
                float score4= Float.parseFloat(score4p);

                String score5p = zuoye3.getText().toString();
                float score5= Float.parseFloat(score5p);

                String score6p = shangji1.getText().toString();
                float score6= Float.parseFloat(score6p);

                String score7p = shangji2.getText().toString();
                float score7= Float.parseFloat(score7p);

                String score8p = shangji3.getText().toString();
                float score8= Float.parseFloat(score8p);

                String score9p = shangji4.getText().toString();
                float score9= Float.parseFloat(score9p);

                String score10p = shangji5.getText().toString();
                float score10= Float.parseFloat(score10p);

                float result=score1+score2+score3+score4+score5+score6+score7+score8+score9+score10;
                String str = String.valueOf(result);
                edit_score.setText(str);

            }
        });

        button_beifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String student_id ="学号： "+intent.getStringExtra("student_id");
                String name ="姓名： "+intent.getStringExtra("name");
                String banji =  "班级： "+intent.getStringExtra("banji");
                String course_name =  "课程名： "+intent.getStringExtra("course_name");
                String score1p = "点名1： "+dianming1.getText().toString()+"分";
                String score2p = "点名2： "+dianming2.getText().toString()+"分";
                String score3p = "作业1： "+zuoye1.getText().toString()+"分";
                String score4p = "作业2： "+zuoye2.getText().toString()+"分";
                String score5p = "作业3： "+zuoye3.getText().toString()+"分";
                String score6p = "上机1： "+shangji1.getText().toString()+"分";
                String score7p = "上机2： "+shangji2.getText().toString()+"分";
                String score8p = "上机3： "+shangji3.getText().toString()+"分";
                String score9p = "上机4： "+shangji4.getText().toString()+"分";
                String score10p = "上机5： "+shangji5.getText().toString()+"分";

                float score1= Float.parseFloat(dianming1.getText().toString());
                float score2= Float.parseFloat(dianming2.getText().toString());
                float score3= Float.parseFloat(zuoye1.getText().toString());
                float score4= Float.parseFloat(zuoye2.getText().toString());
                float score5= Float.parseFloat(zuoye3.getText().toString());
                float score6= Float.parseFloat(shangji1.getText().toString());
                float score7= Float.parseFloat(shangji2.getText().toString());
                float score8= Float.parseFloat(shangji3.getText().toString());
                float score9= Float.parseFloat(shangji4.getText().toString());
                float score10= Float.parseFloat(shangji5.getText().toString());
                float result=score1+score2+score3+score4+score5+score6+score7+score8+score9+score10;
                String score = "总成绩： "+result+"分";

                String gailan="";
                if(score1!=0&&(score2!=0))
                {
                    gailan="两次点名都到了。";
                }
                if((score1==0&&score2!=0)||(score2==0&&score1!=0))
                {
                    gailan="有一次点名未到。";
                }
                if(score1==0&&score2==0)
                {
                    gailan="两点名都未到。";
                }
                int count=0;
                if(score3==0)
                {
                    count=count+1;
                }

                if(score4==0)
                {
                    count=count+1;
                }

                if(score5==0)
                {
                    count=count+1;
                }
                if(count==0)
                {
                    gailan=gailan+"\n三次作业均已提交。";
                }
                if(count==1)
                {
                    gailan=gailan+"\n有一次作业未提交。";
                }
                if(count==2)
                {
                    gailan=gailan+"\n有两次次作业未提交。";
                }
                if(count==3)
                {
                    gailan=gailan+"\n三次作业均未提交。";
                }

                int countp=0;
                if(score6==0)
                {
                    countp=countp+1;
                }
                if(score7==0)
                {
                    countp=countp+1;
                }
                if(score8==0)
                {
                    countp=countp+1;
                }
                if(score9==0)
                {
                    countp=countp+1;
                }
                if(score10==0)
                {
                    countp=countp+1;
                }

                if(countp==0)
                {
                    gailan=gailan+"\n五次上机均已完成。";
                }
                if(countp==1)
                {
                    gailan=gailan+"\n有一次上机未完成。";
                }
                if(countp==2)
                {
                    gailan=gailan+"\n有两次上机未完成。";
                }
                if(countp==3)
                {
                    gailan=gailan+"\n有三次上机未完成。";
                }
                if(countp==4)
                {
                    gailan=gailan+"\n有四次上机未完成。";
                }
                if(countp==5)
                {
                    gailan=gailan+"\n五次上机均未完成。";
                }

                String email_post = email.getText().toString();

                Intent it = new Intent(Intent.ACTION_SEND);
                it.setType("plain/text");
                String strAddressBuf[] = new String[]{email_post}; //收件人邮箱地址
                String strSubject = "学生成绩信息";
                it.putExtra(Intent.EXTRA_EMAIL, strAddressBuf);
                it.putExtra(Intent.EXTRA_SUBJECT, strSubject);
                it.putExtra(Intent.EXTRA_TEXT, student_id+"\n"+name+"\n"+banji+"\n"+course_name+"\n"+score1p+"\n"+score2p+"\n"+score3p
                        +"\n"+score4p+"\n"+score5p+"\n"+score6p+"\n"+score7p+"\n"+score8p+"\n"+score9p+"\n"+score10p+"\n"+score+"\n"
                        +"\n"+gailan+"\n");

                try
                {
                    startActivity(it);
                }catch (Exception e)
                {
                    Toast.makeText(change_student_score.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }


            }
        });



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_score_change:
                        ContentValues values = new ContentValues();
                        values.put("student_id", textView1.getText().toString());
                        values.put("score", edit_score.getText().toString());
                        db.update("student_course", values, "student_id = ? AND course_name = ? ",
                                new String[]{textView1.getText().toString(), intent.getStringExtra("course_name")});
                        Intent intentp=new Intent(change_student_score.this,student_choose_course_info.class);
                        startActivity(intentp);
                        break;
                    case R.id.button_score_back:
                        Intent intentz=new Intent(change_student_score.this,student_choose_course_info.class);
                        startActivity(intentz);
                        break;
                    default:
                }

            }
        };
        button_change.setOnClickListener(listener);
        button_back.setOnClickListener(listener);

    }
    public void init()
    {
        //获取数据库对象
        db = new CommonDatabase().getSqliteObject(change_student_score.this, "test_db");

        //绑定按钮
        button_change = findViewById(R.id.button_score_change);
        button_back = findViewById(R.id.button_score_back);
        //从上一个活动接受数据，并置上去
        intent = getIntent();

        textView1 = findViewById(R.id.t_id);
        textView1.setText(intent.getStringExtra("student_id"));
        textView2 = findViewById(R.id.t_name);
        textView2.setText(intent.getStringExtra("name"));
        textView3 = findViewById(R.id.t_banji);
        textView3.setText(intent.getStringExtra("banji"));
        textView4 = findViewById(R.id.tc_course_name);
        textView4.setText(intent.getStringExtra("course_name"));
        edit_score = findViewById(R.id.edit_score);
        edit_score.setText(intent.getStringExtra("score"));

        dianming1 = findViewById(R.id.edit_dianming1);
        dianming2 = findViewById(R.id.edit_dianming2);

        zuoye1 = findViewById(R.id.edit_zuoye1);
        zuoye2 = findViewById(R.id.edit_zuoye2);
        zuoye3 = findViewById(R.id.edit_zuoye3);

        shangji1 = findViewById(R.id.edit_shangji1);
        shangji2 = findViewById(R.id.edit_shangji2);
        shangji3 = findViewById(R.id.edit_shangji3);
        shangji4 = findViewById(R.id.edit_shangji4);
        shangji5 = findViewById(R.id.edit_shangji5);
        email=findViewById(R.id.email);

        button_jifen = findViewById(R.id.button_jifen);
        button_beifen = findViewById(R.id.button_beifen);
    }



}


