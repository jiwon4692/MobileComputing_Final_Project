package com.example.myapplicationk.ui.setting;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationk.R;
import com.example.myapplicationk.databinding.FragmentSettingBinding;

public class SettingFragment extends Fragment {

    private FragmentSettingBinding binding;
    private Context context;
    public interface onBackPressedListener {
        void onBackPressed();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SettingViewModel settingViewModel =
                new ViewModelProvider(this).get(SettingViewModel.class);

        context = container.getContext();

        binding = FragmentSettingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_setting, container, false);

        Button buttoncreate = (Button) view.findViewById(R.id.button_createroom);
        Button buttonenter = (Button) view.findViewById(R.id.button_enterroom);
        Button buttonedit = (Button) view.findViewById(R.id.button_editprofile);

        buttoncreate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                final EditText edittext = new EditText(getActivity());
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setView(edittext);
                dlg.setTitle("반려 동물 이름을 입력해주세요.");
                dlg.setPositiveButton("입력", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dlg.show();
            }
        });

        buttonenter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                final EditText edittext = new EditText(getActivity());
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setView(edittext);
                dlg.setTitle("방 코드를 입력해주세요.");
                dlg.setPositiveButton("입력", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dlg.show();
            }
        });

        buttonedit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(context, "구현중입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}