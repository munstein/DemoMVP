package com.munstein.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainMVP.IMainView{

    private MainMVP.IMainPresenter presenter;
    private List<String> stringList;
    private ArrayAdapter<String> adapter;

    @BindView(R.id.listview)
    ListView listView;

    @BindView(R.id.edittext)
    EditText editText;

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this, new MainModel());

        ButterKnife.bind(this);

        button.getText();

        stringList = presenter.getAllValues();

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, stringList);
        listView.setAdapter(adapter);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void refreshValues(List<String> values) {
        stringList = values;
        adapter.notifyDataSetChanged();
    }

    @OnClick(R.id.button)
    public void onClick(View view) {
        presenter.insertValue(editText.getText().toString());
    }
}
