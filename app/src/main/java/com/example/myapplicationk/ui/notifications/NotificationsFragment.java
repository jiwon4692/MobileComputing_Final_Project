package com.example.myapplicationk.ui.notifications;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationk.R;
import com.example.myapplicationk.databinding.FragmentNotificationsBinding;
import com.example.myapplicationk.ui.home.HomeViewModel;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;
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

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_notifications, container, false);
        //Button button = (Button) view.findViewById(R.id.buttontest);

        //Button button1 = view.findViewById(R.id.buttontest2);
        TextView textinfo = (TextView) view.findViewById(R.id.infoscript1);
        TextView textinfo2 = (TextView) view.findViewById(R.id.infoscript2);
        TextView textinfo3 = (TextView) view.findViewById(R.id.infoscript3);
        ImageView imagetest = (ImageView) view.findViewById(R.id.imageView4);

        imagetest.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                final EditText edittext = new EditText(getActivity());
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setView(edittext);
                dlg.setTitle("반려동물의 몸무게를 입력해주세요.");
                dlg.setPositiveButton("입력", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dlg.show();
                //Toast.makeText(context, "맞춤 급여량 테스트하기", Toast.LENGTH_SHORT).show();
            }
        });

        //정보글2 클릭이벤트
        textinfo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //클릭시 팝업창 생성
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setTitle("고양이 혀, 사실은 뜨거운 음식을 잘 못 먹는다?");
                dlg.setMessage("\n" +"고양이 혀 질감은 굉장히 까끌까끌하죠. 뭐든 잘 먹을 것만 같은 고양이지만, \n" +
                        "사실은 단맛을 못 느끼고 뜨거운 음식도 잘 못 먹는다고 합니다. 고양이 혀에 대한 구조와 그 이유에 대해 알아볼까요?"+"\n");
                dlg.show();
                Toast.makeText(context, "정보글 2가 클릭되었습니다", Toast.LENGTH_SHORT).show();
            }});

    //정보글3 클릭이벤트
        textinfo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setTitle("새끼 고양이 몇 주 정도 됐을까? 돌보는 방법은?");
                dlg.setMessage("\n" +"꼬물꼬물 귀여운 아기 고양이, 태어난 지 몇 주 정도 됐는지 아는 건 너무 어려운데요. " +
                                "성장하며 달라지는 신체 특징이나 체중 등을 통해 대략적으로 새끼 고양이 " +
                                "몇 주 됐는지 구분할 수 있습니다. 새끼 고양이의 시기별 특징과 함께 돌보는 방법도 알아보아요."+"\n" );

                dlg.show();
                Toast.makeText(context, "정보글 3이 클릭되었습니다", Toast.LENGTH_SHORT).show();
            }});

    //정보글1 클릭이벤트
        textinfo.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setTitle("고양이 양치 언제부터? 양치질 방법과 Tip!");
                dlg.setMessage("\n" +
                        "고양이는 3세 이상이 되면 약 80% 이상이 치주 질환에 걸릴 정도로 치아 건강에 문제가 생기기 쉽다. " +
                        "이를 방지하기 위해서 고양이 양치는 필수적이다. 그렇다면 고양이 양치는 언제부터 시작해야 할까? " +
                        "양치질을 익숙하게 만드는 방법과 팁을 알아보자."+"\n");

                dlg.show();
                //종료 코드 누르면종료
                /*FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(NotificationsFragment.this).commit();
                fragmentManager.popBackStack();*/


                Toast.makeText(context, "정보글 1이 클릭되었습니다", Toast.LENGTH_SHORT).show();


            }
        });


    return view;

    }

    public void onClick(View v) {



    }




    @Override

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}