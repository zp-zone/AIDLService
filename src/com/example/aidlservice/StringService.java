package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.aidl.StringServiceAIDL;

/**
 * @Description  define a stub and overwrite onBind() to return this stub
 * 
 * @Date 2015-10-23 下午9:40:50
 * @Author SugarZ
 */
public class StringService extends Service {

	StringServiceAIDL.Stub stub = new StringServiceAIDL.Stub() {

		@Override
		public String getString() throws RemoteException {
			return "StringService : hello AIDL from a remote thread";
		}
	};

	@Override
	public IBinder onBind(Intent arg0) {
		return stub;
	}

}
