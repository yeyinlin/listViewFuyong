package com.stormdzh.listviewfuyong;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.AdapterView.OnItemClickListener;

public class MyOnitemclickListener implements OnItemClickListener{

	private ArrayList<String> list;
	private Context context;
	public MyOnitemclickListener(MainActivity mainActivity,
			ArrayList<String> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
		this.context=context;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		View tempView=parent.getChildAt(position);
		CheckBox ck_person = (CheckBox) view.findViewById(R.id.ck_person);
		ViewHolder viewHolder = (ViewHolder) view.getTag();
		//需要判断是不是已经点击了
		viewHolder.ck_person.setChecked(!MyAdapter.isSelected.get(position));
		boolean check = viewHolder.ck_person.isChecked();
		MyAdapter.isSelected.put(position, check);
		if(check){
			viewHolder.ll_item.setBackgroundColor(Color.RED);
		}else{
			viewHolder.ll_item.setBackgroundColor(Color.WHITE);
		}

	}

}
