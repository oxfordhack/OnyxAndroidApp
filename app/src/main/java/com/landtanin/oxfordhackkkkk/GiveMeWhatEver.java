package com.landtanin.oxfordhackkkkk;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Tanin on 26/11/2017.
 */

public class GiveMeWhatEver extends FirebaseInstanceIdService {

    public static final String TAG = "GiveMeWhatEVer";
    public static String TOKEN = "";



    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);

//        Log.w(TAG, "onTokenRefresh: new TOKEN generated");
//        Intent intent = new Intent(this, MainActivity.class);
//        startService(intent);

    }

    private void sendRegistrationToServer(String refreshedToken) {

        // todo do something with this, may be do static constant
        TOKEN = refreshedToken;
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.w("afha;oifha;weo", "onCreate: " + token);

    }

}
