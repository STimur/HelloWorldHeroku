package com.devatoms;

import java.util.Objects;

public class Message {
  private String text;

  public Message(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Message message = (Message) o;
    return Objects.equals(text, message.text);
  }
}
