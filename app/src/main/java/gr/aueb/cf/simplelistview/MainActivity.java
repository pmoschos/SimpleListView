package gr.aueb.cf.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1. List view init
        listView = findViewById(R.id.listView);

        // Step 2. Init my data
        String[] friends = {
                "Panagiotis",
                "Thanasis",
                "Andreas",
                "Orestis",
                "Eleni",
                "Anna",
                "Panagiotis2",
                "Thanasis2",
                "Andreas2",
                "Orestis2",
                "Eleni2",
                "Anna2",
                "Panagiotis3",
                "Thanasis3",
                "Andreas3",
                "Orestis3",
                "Eleni3",
                "Anna3",
                "Panagiotis4",
                "Thanasis4",
                "Andreas4",
                "Orestis4",
                "Eleni4",
                "Anna4"
        };

        // Step 3. Create my ArrayAdapter
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(
          this, // my context
           android.R.layout.simple_list_item_1, // ready made simple layout
           friends     // datasource
        );

        // Step 4. Link that data with adapter, and that data to the list
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Hello " + arrayAdapter.getItem(position),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}