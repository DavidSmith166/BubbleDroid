package kns.bubbledroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class GameActivity extends AppCompatActivity {

    private PlayState play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        play = new PlayState(this);
        setContentView(play);
    }

    @Override
    protected void onPause() {
        super.onPause();
        play.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        play.resume();
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        play.onTouch(e);
        return true;
    }
}
