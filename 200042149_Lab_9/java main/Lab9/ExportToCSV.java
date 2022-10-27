package Lab9;

import java.util.List;
import java.io.*;

public class ExportToCSV implements IExport{
    @Override
    public void ExportList(List<Student> students) throws IOException {
        String path = "D:\\files\\list.csv";
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path));

        for (Student student : students){
            String line = student.toString();
            fileWriter.write(line);
        }

        fileWriter.close();
    }
}
