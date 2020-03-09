package com.mlh.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public interface Parser {

  List<String> getHeader();

  Iterator<HashMap<String, Object>> getItemIterator();

}
