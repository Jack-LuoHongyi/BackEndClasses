import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class main {
    Gson gson = new Gson();
    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("student.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Student student = gson.fromJson(br, Student.class);
    System.out.println(student);

}
