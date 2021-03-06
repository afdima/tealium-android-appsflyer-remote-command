package com.tealium.remotecommands.appsflyer

import android.app.Application

interface AppsFlyerTrackable {

    fun initialize(application: Application, devKey: String, configSettings: Map<String, Any>? = null)
    fun trackLocation(latitude: Double, longitude: Double)
    fun setHost(host: String, hostPrefix: String? = "")
    fun trackEvent(eventType: String, eventParameters: Map<String, Any>? = null)
    fun setUserEmails(emails: List<String>)
    fun setCurrencyCode(currency: String)
    fun setCustomerId(id: String)
    fun disableDeviceTracking(disable: Boolean)
    fun resolveDeepLinkUrls(links: List<String>)
    fun stopTracking(isTrackingStopped: Boolean)
}