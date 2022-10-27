package Lab9;

import java.io.IOException;
import java.util.List;

public class Exporter {
    public void Export(List<Student> students, IExport iExport) throws IOException {
        iExport.ExportList(students);
    }
}
