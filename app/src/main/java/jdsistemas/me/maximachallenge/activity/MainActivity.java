package jdsistemas.me.maximachallenge.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import jdsistemas.me.maximachallenge.R;
import jdsistemas.me.maximachallenge.data.mock.MockDataBase;
import jdsistemas.me.maximachallenge.fragment.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MockDataBase().populateDataBase();
        onCreateFragment();
    }

    private void onCreateFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.content_main, new MainFragment());
        ft.commit();
    }
}
