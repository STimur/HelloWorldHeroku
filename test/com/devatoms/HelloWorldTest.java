package com.devatoms;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class HelloWorldTest {
  @Test
  public void say() {
    Assert.assertThat(HelloWorld.say(), is(new Message("Tere Maailm!")));
  }
}
