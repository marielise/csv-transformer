package com.mlh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CsvTransform {



  public static void main(String [] args) throws ParseException {

    if (args.length != 2) {
      System.out.println("Missing arguments inputFile.csv modelOut.json");
    }


  }

}


/**
 *
 input : [

 ]

column : [
 {
  "title": "OrderId",
  "content":"${Id}",
  "validation": {
    "type" : "regexp",
    "value" : "d+"
  },
  "datatype", "Integer"
 },
 {
 "title": "OrderDate",
 "content": "${Year}-${Month}-${Day}",
 "validation": {
 "type" : "date",
 "value" : "YYYY-MM-dd"
 },
 "datatype", "DateTime"
 },

 */
