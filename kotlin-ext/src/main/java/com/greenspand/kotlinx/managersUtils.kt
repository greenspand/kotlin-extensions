@file:JvmName("ManagerUtils")

/* ktlint-disable no-wildcard-imports */

package com.greenspand.kotlinx

import android.net.wifi.WifiConfiguration

inline fun wifiConfiguration(func: WifiConfiguration.() -> Unit): WifiConfiguration {
    val config = WifiConfiguration()
    config.func()
    return config.apply(func)
}