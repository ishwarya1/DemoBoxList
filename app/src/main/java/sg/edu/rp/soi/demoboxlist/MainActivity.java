package sg.edu.rp.soi.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Box>alColor;
    CustomerAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.ListViewApp);
        alColor = new ArrayList<>();
        Box item1 = new Box("blue_box");
        alColor.add(item1);
        Box item2 = new Box("orange_box");
        alColor.add(item2);
        Box item3 = new Box("brown_box");
        alColor.add(item3);


        caColor = new CustomerAdapter(this,R.layout.row,alColor);
        lvColor.setAdapter(caColor);

    }
}

