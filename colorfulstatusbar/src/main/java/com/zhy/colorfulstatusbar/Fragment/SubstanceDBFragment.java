package com.zhy.colorfulstatusbar.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.colorfulstatusbar.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SubstanceDBFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SubstanceDBFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SubstanceDBFragment extends Fragment {

    public SubstanceDBFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_substance_db, container, false);
    }


}
