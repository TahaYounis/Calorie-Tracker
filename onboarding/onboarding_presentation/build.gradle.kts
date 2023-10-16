plugins{
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.example.onboarding_presentation"
}

dependencies{
    // to make sure that we are able to access dependencies from our core module
    // and use core module classes and functions to onboarding_presentation module
    implementation(project(Modules.core))
    implementation(project(Modules.coreUI))
    implementation(project(Modules.onboardingDomain)) // to access to onboarding_domain module
}