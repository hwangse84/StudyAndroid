plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.project02_last"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.project02_last"
        minSdk = 24
        targetSdk = 33
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

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //Retrofit Core:http요청을 쉽게하기위한 library
    implementation group: 'com.squareup.retrofit2', name: 'retrofit', version: '2.9.0'

    //단일행 데이터를 받기위한 컨버터:컨버터 종류중 사용법 제일 단순!
    implementation group: 'com.squareup.retrofit2', name: 'converter-scalars', version: '2.9.0'

    //String Json을객체로 변환 또는 객체를 String Json으로 변환
    implementation group: 'com.google.code.gson', name: 'gson', version: '2.8.9'
}