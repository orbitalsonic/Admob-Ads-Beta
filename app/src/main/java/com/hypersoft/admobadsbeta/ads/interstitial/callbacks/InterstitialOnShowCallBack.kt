package com.hypersoft.admobadsbeta.ads.interstitial.callbacks

/**
 * @Author: SOHAIB AHMED
 * @Date: 05/03/2024
 * @Accounts
 *      -> https://github.com/epegasus
 *      -> https://stackoverflow.com/users/20440272/sohaib-ahmed
 */


interface InterstitialOnShowCallBack {
    fun onAdDismissedFullScreenContent() {}
    fun onAdFailedToShow()
    fun onAdShowedFullScreenContent() {}
    fun onAdImpression() {}
    fun onAdImpressionDelayed() {}
}