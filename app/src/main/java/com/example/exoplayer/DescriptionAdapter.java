package com.example.exoplayer;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.PlayerNotificationManager;

import androidx.annotation.Nullable;

public class DescriptionAdapter implements PlayerNotificationManager.MediaDescriptionAdapter {

    private Context context;

    public DescriptionAdapter(Context context) {
        this.context = context;
    }

    @Override
    public String getCurrentContentTitle(Player player) {
        return "Now playing";
    }

    @Nullable
    @Override
    public PendingIntent createCurrentContentIntent(Player player) {
        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent contentPendingIntent = PendingIntent.getActivity
                (context, 0, intent, 0);
        return contentPendingIntent;
    }

    @Nullable
    @Override
    public String getCurrentContentText(Player player) {
        return "Streaming Radio";
    }

    @Nullable
    @Override
    public String getCurrentSubText(Player player) {
        return null;
    }

    @Nullable
    @Override
    public Bitmap getCurrentLargeIcon(Player player, PlayerNotificationManager.BitmapCallback callback) {
        return null;
    }
}
