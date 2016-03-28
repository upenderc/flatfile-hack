package com.flatfile.manager;

import java.util.Arrays;
import java.util.List;

import com.flatfile.callback.FlatFileRecordsWriter;
import com.flatfile.callback.FlatFileWriterTemplate;
import com.flatfile.domain.Person;

public class FlatFileWriter {
   
   private final  FlatFileWriterTemplate flatFileWriterTemplate;
   
   public FlatFileWriter(FlatFileWriterTemplate flatFileWriterTemplate) {
      this.flatFileWriterTemplate=flatFileWriterTemplate;
   }
   
   public void write(final Person person) throws Exception {
     flatFileWriterTemplate.writeAll(new FlatFileRecordsWriter<Person>() {
      public List<? extends Person> doWrite() {
         return Arrays.asList(person);
      }
   });
     
  }
   
   public void writeAll(final List<? extends Person> person) throws Exception {
      flatFileWriterTemplate.writeAll(new FlatFileRecordsWriter<Person>() {
       public List<? extends Person> doWrite() {
          return person;
       }
    });
      
   }

}
