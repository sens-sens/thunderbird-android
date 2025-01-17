plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
}

android {
    namespace = "app.k9mail.feature.funding.googleplay"
    resourcePrefix = "funding_googleplay_"
}

dependencies {
    api(projects.feature.funding.api)

    implementation(projects.core.ui.compose.designsystem)

    implementation(libs.android.billing)
    implementation(libs.android.billing.ktx)
}
