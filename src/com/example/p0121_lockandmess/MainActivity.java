package com.example.p0121_lockandmess;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	 private static final String TAG = "myLogs";
	
	TextView tvOut;
	Button btnOK;
	Button btnCancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
		// znajdemo View Element
		Log.d(TAG, "найдем View-элементы");
		tvOut = (TextView)findViewById(R.id.tvOut);
		btnOK = (Button)findViewById(R.id.btnOk);
		btnCancel = (Button)findViewById(R.id.btnCancel);
		
		 // присваиваем обработчик кнопкам
	    Log.d(TAG, "присваиваем обработчик кнопкам");
	    btnOK.setOnClickListener(this);
	    btnCancel.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		  // по id определяем кнопку, вызвавшую этот обработчик
		    Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
	    switch (v.getId()) {
	    case R.id.btnOk:
	      // кнопка ОК
	      tvOut.setText("Нажата кнопка ОК");
	      break;
	    case R.id.btnCancel:
	      // кнопка Cancel
	      tvOut.setText("Нажата кнопка Cancel");
	      break;
	    }
	  }
}

	