package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mamunImageView, marufImageView, minarImageView, muradImageView, noyonImageView, raselImageView, ronyImageView, saikatImageView,
                      shubrotoImageView, sumonImageView, tipuImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mamunImageView =(ImageView) findViewById(R.id.mamunImageViewId);
        marufImageView = (ImageView) findViewById(R.id.marufImageViewId);
        minarImageView = (ImageView) findViewById(R.id.minarImageViewId);
        //muradImageView = (ImageView) findViewById(R.id.muradImageViewId);
       // noyonImageView = (ImageView) findViewById(R.id.noyonImageViewId);
        //raselImageView = (ImageView) findViewById(R.id.raselImageViewId);
        //ronyImageView = (ImageView) findViewById(R.id.ronyImageViewId);
        //saikatImageView = (ImageView) findViewById(R.id.saikatImageViewId);
        //shubrotoImageView = (ImageView) findViewById(R.id.shubrotoImageViewId);
        //sumonImageView = (ImageView) findViewById(R.id.sumonImageViewId);
        //tipuImageView = (ImageView) findViewById(R.id.tipuImageViewId);


        mamunImageView.setOnClickListener(this);
        marufImageView.setOnClickListener(this);
        minarImageView.setOnClickListener(this);
        //muradImageView.setOnClickListener(this);
       // noyonImageView.setOnClickListener(this);
        //raselImageView.setOnClickListener(this);
        //ronyImageView.setOnClickListener(this);
        //saikatImageView.setOnClickListener(this);
        //shubrotoImageView.setOnClickListener(this);
        //sumonImageView.setOnClickListener(this);
        //tipuImageView.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {


        try {

            if (v.getId() == R.id.mamunImageViewId){

                mamunImageView.setVisibility(View.GONE);
                marufImageView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Maruf",Toast.LENGTH_SHORT).show();

            }

            else if (v.getId() == R.id.marufImageViewId){

                marufImageView.setVisibility(View.GONE);
                minarImageView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Minar",Toast.LENGTH_SHORT).show();

            }

            else if (v.getId() == R.id.minarImageViewId){

                minarImageView.setVisibility(View.GONE);
                mamunImageView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Mamun",Toast.LENGTH_SHORT).show();

            }

            //  else  if (v.getId() == R.id.muradImageViewId){

            // muradImageView.setVisibility(View.GONE);
            //  mamunImageView.setVisibility(View.VISIBLE);
            //oast.makeText(MainActivity.this,"Mamun",Toast.LENGTH_SHORT).show();

            //}

            //else if (v.getId() == R.id.noyonImageViewId){

            //    noyonImageView.setVisibility(View.GONE);
            //    mamunImageView.setVisibility(View.VISIBLE);

           // }

            // else if (v.getId() == R.id.raselImageViewId){

            //   raselImageView.setVisibility(View.GONE);
            //    ronyImageView.setVisibility(View.VISIBLE);

            // }

            //  else if (v.getId() == R.id.ronyImageViewId){

            //  ronyImageView.setVisibility(View.GONE);
            //   saikatImageView.setVisibility(View.VISIBLE);

            //}

            //  else if (v.getId() == R.id.saikatImageViewId){

            //    saikatImageView.setVisibility(View.GONE);
            //    shubrotoImageView.setVisibility(View.VISIBLE);

            // }

            // else if (v.getId() == R.id.shubrotoImageViewId){

            //    shubrotoImageView.setVisibility(View.GONE);
            //   sumonImageView.setVisibility(View.VISIBLE);

            // }


        }catch (Exception e){


        }






    }
}