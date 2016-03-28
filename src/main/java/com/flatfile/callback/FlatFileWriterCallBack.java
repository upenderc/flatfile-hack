package com.flatfile.callback;

import org.springframework.batch.item.file.FlatFileItemWriter;

import com.flatfile.domain.Person;

public interface FlatFileWriterCallBack<O> {

   O doWrite(FlatFileItemWriter<Person> input) throws Exception;
   
   
}
