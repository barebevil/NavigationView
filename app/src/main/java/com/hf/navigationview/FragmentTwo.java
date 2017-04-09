package com.hf.navigationview;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    WebView mWebView;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_two, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview);
//        mWebView.loadUrl("stss10.bitballoon.com");
        mWebView.loadUrl("http://www.google.co.uk");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
    }
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_two, container, false);
    }


