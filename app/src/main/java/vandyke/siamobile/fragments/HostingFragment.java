package vandyke.siamobile.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import vandyke.siamobile.MainActivity;
import vandyke.siamobile.R;

public class HostingFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hosting, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Hosting");
        return v;
    }
}
