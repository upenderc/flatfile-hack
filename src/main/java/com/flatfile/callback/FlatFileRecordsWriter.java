package com.flatfile.callback;

import java.util.List;

public interface FlatFileRecordsWriter<T> {

   List<? extends T> doWrite();
}
