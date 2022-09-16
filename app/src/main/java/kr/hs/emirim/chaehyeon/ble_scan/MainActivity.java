package kr.hs.emirim.chaehyeon.ble_scan;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button startButton;
    Button stopButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start_button);
        stopButton = findViewById(R.id.stop_button);
        resetButton = findViewById(R.id.reset_button);


        startButton.setOnClickListener(v -> start());

    }
}