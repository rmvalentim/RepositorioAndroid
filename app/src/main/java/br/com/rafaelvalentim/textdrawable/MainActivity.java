package br.com.rafaelvalentim.textdrawable;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.amulyakhare.textdrawable.TextDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_redonda = (ImageView) findViewById(R.id.img_redonda);
        ImageView img_quadrada = (ImageView) findViewById(R.id.img_quadrada);
        ImageView img_quad_red = (ImageView) findViewById(R.id.img_quad_red);

        Drawable redonda_draw = TextDrawable.builder().buildRound("R", Color.RED);
        Drawable quadrada_draw = TextDrawable.builder().buildRound("A", Color.GREEN);
        Drawable quad_red_draw = TextDrawable.builder().buildRound("F", Color.YELLOW);

        img_redonda.setImageDrawable(redonda_draw);
        img_quadrada.setImageDrawable(quadrada_draw);
        img_quad_red.setImageDrawable(quad_red_draw);

    }
}
