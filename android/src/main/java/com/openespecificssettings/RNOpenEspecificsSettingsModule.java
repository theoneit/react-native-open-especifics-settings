
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
  public void openSettings(Settings) {

    Intent intent = new Intent();

    switch (Settings) {
      case 'general':
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", reactContext.getPackageName(), null);
        intent.setData(uri);
        break;
      case 'location':
        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        break;
      case 'network':
        Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
        break;
      case 'security':
        Intent intent = new Intent(Settings.ACTION_SECURITY_SETTINGS);
        break;
      default:
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", reactContext.getPackageName(), null);
        intent.setData(uri);
      }
    }  
    
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intent);
  }

}