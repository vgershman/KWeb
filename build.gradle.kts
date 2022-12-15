plugins {
    kotlin("js") version "1.7.21"
    kotlin("plugin.serialization") version "1.7.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()


}




dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.346")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.346")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.9.3-pre.346")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.3.0-pre.346")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:+")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation(npm("formik","2.0.4"))
    implementation(npm("bootstrap",""))
    //implementation(npm("react-google-recaptcha","2.1.0"))
    //implementation(npm("react-google-recaptcha-v3","1.10.1"))

    implementation(npm("react-simple-captcha", "9.0.1"))
    implementation(npm("buffer", "6.0.3"))



//    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:+")


}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}