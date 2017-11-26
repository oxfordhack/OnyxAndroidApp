package com.landtanin.oxfordhackkkkk;

/**
 * Created by landtanin on 6/30/2017 AD.
 */

/**
 * This service is started when an Alarm has been raised
 * <p>
 * We pop a notification into the status bar for the user to click on
 * When the user clicks the notification a new activity is opened
 *
 * @author paul.blundell
 */
public class NotifyService {
//    extends Service

//
//    /**
//     * Class for clients to access
//     */
//    public class ServiceBinder extends Binder {
//        NotifyService getService() {
//            return NotifyService.this;
//        }
//    }
//
//    private static final String TAG = NotifyService.class.getSimpleName();
//
//    // Unique id to identify the notification.
//    private int mNotificationId = 123;
//    // Name of an intent extra we can use to identify if this service was started to create a notification
//    public static final String INTENT_NOTIFY = "com.landtanin.service.INTENT_NOTIFY";
//
//    public static final String INTENT_SCHEDULE_ID_EXTRA = "INTENT_SCHEDULE_ID_EXTRA";
//    public int scheduleID;
//    public static long[] vibratePattern = {100, 200, 300, 400, 500, 400, 300, 200, 400};
//    public static final String channel_id = "habit_reminder_id";
//
//    // The system notification manager
//    private NotificationManager mNM;
//
//    @Override
//    public void onCreate() {
//        Log.i("NotifyService", "onCreate()");
//
//        getManager();
//        createNotiChannels();
//
//        Log.d(TAG, "onCreate: servicedebug");
//
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        Log.i("LocalService", "Received start id " + startId + ": " + intent);
//
//        scheduleID = intent.getIntExtra(INTENT_SCHEDULE_ID_EXTRA, 0);
//
//        // If this service was started by out AlarmTask intent then we want to show our notification
//        if (intent.getBooleanExtra(INTENT_NOTIFY, false))
//            showNotification();
//
//        // We don't care if this service is stopped as we have already delivered our notification
//        return START_NOT_STICKY;
//    }
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        return mBinder;
//    }
//
//    // This is the object that receives interactions from clients
//    private final IBinder mBinder = new ServiceBinder();
//
//    /**
//     * Creates a notification and shows it in the OS drag-down status bar
//     */
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    private void showNotification() {
//
//        // Check if message contains a data payload.
//        if (remoteMessage.getData().size() > 0) {
//            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
//
//            if (/* Check if data needs to be processed by long running job */ true) {
//                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
//            } else {
//                // Handle message within 10 seconds
//                handleNow();
//            }
//
//        }
//
//        // Check if message contains a notification payload.
//        if (remoteMessage.getNotification() != null) {
//            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
//
//            String title = remoteMessage.getNotification().getTitle();
//            String text = remoteMessage.getNotification().getBody();
//            int icon = R.drawable.ic_launcher_background;
//
//            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), getString(R.string.default_notification_channel_id))
//                    .setContentTitle(title)
//                    .setContentText(text)
//                    .setSmallIcon(icon)
////                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.app))
//                    .setAutoCancel(true)
//                    .setVibrate(vibratePattern)
//                    .setLights(Color.YELLOW, 3000, 3000)
//                    .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
//                    .setPriority(2)                                      // low -2, -1, 0, 1, 2 high
//                    .setSound(Settings.System.DEFAULT_NOTIFICATION_URI);
//
//            Intent resultIntent = new Intent(this, MainActivity.class);
//
//            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//
//            stackBuilder.addParentStack(MainActivity.class);
//
//            stackBuilder.addNextIntent(resultIntent);
//
//            // The PendingIntent to launch our activity if the user selects this notification
////        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);
//
//            PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
//
//            // set the notification's click behavior
//            mBuilder.setContentIntent(resultPendingIntent);
//
//            startForeground(mNotificationId, mBuilder.build());
//            stopForeground(STOP_FOREGROUND_DETACH);
//
//        }
//    }


}