package sg.edu.rp.soi.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Colour>alColor;
    CustomerAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.ListViewApp);
        alColor = new ArrayList<>();
        Colour item1 = new Colour("blue_box");
        alColor.add(item1);
        Colour item2 = new Colour("orange_box");
        alColor.add(item2);
        Colour item3 = new Colour("brown_box");
        alColor.add(item3);


        caColor = new CustomerAdapter(this,R.layout.row,alColor);
        lvColor.setAdapter(caColor);

    }
}

