
package com.openespecificssettings;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNOpenEspecificsSettingsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNOpenEspecificsSettingsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNOpenEspecificsSettings";
  }

  @ReactMethod
  public void open() {
     
      Intent intent = new Intent();
      intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
      Uri uri = Uri.fromParts("package", reactContext.getPackageName(), null);
      intent.setData(uri);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      reactContext.startActivity(intent);

  }

  @ReactMethod
  public void openGPS() {

      Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      reactContext.startActivity(intent);

  }

  @ReactMethod
  public void openWiFi() {

      Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      reactContext.startActivity(intent);

  }

  @ReactMethod
  public void openSecurity() {

      Intent intent = new Intent(Settings.ACTION_SECURITY_SETTINGS);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      reactContext.startActivity(intent);

  }




}