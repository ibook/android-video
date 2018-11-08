package cn.netkiller.video;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonVideoView;
    private Button buttonSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVideoView = (Button) findViewById(R.id.buttonVideoView);
        buttonVideoView.setOnClickListener(this);

        buttonSurfaceView = (Button) findViewById(R.id.buttonSurfaceView);
        buttonSurfaceView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonVideoView:
                startActivity(new Intent(MainActivity.this, VideoViewActivity.class));
                break;
            case R.id.buttonSurfaceView:

                break;
            default:
                break;
        }
    }
}
