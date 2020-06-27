package com.example.tallerproyectos.ui.dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tallerproyectos.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    public void onCl(View view) {
        Uri uri = Uri.parse("https://l.facebook.com/l.php?u=https%3A%2F%2Fweb-chat.global.assistant.watson.cloud.ibm.com%2Fpreview.html%3Fregion%3Deu-gb%26integrationID%3D76801cae-2708-4aad-9ef2-c53ec41f5b56%26serviceInstanceID%3Df6a38ca3-bdf3-4497-95aa-af36%26fbclid%3DIwAR0CvEroVMw8ZgTNd7gIItkTMJ5GHKqYkbZaop0bdUb75qetf2IRLSJh01U&h=AT0GT-5H3pwsIPbsbNw2UT5qQe4DB4ywKU9XGVybSCpx4Z7x9lpfFtUXJPy8l1d54n7Fk31jYZoxql655qVJXCLv9czjRvoDcwdg0ljPTK80c-4OKC0T3p3jNq3VgkNF05mA6g");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}