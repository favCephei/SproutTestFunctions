package studiocephei.sprouttestfunctions;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentDiagrams extends Fragment {


    private View mView;
    private Bitmap mBitmap;
    private ImageView mImgContainer;


    public FragmentDiagrams() {
        // Required empty public constructor
    }


    public static FragmentDiagrams getInstance(int position) {
        FragmentDiagrams fragmentDiagrams = new FragmentDiagrams();
        return fragmentDiagrams;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_diagrams, container, false);
        mImgContainer = (ImageView)mView.findViewById(R.id.img_container);
        return mView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
    



}
