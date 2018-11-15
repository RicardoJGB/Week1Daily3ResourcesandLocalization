package com.mobileapps.week1daily3_resourcesandlocalization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay1;
    TextView tvDisplay2;
    TextView tvDisplay3;
    TextView tvDisplay4;
    TextView tvDisplay5;
    TextView tvDisplay6;
    TextView tvDisplay7;
    TextView tvDisplay8;
    TextView tvDisplay9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay1=findViewById(R.id.message1);
        tvDisplay2=findViewById(R.id.message2);
        tvDisplay3=findViewById(R.id.message3);
        tvDisplay4=findViewById(R.id.message4);
        tvDisplay4=findViewById(R.id.message4);
        tvDisplay5=findViewById(R.id.message5);
        tvDisplay6=findViewById(R.id.PersonName);
        tvDisplay7=findViewById(R.id.PersonLastName);
        tvDisplay8=findViewById(R.id.AnimalPhylum);
        tvDisplay9=findViewById(R.id.AnimalFamily);


     Animal animal = new Animal("Chordata","Ursidae");
     animal.getFamily();
     animal.getPhylum();

     Person person = new Person("Ricardo","Bravo");
     tvDisplay6.setText("\nPerson's name and last name:\n"+person.getName());
     tvDisplay7.setText(person.getLastName());
     tvDisplay8.setText("\nGrizzly bear's phylum and family:\n"+animal.getPhylum());
     tvDisplay9.setText(animal.getFamily());

    }
}
