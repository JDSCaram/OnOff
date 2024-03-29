object AppConfig {
    const val compileSdk = 30
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 4
    const val versionName = "1.4"
    const val applicationId = "com.bodeslab.onoff"
}

object Versions {
    const val kotlin = "1.5.0"
    const val gradle = "7.0.3"
    const val supportDesign = "28.0.0"
    const val constraintLayout = "1.1.3"
    const val ktx = "1.2.0"
    const val recyclerView = "1.1.0"
    const val appcompat = "1.1.0"
    const val support = "1.2.0-alpha01"
    const val fragment = "1.2.4"
    const val hilt = "2.40.2"
    const val hiltAndroidX = "1.0.0-alpha03"
    const val javax = "1"

    const val junit = "4.12"
    const val extInstrumentation = "1.1.1"
    const val espresso = "3.2.0"

    const val lifecycle = "2.2.0"
    const val lifecycleExtension = "2.0.0"
    const val lifecycleTesting = "2.1.0"
    const val coroutines = "1.4.2"
    const val navigation = "2.3.0"
    const val lottieVersion = "3.5.0"
    const val mockk = "1.10.6"
    const val kotlinSerialization = "1.1.0"
}

object Libs {
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val supportAppCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val designSupport = "com.google.android.material:material:${Versions.support}"
    const val supportDesign = "com.android.support:design:${Versions.supportDesign}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCore = "com.google.dagger:hilt-core:${Versions.hilt}"
    const val hiltCommon = "androidx.hilt:hilt-common:${Versions.hiltAndroidX}"
    const val hiltCommonCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltAndroidX}"
    const val hiltNavigatorFragment = "androidx.hilt:hilt-navigation-fragment:${Versions.hiltAndroidX}"
    const val hiltViewModelLifeCycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltAndroidX}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val javax = "javax.inject:javax.inject:${Versions.javax}"

    const val fragmentKotlin = "androidx.fragment:fragment-ktx:${Versions.fragment}"

    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val jUnit = "junit:junit:${Versions.junit}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val extInstrumentation = "androidx.test.ext:junit:${Versions.extInstrumentation}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifeCycleExtension =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtension}"

    const val coreTesting = "androidx.arch.core:core-testing:${Versions.lifecycleTesting}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val lottie = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val mockkCore = "io.mockk:mockk:${Versions.mockk}"
    const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"

    const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}"
}

object Modules {
    const val menu = ":feature:menu"
    const val home = ":feature:home"
    const val settings = ":feature:settings"
    const val core = ":core"
}
