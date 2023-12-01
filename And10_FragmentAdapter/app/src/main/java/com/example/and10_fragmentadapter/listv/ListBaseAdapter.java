package com.example.and10_fragmentadapter.listv;
//1.상속을 받는다(일반->어댑터로 ~)
//많은 어뎁터중 가장 기본적인 어뎁터 : BaseAdapter

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.and10_fragmentadapter.R;

public class ListBaseAdapter extends BaseAdapter {
    //BaseAdapter의 경우 ,LayoutInflater사용이 바로x->상위 클래스에서 받아옴
    //몇개의 아이템이 있는지:getView();:칸에LayoutInflater를 이용해서 레이아웃을 붙이는 처리함
    LayoutInflater inflater;

    public ListBaseAdapter(LayoutInflater inflater) {
        this.inflater=inflater;
    }

    public void setInflater(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 5;
    }


//외부에서 해당 칸의 데이터를 이용해야할떄  사용하느 메소드(큰의미는 없기때문에 position return)
    @Override
    public Object getItem(int position) {
        return position;
    }
//한칸의 아이템의 식별자(position은 중복x)
    @Override
    public long getItemId(int position) {
        return position;
    }
//getCount의 return숫자만큼 반복하면서 아이템을 붙이는 처르를 하는 공간
    //position:getView메소드는 계속해서 반복함(gerCount의 개수만큼!),스크롤, index
    //convertView :내가 붙이고 나서 제어를 위해 사용할 변수(이벤트)
    //parent : 칸(getCo                  ????
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.fragment_my3,parent,false);

        return convertView;
    }
}
