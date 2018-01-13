package sabm.intent_service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * Created by sab on 13.01.2018.
*/

public class TutorialIntentService extends IntentService {

    public TutorialIntentService() {
        this(TutorialIntentService.class.getName());
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    public TutorialIntentService(String name) {
        super(name);
    }

    /** Sab: not sure, super() sets the variable name in extended class on actual value **/

    protected void showToast(final String msg){
        //gets the main thread
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                // run this code in the main thread
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        showToast("Starting IntentService");
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        showToast("Finishing IntentService");
    }
}