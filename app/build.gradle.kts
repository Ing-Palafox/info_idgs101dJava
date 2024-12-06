plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.info_idgs101djava"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.info_idgs101djava"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //implementation 'androidx.appcompat:appcompat:1.6.1'
   // implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation ("org.postgresql:postgresql:42.6.0")
}