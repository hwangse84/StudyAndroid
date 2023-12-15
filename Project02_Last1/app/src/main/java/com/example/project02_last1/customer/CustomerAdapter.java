package com.example.project02_last1.customer;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project02_last1.common.CommonConn;
import com.example.project02_last1.databinding.FragmentCustomerBinding;
import com.example.project02_last1.databinding.ItemRecvCusBinding;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    List<CustomerVO> list;
    Context context;
    CustomerFragment fragment;


    //부모 요소가 고정이 안되어있는경우 , 콜백을 이용함.

    public CustomerAdapter(List<CustomerVO> list, Context context, CustomerFragment fragment) {
        this.list = list;
        this.context = context;
        this.fragment = fragment;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvCusBinding binding= ItemRecvCusBinding.inflate(LayoutInflater.from(context),parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.binding.tvCusId.setText(list.get(i).getCustomer_id()+"");
    h.binding.tvName.setText(list.get(i).getName()+"");

        //삭제 처리를 일단 확인.-> 삭제 처리 여부를 물어보게 수정 -> 삭제 후 자동으로 새로고침
    h.binding.btnDel.setOnClickListener(v->{//삭제버튼
        new CommonConn(context,"delete.cu").addParamMap("customer_id",list.get(i).getCustomer_id() )
                .onExcute((isResult, data) -> {
                    fragment.select("");
                });
    });

        h.binding.btnEdit.setOnClickListener(v->{// 수정
            CustomerDialog dialog = new CustomerDialog(context , list.get(i));

            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());

            // layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
            // layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            dialog.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            layoutParams.width = (int) (displayMetrics.widthPixels * 0.9);//80 비율로 맞추기
            layoutParams.height = (int) (displayMetrics.heightPixels * 0.5);//80
            dialog.getWindow().setAttributes(layoutParams);



            dialog.show();
            dialog.setOnCancelListener(dialog1 -> {
                Log.d("다이얼로그", "setOnCancelListener: ");
            });
            dialog.setOnDismissListener(dialog1 -> {
                Log.d("다이얼로그", "setOnDismissListener: ");
                fragment.select("");
            });
        });



    /*h.binding.btnEdit.setOnClickListener(v->{//수정버튼

    CustomerDialog dialog=new CustomerDialog(context,list.get(i));

    dialog.show();
    dialog.setOnCancelListener(dialog1 -> {
        Log.d("다이얼로그","setOnCancelListener");
    });
    dialog.setOnCancelListener(dialog1 -> {
        Log.d("다이얼로그","setOnCancelListener");
        fragment.select("");
    });
});*/
    }




    @Override
    public int getItemCount()
    {
        return list.size();
    }

    //1.ViewHolder( view )-> Binding을 사용해보기
    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecvCusBinding binding;//모든 위젯 종류를 씀.(사용할거)
        public ViewHolder(@NonNull ItemRecvCusBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
