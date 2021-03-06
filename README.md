Location Helper Library by NerdGeeks Team
======================

[![](https://jitpack.io/v/afratul-taohid/Test-Library.svg)](https://jitpack.io/#afratul-taohid/Test-Library/0.3.0)

Android library project that intends to simplify the usage of location providers and activity recognition with a nice fluid API.

Adding to your project
----------------------
Add maven to project

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

then You should add this to your dependencies:

```groovy
dependencies {
      implementation 'com.github.afratul-taohid:Test-Library:0.3.0'
}
```

Google Play Services compatible version: 15.0.1

## Location

### Starting

For starting the location service:

````java
LocationHelper.with(this).updateLocation(new LocationCallBack() {
      @Override
      public void onLocationCallBack(Location location) {
            //here are your location
      }
});
````

Pass The Request Permission Result
````java
@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    LocationHelper.with(this).onRequestPermissionsResult(requestCode, permissions, grantResults);
}
````
Pass The Activity Result
````java
@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
    LocationHelper.with(this).onActivityResult(requestCode,resultCode,data);
}
````

## NerdGeeeks Team
