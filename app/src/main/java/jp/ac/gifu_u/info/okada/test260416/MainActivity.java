package jp.ac.gifu_u.info.okada.test260416;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyView(this));

        //Button b = findViewById(R.id.button);
        //Sb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showToast("アプリを終了しました");
        finish();
    }
    public void showToast(String string) {
        Toast t = Toast.makeText(this, string, Toast.LENGTH_SHORT);
        t.show();
    }
}