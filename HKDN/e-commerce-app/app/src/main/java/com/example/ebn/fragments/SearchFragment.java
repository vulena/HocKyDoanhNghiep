package com.example.ebn.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ebn.R;
import com.example.ebn.adapters.ProductAdapter;
import com.example.ebn.entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerViewProduct;
    private ProductAdapter mProductAdapter;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private List<Product> getListProduct() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(R.drawable.hoaithanh,R.drawable.ic_home_24,"Nguyen Hoai Thanh", "Uncountable"));
        list.add(new Product(R.drawable.hoaithanh,R.drawable.ic_home_24,"Nguyen Hoai Thanh", "Uncountable"));
        list.add(new Product(R.drawable.hoaithanh,R.drawable.ic_home_24,"Nguyen Hoai Thanh", "Uncountable"));
        list.add(new Product(R.drawable.hoaithanh,R.drawable.ic_home_24,"Nguyen Hoai Thanh", "Uncountable"));

        return list;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        recyclerViewProduct = view.findViewById(R.id.rcv_product);
        mProductAdapter = new ProductAdapter(getContext());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerViewProduct.setLayoutManager(gridLayoutManager);

        mProductAdapter.setData(getListProduct());
        recyclerViewProduct.setAdapter(mProductAdapter);

        return view;
    }


}