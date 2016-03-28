package com.flatfile.callback;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.batch.item.file.LineCallbackHandler;
import org.springframework.util.Assert;

public class HeaderCopyCallback implements LineCallbackHandler, FlatFileHeaderCallback {

   private String header="";
   
   public HeaderCopyCallback(String columns) {
      header=columns;
   }
   @Override
   public void writeHeader(Writer writer) throws IOException {
      writer.write(header);
   }

   @Override
   public void handleLine(String line) {
      
      Assert.notNull(line);
      this.header = line;
   }
   
}
