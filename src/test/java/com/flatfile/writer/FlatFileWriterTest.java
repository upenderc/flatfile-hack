package com.flatfile.writer;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flatfile.domain.Person;
import com.flatfile.domain.PersonBuilder;
import com.flatfile.manager.FlatFileWriter;

@ContextConfiguration("/file-writer.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FlatFileWriterTest {

   @Autowired
   private FlatFileWriter writer;
   
   @Test
   public void writeSinglePerson() throws Exception {
      
      Person person = PersonBuilder.newBuilder()
             .firstName("Scott")
             .lastName("Miller")
             .middleName("S").build();
         writer.write(person);
         
   }
   
   @Test
   public void writeMultiplePersonRecords() throws Exception {
      
      Person person1 = PersonBuilder.newBuilder()
             .firstName("Robert")
             .lastName("Hope")
             .middleName("C").build();
      
      Person person2 = PersonBuilder.newBuilder()
            .firstName("James")
            .lastName("Blake")
            .middleName("R").build();
     
      Person person3 = PersonBuilder.newBuilder()
            .firstName("Larry")
            .lastName("Chen")
            .middleName("S").build();
     
         writer.writeAll(Arrays.asList(person1,person2,person3));
         
   }
}
