package org.rotaract9210.d9210events;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import org.rotaract9210.d9210events.SharedClasses.DBHelper;

public class AboutActivity extends AppCompatActivity {

    String eventName, eventDescription,eventTitle;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        eventName = getIntent().getStringExtra("name");
        eventTitle = getIntent().getStringExtra("profession");
        eventDescription = getIntent().getStringExtra("bio_brief");

        TextView tvEventName, tvTitle;
        ImageView ivEventPic;

        ivEventPic = (ImageView)findViewById(R.id.ivAbout_Event_Pic);
        tvEventName = (TextView)findViewById(R.id.tvAbout_Event_Name);
        tvEventName.setText(eventName);

        tvTitle = (TextView)findViewById(R.id.tvAbout_Title);
        tvTitle.setText(eventTitle);


        mWebView = (WebView) findViewById(R.id.webview);

        //Typeface tf =l;
        String ttext = "<html><body>"
                + eventDescription
                + "</body></html>";

        mWebView.loadData(ttext, "text/html", "utf-8");

        if (getIntent().getIntExtra("pic",0) != 0){
            ivEventPic.setImageResource(getIntent().getIntExtra("pic", 0));
            ivEventPic.setBackgroundColor(0);
        }
    }
}
