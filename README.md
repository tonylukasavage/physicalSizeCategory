> **IMPORTANT: This project is obsolete. This functionality has since been implemented by the [Titanium.Platform.Android.physicalSizeCategory](http://docs.appcelerator.com/titanium/latest/#!/api/Titanium.Platform.Android-property-physicalSizeCategory) property in Titanium.**

## physicalSizeCategory

This is a Titanium native module for Android that allows you to determine the physical size categorization of a mobile device at runtime. The possible returned values map to those indicated in the Android Developer documentation on [supporting multipe screens](http://developer.android.com/guide/practices/screens_support.html). Please read through that document to see what criteria Android applies to the device to determine categorization. 

## Basic Sample

### add to tiapp.xml
```xml
<modules>
	<module platform="android" version="1.0">ti.physicalSizeCategory</module>
</modules>
```

### app.js
```javascript
var mod = require('ti.physicalSizeCategory');
swicth(mod.physicalSizeCategory) {
	case 'small':
		// do 'small' code
		break;
	case 'normal':
		// do 'normal' code
		break;
	case 'large':
		// do 'large' code
		break;
	case 'xlarge':
		// do 'xlarge' code
		break;
}
```
