# 24012021073_MAD_PRACTICAL_6

This repository contains an Android application built with Kotlin that demonstrates animated splash and main screen transitions. The app is designed as a mobile practical project for learning Android UI animation and activity flow.

## Project Overview

The application starts with a splash screen that shows a UVPCE logo animation and then navigates to the main activity. In the main screen, an animated alarm image sequence is displayed using frame-by-frame drawable animation.

## Features

- Splash screen with custom animation
- Transition from SplashActivity to MainActivity
- Alarm animation in the main activity
- Edge-to-edge layout support using Android WindowInsets
- Simple Android app structure using Kotlin and AndroidX

## App Structure

```text
24012021073_MAD_PRACTICAL_6/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/a24012021073_mad_practical_6/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   └── SplashActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_splash.xml
│   │   │   │   └── values/
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── gradle.properties
└── README.md
```

## Activities

### SplashActivity
- Displays the UVPCE logo animation
- Runs a twink animation and transitions to the main activity

### MainActivity
- Displays an animated alarm sequence
- Starts the alarm animation when the window receives focus

## Technologies Used

- Kotlin
- Android SDK
- AndroidX
- Material Components
- Gradle

## Prerequisites

Before running this project, make sure you have:

- Android Studio installed
- JDK configured for Android development
- An emulator or a physical Android device

## How to Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Let Gradle sync the project.
4. Select an emulator or connected device.
5. Click Run to install and launch the app.

## Build Configuration

This project uses the following basic configuration:

- Application ID: `com.example.a24012021073_mad_practical_6`
- Minimum SDK: 24
- Target SDK: 36
- Compile SDK: 36
- Java compatibility: Java 11

## Learning Objective

This practical helps understand:

- Android activity lifecycle
- Splash screen implementation
- Drawable animation using `AnimationDrawable`
- Layout and resource usage in Android
- Basic navigation between activities

## License

This project is intended for educational and practical learning purposes.

## Author

Arjun59a
