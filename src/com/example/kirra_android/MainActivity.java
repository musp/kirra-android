package com.example.kirra_android;

import java.util.ArrayList;
import java.util.List;

import com.abstratt.kirra.Entity;
import com.abstratt.kirra.Schema;
import com.abstratt.kirra.sampledata.Expenses;

import dados.ItemSuporte;
import dados.itemListViewEntidade;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		carregaListViewEntidade();		
	}
	
	private void carregaListViewEntidade(){
		Schema schema = new Expenses().getSchema();
		ListView lvwEntidade = (ListView) findViewById(R.id.lvwEntidade);
		List<Entity> labels = schema.getAllEntities();
		ArrayList<itemListViewEntidade> itemListViewEntidades = new ArrayList<itemListViewEntidade>();
		itemListViewEntidade entidade = new itemListViewEntidade();
		
		
		for (Entity entity : labels) {
			entidade.setName(entity.getLabel());
			entidade.setDescription(("description "+entity.getLabel()));
			itemListViewEntidades.add(entidade);
		}
		AdapterListViewEntidade teste = new AdapterListViewEntidade(this, itemListViewEntidades);
		
		lvwEntidade.setAdapter(teste);
	}
	
}
