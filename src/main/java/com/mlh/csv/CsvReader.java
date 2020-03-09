package com.mlh.csv;

import com.mlh.service.Parser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CsvReader implements Parser {

  @Override
  public List<String> getHeader() {
    return null;
  }

  @Override
  public Iterator<HashMap<String, Object>> getItemIterator() {
    return null;
  }
}
