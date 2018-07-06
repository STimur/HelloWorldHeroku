package com.devatoms;

import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.setPort;

public class HelloWorldServer {
  public static void main(String[] args) {
    ProcessBuilder process = new ProcessBuilder();
    Integer port;
    // This tells our app that if Heroku sets a port for us, we need to use that port.
    // Otherwise, if they do not, continue using port 4567.
    if (process.environment().get("PORT") != null) {
      port = Integer.parseInt(process.environment().get("PORT"));
    } else {
      port = 4567;
    }
    setPort(port);

    get("/hello", (req, res) -> new Gson().toJson("Hello World"));
  }
}
