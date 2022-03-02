# gradle
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](http://www.opensource.org/licenses/MIT)
[![CI](https://github.com/upasanabnsl/gradle/actions/workflows/CI.yml/badge.svg)](https://github.com/upasanabnsl/gradle/actions/workflows/CI.yml)
[![Appveyor build status](https://ci.appveyor.com/api/projects/status/github/upasanabnsl/gradle?svg=true)](https://ci.appveyor.com/project/upasanabnsl/gradle)
[![codecov](https://codecov.io/gh/upasanabnsl/gradle/branch/master/graph/badge.svg)](https://codecov.io/gh/upasanabnsl/gradle)

### About



Features:
* Feature 1
* Feature 2

##### Summary

* Configuration: `gradle`
* Tasks:
    - `task1` - brief task description       

### Setup


[![Gradle Plugin Portal](https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/org.uscs.com/gradle/org.uscs.com.gradle.gradle.plugin/maven-metadata.xml.svg?colorB=007ec6&label=plugins%20portal)](https://plugins.gradle.org/plugin/org.uscs.com.gradle)

```groovy
plugins {
    id 'org.uscs.com.gradle' version '0.1.0'
}
```

OR

```groovy
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath 'org.uscs.com:gradle:0.1.0'
    }
}
apply plugin: 'org.uscs.com.gradle'
``` 

### Usage

---
[![gradle plugin generator](http://img.shields.io/badge/Powered%20by-%20Gradle%20plugin%20generator-green.svg?style=flat-square)](https://github.com/xvik/generator-gradle-plugin)
