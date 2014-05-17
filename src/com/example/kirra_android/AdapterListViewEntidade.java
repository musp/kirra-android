package com.example.kirra_android;

import java.util.ArrayList;
import java.util.List;

import dados.ItemSuporte;
import dados.itemListViewEntidade;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterListViewEntidade extends BaseAdapter {

	Context c;
    ArrayList<itemListViewEntidade> objects;
    
    public AdapterListViewEntidade(Context context, ArrayList<itemListViewEntidade> itemListViewEntidades) {
        super();
        this.c = context;
        this.objects = itemListViewEntidades;
    }
    
	@Override
	public int getCount() {
		return objects.size();
	}

	@Override
	public Object getItem(int position) {
		return objects.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ItemSuporte itensCompativelComLista_entidade = new ItemSuporte(); 

		if (convertView == null) { 
			LayoutInflater inflater = ((Activity) c).getLayoutInflater();
			convertView = inflater.inflate(R.layout.list_view_entidade_layout, parent, false);
			itensCompativelComLista_entidade.setTextViewEntityName((TextView) convertView.findViewById(R.id.textViewEntityName));
			itensCompativelComLista_entidade.setTextViewEntityDescrition((TextView) convertView.findViewById(R.id.textViewEntityDescrition));
			convertView.setTag(itensCompativelComLista_entidade); 
		} 
		else { 
			itensCompativelComLista_entidade = (ItemSuporte) convertView.getTag(); 
		} 
		
		return convertView;
	}

}
