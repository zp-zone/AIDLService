package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.aidl.IPerson;
import com.example.aidl.Person;

public class PersonService extends Service {

	IPerson.Stub stub = new IPerson.Stub() {
		
		@Override
		public Person getPerson() throws RemoteException {
			return new Person();
		}
	};
	@Override
	public IBinder onBind(Intent intent) {
		return stub;
	}

}
