package com.ti.webview;

import android.app.Application;
import android.webkit.WebView;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WebView webView = new WebView(getApplicationContext());
        webView.loadUrl("http://zhidao.baidu.com/?idx=30000&ssid=0&from=844b&bd_page_type=1&uid=0&pu=sz%401321_1001%2Cta%40utouch_2_8.0_24_71.0&itj=34&device=mobile");
    }
}
