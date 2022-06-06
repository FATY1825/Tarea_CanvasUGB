package com.example.tarea_canvasugb

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

/**
 * Implementation of App Widget functionality.
 */
class widget1 : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

@SuppressLint("RemoteViewLayout")
internal fun updateAppWidget(
    context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {
    val i1 : PendingIntent = Intent(context, Canvas_UGB::class.java).let { intent ->
        PendingIntent.getActivities(context,0, arrayOf(intent),0)
    }
    val i2 : PendingIntent = Intent(context, Notas::class.java).let { intent ->
        PendingIntent.getActivities(context, 0, arrayOf(intent), 0)
    }
    val views = RemoteViews(context.packageName,R.layout.widget1)
        .apply{setOnClickPendingIntent(R.id.canva,i1)}
        .apply{setOnClickPendingIntent(R.id.nota,i2)}


    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}