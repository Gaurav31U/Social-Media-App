plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
    kotlin("kapt")
}

android {
    namespace = "com.demonic.socialmedia"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.demonic.socialmedia"
        minSdk = 29
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Coroutines
    implementation(libs.kotlinx.coroutines.core) // Or specify a version directly, e.g., "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3"
    implementation(libs.kotlinx.coroutines.android) // For Android specific main dispatcher

    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.compiler){
        exclude(group = "com.intellij", module = "annotations")
    }
    kapt(libs.androidx.room.compiler)

    // Lifecycle scopes
    implementation(libs.androidx.lifecycle.viewmodel.ktx) // For ViewModelScope
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
}