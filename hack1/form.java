package atom.ks.hack1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class form extends AppCompatActivity {

    private EditText names, current_weight,height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText nameEditText = (EditText) findViewById(R.id.names);

        String fullName = nameEditText.getText().toString();


        EditText currentWeightEditText = (EditText) findViewById(R.id.current_weight);

        String currentWeight = currentWeightEditText.getText().toString();

        EditText heightEditText = (EditText) findViewById(R.id.height);

        String Height = heightEditText.getText().toString();

        EditText goalWeightEditText = (EditText) findViewById(R.id.goal_weight);

        String GoalWeight = goalWeightEditText.getText().toString();

        EditText ageEditText = (EditText) findViewById(R.id.age);

        String age = ageEditText.getText().toString();

        EditText phoneEditText = (EditText) findViewById(R.id.names);

        String phone = phoneEditText.getText().toString();

        EditText addressEditText = (EditText) findViewById(R.id.names);

        String address = addressEditText.getText().toString();

        CheckBox conditionsCheckBox = (CheckBox) findViewById(R.id.conditions);

//check current state of the check box

        Boolean checkBoxState = conditionsCheckBox.isChecked();


    }



    public void radioButtonhandler(View view) {



        // Decide what happens when a user clicks on a button

    }

    public void submitbuttonHandler(View view) {

        //Decide what happens when the user clicks the submit button

        Toast.makeText(this, "Successfully Submitted", Toast.LENGTH_SHORT).show();

    }


}
