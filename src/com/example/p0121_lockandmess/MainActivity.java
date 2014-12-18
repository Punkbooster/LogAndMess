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
		Log.d(TAG, "������ View-��������");
		tvOut = (TextView)findViewById(R.id.tvOut);
		btnOK = (Button)findViewById(R.id.btnOk);
		btnCancel = (Button)findViewById(R.id.btnCancel);
		
		 // ����������� ���������� �������
	    Log.d(TAG, "����������� ���������� �������");
	    btnOK.setOnClickListener(this);
	    btnCancel.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		  // �� id ���������� ������, ��������� ���� ����������
		    Log.d(TAG, "�� id ���������� ������, ��������� ���� ����������");
	    switch (v.getId()) {
	    case R.id.btnOk:
	      // ������ ��
	      tvOut.setText("������ ������ ��");
	      break;
	    case R.id.btnCancel:
	      // ������ Cancel
	      tvOut.setText("������ ������ Cancel");
	      break;
	    }
	  }
}

	