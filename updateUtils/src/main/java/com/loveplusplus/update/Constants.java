package com.loveplusplus.update;

class Constants {


    // json {"url":"http://192.168.205.33:8080/Hello/app_v3.0.1_Other_20150116.apk","versionCode":2,"updateMessage":"版本更新信息"}

   /* static final String APK_DOWNLOAD_URL = "url";
    static final String APK_UPDATE_CONTENT = "updateMessage";
    static final String APK_VERSION_CODE = "versionCode";*/


   //{"updateInfo":"....","version":"V1.1.01","downloadUrl":"http:\/\/106.55.254.48\/static\/xy_v1101.apk"}
    static final String APK_DOWNLOAD_URL = "downloadUrl";
    static final String APK_UPDATE_CONTENT = "updateInfo";
    static final String APK_VERSION_CODE = "version";


    static final int TYPE_NOTIFICATION = 2;

    static final int TYPE_DIALOG = 1;

    static final String TAG = "UpdateChecker";

    //static final String UPDATE_URL = "https://raw.githubusercontent.com/feicien/android-auto-update/develop/extras/update.json";
    static final String UPDATE_URL = "http://124.222.198.85/log/smartsport.json";
}
