#import "RNOpenEspecificsSettings.h"

@implementation RNOpenEspecificsSettings

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE(RNOpenEspecificsSettings)

RCT_EXPORT_METHOD(openSettings:(NSString *)value){
    dispatch_async(dispatch_get_main_queue(), ^{

       [[UIApplication sharedApplication] openURL:[NSURL URLWithString:UIApplicationOpenSettingsURLString]];
       
    });
}

RCT_EXPORT_METHOD(openSettingsGPS:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:UIApplicationOpenSettingsURLString]];

    dispatch_async(dispatch_get_main_queue(), ^{      
        BOOL locationServicesEnabled = [CLLocationManager locationServicesEnabled];
        resolve(@(locationServicesEnabled));
     });
}


@end
