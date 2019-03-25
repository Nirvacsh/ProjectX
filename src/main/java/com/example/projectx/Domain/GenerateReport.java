package com.example.projectx.Domain;

;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;

import java.io.*;

public class GenerateReport {
    public static void generate() throws FileNotFoundException, Docx4JException, IOException
    {
        DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());
        DocxContext context = new DocxContext();
        context.setName("Vlad");
        InputStream template = new FileInputStream(new File("template.docx"));
        OutputStream out = new FileOutputStream("output_template.docx");
        stamper.stamp(template, context, out);
        out.close();
    }
}
