package com.creativedevelopers.buildingmanagement.Fragment;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mohammad on 18/02/25.
 */

public class Fragment2 extends Fragment{
    private static final String TAG = "Fragment1";
    private Button aboutusbutton2;
    private RelativeLayout relativeLayout;
    TextView tv3;
    LinearLayout ln;
    Animation slide;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,null);

        int height=getResources().getDisplayMetrics().heightPixels;

        TextView textView = new TextView(getActivity());
        ln = view.findViewById(R.id.linearLayoutfragment2);
        ln.addView(textView);
        tv3 = view.findViewById(R.id.tv3);

        slide = AnimationUtils.loadAnimation(getActivity(),R.anim.slide);
        tv3.startAnimation(slide);

//        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(tv3,"TranslationY",-1000,0);
//        objectAnimator.setRepeatCount(0);
//        objectAnimator.setDuration(3000);
//        objectAnimator.start();


        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(tv3,"TranslationY",-100,0);
        objectAnimator1.setRepeatCount(0);
        objectAnimator1.setDuration(3000);
        objectAnimator1.start();

        //startAnim(view);
//        Handler handler=new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
////
//
//
//            }
//        });




//
//        slide.start();

        Log.d(TAG,"onCreateView: started.");

        aboutusbutton2=(Button)view.findViewById(R.id.aboutusbutton2);

//        TextView textView = new TextView(MainActivity.getMcontext());
//        ln.addView(textView);
//        tv3 = (TextView) view.findViewById(R.id.tv3);
//        slide = AnimationUtils.loadAnimation(MainActivity.getMcontext(),R.anim.slide);
//        tv3.setAnimation(slide);
//        slide.start();
        aboutusbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
//                        new Handler().postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//                                aboutusbutton2.performClick();
//                            }
//                        }, 5000);
//            @Override
//            public void onClick(View v) {
//                TextView textView = new TextView(MainActivity.getMcontext());
//                ln.addView(textView);
//                tv3 = (TextView) view.findViewById(R.id.tv3);
//                slide = AnimationUtils.loadAnimation(MainActivity.getMcontext(),R.anim.slide);
//                tv3.setAnimation(slide);
////                Toast.makeText(getActivity(),"Going To Fragment 3",Toast.LENGTH_SHORT).show();
////                ((MainActivity)getActivity()).setViewPager(0);
////                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
////                ln.setOrientation(LinearLayout.VERTICAL);
//
//                //add textView
////                textView.setText("The developer world is yours");
////                textView.setId(1);
////                textView.setLayoutParams(params);
//
//                // added Button
////                Button button = new Button(getApplicationContext());
////                button.setText("thedeveloperworldisyours");
////                button.setId(2);
//
//                //added the textView and the Button to LinearLayout
//
//            }
//        });
//        ln = (Button) getView().findViewById(R.id.aboutusbutton2);
//        TextView textView = new TextView(MainActivity.getMcontext());
//        ln.addView(textView);
//        aboutusbutton2 = (Button) view.findViewById(R.id.aboutusbutton2);
//        slide = AnimationUtils.loadAnimation(MainActivity.getMcontext(),R.anim.slide);
//        aboutusbutton2.setAnimation(slide);
        return  view;
    }

    public void startAnim(View view)
    {
        slide = AnimationUtils.loadAnimation(getActivity(),R.anim.slide);
        view.startAnimation(slide);
    }
}
