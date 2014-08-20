package com.stormdzh.listviewfuyong;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lv_listview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv_listview=(ListView) findViewById(R.id.lv_listview);
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0;i<100;i++){
			list.add("条目"+i);
		}
		
		
		MyAdapter adapter=new MyAdapter(this,list);
		
		lv_listview.setAdapter(adapter);
		MyOnitemclickListener listener=new MyOnitemclickListener(this,list);
		lv_listview.setOnItemClickListener(listener);
	}
	
	
}
