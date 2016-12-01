/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package afirsraftgarrier.demoandroid.androidapi.view;

import afirsraftgarrier.demoandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

/**
 * Demonstrates the use of non-focusable views.
 */
public class Focus1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.focus_1);

        WebView webView = (WebView) findViewById(R.id.rssWebView);
        webView.loadData(
                        "<html><body>Can I focus?<br /><a href=\"#\">No I cannot!</a>.</body></html>",
                        "text/html", null);

        ListView listView = (ListView) findViewById(R.id.rssListView);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, 
                new String[] {"Ars Technica", "Slashdot", "GameKult"}));
    }
}