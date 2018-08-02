package jdsistemas.me.maximachallenge.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import jdsistemas.me.maximachallenge.activity.MainActivity;
import jdsistemas.me.maximachallenge.adapter.ProductAdapter;
import jdsistemas.me.maximachallenge.R;
import jdsistemas.me.maximachallenge.data.datasource.ProductDataSourceImpl;
import jdsistemas.me.maximachallenge.data.mock.MockDataBase;
import jdsistemas.me.maximachallenge.data.repository.ProductRepository;
import jdsistemas.me.maximachallenge.model.Product;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    /**
     * Atribute Product repository.
     *
     */
    private ProductRepository productRepository;

    /**
     * Atribute products.
     *
     */
    private List<Product> products;


    /**
     * Atribute Recycler view.
     *
     */
    private RecyclerView recyclerView;


    /**
     * Atribute Button.
     *
     */
    private Button btnStart;


    /**
     * Atribute Button.
     *
     */
    private Button btnStop;

    /**
     * Atribute counter.
     *
     */
    private TextView txtCounter;


    /**
     * Atribute count.
     *
     */
    static int count = 0;


    /**
     * Atribute my timer.
     */
    Timer myTimer;


    /**
     * Atribute Timer Task.
     */
    TimerTask doThis;


    /**
     * Atribute períod.
     *
     */
    private int period = 20000;



    /**
     * On create view .
     *
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        btnStart = view.findViewById(R.id.btnStart);
        btnStop = view.findViewById(R.id.btnStop);
        txtCounter = view.findViewById(R.id.txtCount);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragment.count = 0;

                myTimer = new Timer();

                doThis = new TimerTask() {
                    @Override
                    public void run() {
                        Log.d("COUNT", String.valueOf(++MainFragment.count));
                    }
                };
                myTimer.scheduleAtFixedRate(doThis, 0, period);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTimer.cancel();
                doThis.cancel();
                txtCounter.setVisibility(View.VISIBLE);
                txtCounter.setText(String.valueOf(MainFragment.count));
            }
        });

        return view;
    }


    /**
     * On start.
     *
     */
    @Override
    public void onStart() {
        super.onStart();
        ProductDataSourceImpl dataSource = new ProductDataSourceImpl();
        productRepository = new ProductRepository(dataSource);
        products = productRepository.listAll();
        ProductAdapter adapter = new ProductAdapter(products, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        new MockDataBase().deleteAll();
    }

}
