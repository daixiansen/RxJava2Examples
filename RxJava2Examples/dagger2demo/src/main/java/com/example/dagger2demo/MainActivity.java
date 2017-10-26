package com.example.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.dagger2demo.bean.Pot;
import com.example.dagger2demo.component.DaggerPotComponet;
import com.example.dagger2demo.component.PotSimpleModule;
import com.jakewharton.rxbinding2.view.RxView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Pot pot;

    @BindView(R.id.bt_inject)
    Button btInject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerPotComponet.builder().potSimpleModule(new PotSimpleModule(this)).build().inject(this);

        RxView.clicks(btInject).subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                Toast.makeText(MainActivity.this, pot.getField(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
