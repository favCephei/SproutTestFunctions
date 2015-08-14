package studiocephei.sprouttestfunctions;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentInvest extends Fragment {


    private Button mWizard;
    private Button mInvest;
    private View mView;
    private int mPictureContainerRes;


    public FragmentInvest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_invest, container, false);
        mPictureContainerRes = R.id.fragment_container_pictures;
        pictureFrag();

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


    private void pictureFrag(){
        FragmentDiagrams fragmentDiagrams = new FragmentDiagrams();
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.add(mPictureContainerRes, fragmentDiagrams).commit();

    }



}
