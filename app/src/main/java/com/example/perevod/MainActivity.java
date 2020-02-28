package com.example.perevod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.hello)
    TextView hello;
    @BindView(R.id.oword)
    EditText word;
    @BindView(R.id.trword)
    EditText trword;
    @BindView(R.id.addbtn)
    Button addButton;
    @BindView(R.id.word_content)
    ViewGroup container;
    @BindView(R.id.hint_recycler)
    RecyclerView hintRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.addbtn)
    public void onLoginClick() {

    }
}
