package de.uniks.vs.capnzero.monitoring.event;

public class ReceiveEvent extends DebugEvent
{
  private final String message;

  public ReceiveEvent(String id, String message)
  {
    this.id = id;
    this.type = "receive";
    this.message = message;
  }

  public String getType()
  {
    return type;
  }

  public String getMessage()
  {
    return message;
  }

  @Override
  public String toString()
  {
    return String.format("{\"id\":\"%s\", \"type\": \"%s\", \"message\": \"%s\"}", id, type, message);
  }
}
