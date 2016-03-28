package com.flatfile.callback;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemWriter;

import com.flatfile.domain.Person;

public class FlatFileWriterTemplate {

   private final FlatFileItemWriter<Person> flatFileItemWriter;
   
   public FlatFileWriterTemplate(final FlatFileItemWriter<Person> flatFileItemWriter) {
      this.flatFileItemWriter=flatFileItemWriter;
   }
   
   public  void writeAll(FlatFileRecordsWriter<? extends Person> fwc) throws Exception {
       try {
          List<? extends Person> returnValue = fwc.doWrite();
          flatFileItemWriter.open(new ExecutionContext());
          flatFileItemWriter.write(returnValue);
       } 
       finally {
          flatFileItemWriter.close();
       }
      
   }
   
   
}
