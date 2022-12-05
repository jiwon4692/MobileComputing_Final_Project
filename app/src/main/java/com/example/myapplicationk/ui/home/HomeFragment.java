package com.example.myapplicationk.ui.home;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationk.MainActivity;
import com.example.myapplicationk.R;
import com.example.myapplicationk.databinding.FragmentHomeBinding;
import com.example.myapplicationk.databinding.FragmentSettingBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private Context context;
    public interface onBackPressedListener {
        void onBackPressed();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        context = container.getContext();
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        Button buttonreset = (Button) view.findViewById(R.id.buttonreset);
        CheckBox checkbox = (CheckBox) view.findViewById(R.id.checkBox);
        CheckBox checkbox2 = (CheckBox) view.findViewById(R.id.checkBox2);
        CheckBox checkbox3 = (CheckBox) view.findViewById(R.id.checkBox3);

        buttonreset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                checkbox.setChecked(false);
                checkbox2.setChecked(false);
                checkbox3.setChecked(false);
                Toast.makeText(context, "초기화되었습니다.", Toast.LENGTH_SHORT).show();
            }

        });

        return view;
    }
}