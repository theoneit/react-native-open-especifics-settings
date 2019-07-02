
# react-native-open-especifics-settings

This module allows us to open device-specific settings. For example, if we want to open the GPS configuration to see if it is on / off or change it, or open the Location configuration window or Wifi, battery and others.

## Getting started

`$ npm install react-native-open-especifics-settings --save`

### Mostly automatic installation

`$ react-native link react-native-open-especifics-settings`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-open-especifics-settings` and add `RNOpenEspecificsSettings.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNOpenEspecificsSettings.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNOpenEspecificsSettingsPackage;` to the imports at the top of the file
  - Add `new RNOpenEspecificsSettingsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-open-especifics-settings'
  	project(':react-native-open-especifics-settings').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-open-especifics-settings/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-open-especifics-settings')
  	```

## Usage

#### Parameter options

- 'general'
- 'location'
- 'network'
- 'security'
- 'deviceinfo'
- 'backup'
- 'sound'
- 'home'
- 'date'
- 'applications'

Note: Due to major changes to the Apple device access policy, only access to the main menu is available.

```javascript
import RNOpenEspecificsSettings from 'react-native-open-especifics-settings';

// Opens the especific settings window, example: 'location'.
RNOpenEspecificsSettings.openSettings('location')

```

## Credits

Written by [Flavio Teodosio] ([bd-arc](https://github.com/FlavioTeodosio)).

### License

 - [Apache-2.0](https://github.com/FlavioTeodosio/react-native-open-especifics-settings/LICENSE). 
