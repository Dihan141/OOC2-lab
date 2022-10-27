package Lab9;

import java.util.List;
import java.io.*;

public class ExportToXML implements IExport{
    @Override
    public void ExportList(List<Student> students) throws IOException {
        String path = "D:\\files\\list.csv";
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), "UTF-16");

        for(Student student : students){
            String line = student.toString();
            out.write(line);

        }
        out.close();
    }
}
