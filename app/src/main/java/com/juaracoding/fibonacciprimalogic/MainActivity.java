package com.juaracoding.fibonacciprimalogic;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15;

    boolean prima = true;
    int pri = 0;
    int fibo = 0;
    List<ImageButton> lstPrima = new ArrayList<ImageButton>();
    List<ImageButton> lstFibonacci = new ArrayList<ImageButton>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img10 = findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img13 = findViewById(R.id.img13);
        img14 = findViewById(R.id.img14);
        img15 = findViewById(R.id.img15);


        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);

        //primaValue();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Bilangan Prima!", Toast.LENGTH_SHORT).show();


            switch (v.getId()) {
                case R.id.img2:
                    prima = true;
                    img2.getDrawable();
                    img2.setImageResource(R.drawable.ic_back);

                case R.id.img3:
                    prima = true;
                    img3.setImageResource(R.drawable.ic_back);

                case R.id.img5:
                    prima = true;
                    img5.getDrawable();
                    img5.setImageResource(R.drawable.ic_back);

                case R.id.img7:
                    prima = true;
                    img7.getDrawable();
                    img7.setImageResource(R.drawable.ic_back);

                case R.id.img11:
                    prima = true;
                    img11.getDrawable();
                    img11.setImageResource(R.drawable.ic_back);


            

        }
            //  primaValue();


    }



          /*  img2.setImageResource(R.drawable.ic_back);
            img3.setImageResource(R.drawable.ic_back);
            img5.setImageResource(R.drawable.ic_back);
            img7.setImageResource(R.drawable.ic_back);
            img11.setImageResource(R.drawable.ic_back);
            img13.setImageResource(R.drawable.ic_back);
            */


  /*  public void primaValue() {

        lstPrima = new ArrayList<ImageButton>();
        for (int i = 2; i < lstPrima.size(); i++) {

            lstPrima.add(img1);
            lstPrima.add(img2);
            lstPrima.add(img3);
            lstPrima.add(img4);
            lstPrima.add(img5);
            lstPrima.add(img6);
            lstPrima.add(img7);
            lstPrima.add(img8);
            lstPrima.add(img9);
            lstPrima.add(img10);
            lstPrima.add(img11);
            lstPrima.add(img12);
            lstPrima.add(img13);
            lstPrima.add(img14);
            lstPrima.add(img15);

            if (pri % i == 0) {
                prima = false;

            }

            prima = true;
            i++;


        }
    }


   */


  /*  public void changeImageResource() {
        ImageButton img2, img3, img5, img7, img11, img13;
        int randomNum = randomNumber.nextInt(someArrayList.size());
        currentImage = someArrayList.get(randomNum);
        currentImage.setImageResource(R.drawable.someOtherImage);

   */
}


