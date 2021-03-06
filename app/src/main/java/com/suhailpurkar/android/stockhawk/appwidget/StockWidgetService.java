/*
 * Copyright 2016.  Suhail Purkar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.suhailpurkar.android.stockhawk.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by Suhail Purkar on 11.05.16.
 * </p>
 * The service to be connected to for a remote adapter to request RemoteViews for StockWidget.
 */
public class StockWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StockWidgetFactory(getApplicationContext(), intent);
    }
}
