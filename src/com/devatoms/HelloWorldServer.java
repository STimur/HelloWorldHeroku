package com.devatoms;

import static spark.Spark.get;

public class HelloWorldServer {
  public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello World");
  }
}
