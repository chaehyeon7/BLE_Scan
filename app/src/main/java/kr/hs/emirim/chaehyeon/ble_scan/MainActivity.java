package kr.hs.emirim.chaehyeon.ble_scan;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button startButton; //시작버튼
    Button stopButton; // 중지버튼
    Button resetButton; // 초기화버튼

    private ActivityResultLauncher<String[]> requestPermissionLauncher;
    private ActivityResultLauncher<Intent> enableBluetoothLauncher;

    private boolean hasCoarseLcationPermission = false;
    private boolean hasFineLocationPermission = false;
    private boolean hasBluetoothScanPermission = false;
    private boolean hasBluetoothConnectPermission = false;

    private BluetoothManager bluetoothManager;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothLeScanner bluetoothLeScanner;
    private ScanCallback leScanCallback;

    private boolean scanning = false;

    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private ArrayList<ScanResult> scanResultArrayList;

    private ArrayList<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start_button);
        stopButton = findViewById(R.id.stop_button);
        resetButton = findViewById(R.id.reset_button);


        startButton = findViewById(R.id.start_button);
        stopButton = findViewById(R.id.stop_button);
        resetButton = findViewById(R.id.reset_button);

        startButton.setOnClickListener(v -> start());
        stopButton.setOnClickListener(v -> stop());
        resetButton.setOnClickListener(v -> reset());



    }
}