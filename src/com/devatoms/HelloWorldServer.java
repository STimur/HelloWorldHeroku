package com.devatoms;

import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.port;

public class HelloWorldServer {
  public static void main(String[] args) {
    setPortForHeroku();
    get("/hello", (req, res) -> new Gson().toJson(HelloWorld.say()));
  }

  private static void setPortForHeroku() {
    String port = new ProcessBuilder().environment().get("PORT");
    if (port != null)
      port(Integer.parseInt(port));
  }
}
