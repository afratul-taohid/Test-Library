Location Helper Library
======================

[![](https://jitpack.io/v/afratul-taohid/Test-Library.svg)](https://jitpack.io/#afratul-taohid/Test-Library/0.3.0)

Android library project that intends to simplify the usage of location providers and activity recognition with a nice fluid API.

Adding to your project
----------------------

You should add this to your dependencies:

```groovy
implementation 'com.github.afratul-taohid:Test-Library:0.3.0'
```

Google Play Services compatible version: 15.0.1

## Location

### Starting

For starting the location service:

````java
LocationHelper.with(this).updateLocation(new LocationCallBack() {
            @Override
            public void onLocationCallBack(Location location) {
            }
        });
````
