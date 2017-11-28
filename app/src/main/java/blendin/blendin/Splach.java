package blendin.blendin;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class Splach extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        configSplash.setBackgroundColor(R.color.splach); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        Drawable dr = getResources().getDrawable(R.drawable.logo);
        Bitmap bitmap = ((BitmapDrawable) dr).getBitmap();
        Drawable d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap,350,125,true));

        configSplash.setLogoSplash(R.drawable.logo_resized); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)
        configSplash.setTitleSplash("");

//        //Customize Path
//            configSplash.setPathSplash(SyncStateContract.Constants.CONTENT_DIRECTORY); //set path String
//        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
//        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
//        configSplash.setAnimPathStrokeDrawingDuration(3000);
//        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
//        configSplash.setPathSplashStrokeColor(R.color.colorAccent); //any color you want form colors.xml
//        configSplash.setAnimPathFillingDuration(3000);
//        configSplash.setPathSplashFillColor(R.color.colorPrimaryDark); //path object filling color
    }

    @Override
    public void animationsFinished() {
        Intent mainIntent = new Intent(Splach.this,get_stared.class);
        Splach.this.startActivity(mainIntent);
        Splach.this.finish();
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.splach);
//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(Splach_activity.this,Enter_activity.class);
//                Splach_activity.this.startActivity(mainIntent);
//               Splach_activity.this.finish();
//            }
//        }, 2000);
//    }


}
