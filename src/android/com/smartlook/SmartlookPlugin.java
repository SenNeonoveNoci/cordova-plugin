package com.achilles;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import com.smartlook.sdk.smartlook.Smartlook;

import android.util.Log;

import java.util.Date;

public class SmartlookPlugin extends CordovaPlugin {
  private static final String TAG = "SmartlookPlugin";

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("init")) {
      for(int i=0; i <1000; i++) {
        Log.d(TAG, "init run from Cordova");
      } 

        cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
              Smartlook.init("c8d68fc8cfc145993b983d4404f85f8d4ff59773", cordova.getActivity);
              Smartlook.enableWebviewRecording(true);
              callbackContext.success();
            }
        });
      return true;
    }

    return false;
  }
}