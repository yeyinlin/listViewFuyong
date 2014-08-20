package com.stormdzh.listviewfuyong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	private ArrayList<String> list;
	private LayoutInflater inflater;
	private Context context;
	 public static Map<Integer, Boolean> isSelected;
	public MyAdapter(Context context, ArrayList<String> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
		this.context=context;
		inflater=LayoutInflater.from(context);
		init();
	}
	
	 private void init() {    
	        //这儿定义isSelected这个map是记录每个listitem的状态，初始状态全部为false。    
	        isSelected = new HashMap<Integer, Boolean>();    
	        for (int i = 0; i < list.size(); i++) {    
	            isSelected.put(i, false);    
	        }    
	    }    

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view;
		ViewHolder holder;
		if(convertView==null){
			holder=new ViewHolder();
			convertView=inflater.inflate(R.layout.item_person, null);
			holder.tv_name=(TextView) convertView.findViewById(R.id.tv_name);
			holder.ck_person=(CheckBox) convertView.findViewById(R.id.ck_person);
			holder.ll_item=(RelativeLayout) convertView.findViewById(R.id.ll_item);
			 convertView.setTag(holder);
		}else{
			 holder=(ViewHolder) convertView.getTag();
		}
		if(list.get(position)!=null){
			holder.tv_name.setText(list.get(position));
			holder.ck_person.setChecked(isSelected.get(position));
		}
		if(isSelected.get(position)){
			holder.ll_item.setBackgroundColor(Color.RED);
		}else{
			holder.ll_item.setBackgroundColor(Color.WHITE);
		}
		
		
		return convertView;
	}
	
	

}
