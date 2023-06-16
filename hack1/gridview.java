package atom.ks.hack1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.widget.GridView;
import android.os.Bundle;
import java.util.ArrayList;

public class gridview extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        //changing the color of the status bar (notification bar)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white, this.getTheme()));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        // SET 1
        courseModelArrayList.add(new CourseModel("Disha Lagan\nStudent\n \n200", R.drawable.img));
        courseModelArrayList.add(new CourseModel("Jagran Patil\nAccountant\n \n2000", R.drawable.img_1));
        courseModelArrayList.add(new CourseModel("Aditya Khare\nArtist\n \n3000", R.drawable.img_3));
        courseModelArrayList.add(new CourseModel("Prajwal Rohit\nStudent\n \n100", R.drawable.img_2));
        courseModelArrayList.add(new CourseModel("Karan Singh\nCook\n \n2000", R.drawable.img_4));
        courseModelArrayList.add(new CourseModel("Kiran Devita\nVolunteer\n \n4000", R.drawable.img_6));
        courseModelArrayList.add(new CourseModel("Kasturi Palak\nNovelist\n \n500", R.drawable.img_7));
        courseModelArrayList.add(new CourseModel("Palima Jalgi\nStudent\n \n800", R.drawable.img_9));

        // SET 2
        courseModelArrayList.add(new CourseModel("Disha Lagan\nStudent\n \n200", R.drawable.img_10));
        courseModelArrayList.add(new CourseModel("Jagran Patil\nAccountant\n \n2000", R.drawable.img_11));
        courseModelArrayList.add(new CourseModel("Aditya Khare\nArtist\n \n3000", R.drawable.img_12));
        courseModelArrayList.add(new CourseModel("Prajwal Rohit\nStudent\n \n100", R.drawable.img_13));
        courseModelArrayList.add(new CourseModel("Karan Singh\nCook\n \n2000", R.drawable.img_14));
        courseModelArrayList.add(new CourseModel("Kiran Devita\nVolunteer\n \n4000", R.drawable.img_15));
        courseModelArrayList.add(new CourseModel("Kasturi Palak\nNovelist\n \n500", R.drawable.img_16));
        courseModelArrayList.add(new CourseModel("Palima Jalgi\nStudent\n \n800", R.drawable.img_17));

        // SET 3
        courseModelArrayList.add(new CourseModel("Disha Lagan\nStudent\n \n200", R.drawable.img_18));
        courseModelArrayList.add(new CourseModel("Jagran Patil\nAccountant\n \n2000", R.drawable.img_19));
        courseModelArrayList.add(new CourseModel("Aditya Khare\nArtist\n \n3000", R.drawable.img_20));
        courseModelArrayList.add(new CourseModel("Prajwal Rohit\nStudent\n \n100", R.drawable.img_21));
        courseModelArrayList.add(new CourseModel("Karan Singh\nCook\n \n2000", R.drawable.img_22));
        courseModelArrayList.add(new CourseModel("Kiran Devita\nVolunteer\n \n4000", R.drawable.img_5));
        courseModelArrayList.add(new CourseModel("Kasturi Palak\nNovelist\n \n500", R.drawable.img_23));
        courseModelArrayList.add(new CourseModel("Palima Jalgi\nStudent\n \n800", R.drawable.img_24));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}