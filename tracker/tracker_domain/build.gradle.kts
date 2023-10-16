plugins{
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.example.tracker_domain"
}

dependencies{
    // to make sure that we are able to access dependencies from our core module
    // and use core module classes and functions to onboarding_presentation module
    implementation(project(Modules.core))
    implementation(Coroutines.coroutines)
}