package cn.edu.gdmec.android.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jack on 2017/12/6.
 */

public class LeftFragment extends android.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate ( R.layout.left_fragment, container, false );
        return view;
    }
}
