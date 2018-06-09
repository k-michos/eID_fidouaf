package org.ebayopensource.fidouaf.stats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;

import org.ebayopensource.fido.uaf.storage.AuthenticatorRecord;
import org.ebayopensource.fidouaf.stats.History_Auth_Object;

public class Auth_Reqs {

	public static String LAST_REG_REQ = "LAST_REG_REQ";
	public static String LAST_REG_RES = "LAST_REG_RES";
	public static String LAST_AUTH_REQ = "LAST_AUTH_REQ";
	public static String LAST_AUTH_RES = "LAST_AUTH_RES";
	public static String LAST_DEREG_REQ = "LAST_DEREG_REQ";
	
	private static Auth_Reqs instance = new Auth_Reqs();
	public Map<String, Object> auth_reqs = new  HashMap<String, Object>();
	public List<History_Auth_Object> history_auth_resp = new ArrayList<History_Auth_Object>(100);
	//public AuthenticatorRecord() auth_req = new AuthenticatorRecord();
	
	private Auth_Reqs (){
		//Init
	}

	public static Auth_Reqs getAuth (){
		return instance;
	}
	
/*	public void add_auth(Object x) {
		if (history_auth_resp.size() >99){
			history_auth_resp.remove(0);
		}
		history_auth_resp.add(x);
		
	}*/
	public void add(History_Auth_Object o){
		if (history_auth_resp.size() >99){
			history_auth_resp.remove(0);
		}
		/*History_Auth_Object current_auth = new History_Auth_Object();
		Timestamp auth_time = new Timestamp(System.currentTimeMillis());
		if (o.status.equals("SUCCESS")) {
			
			current_auth.auth_time = auth_time;
			current_auth.AAID = o.AAID;
			current_auth.deviceId = o.deviceId;
			current_auth.KeyID=o.KeyID;
			current_auth.username= o.username;
			current_auth.status= o.status;
		}
		history_auth_resp.add(current_auth);*/
		history_auth_resp.add(o);
	}
	
}