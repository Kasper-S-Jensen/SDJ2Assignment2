package server.model;

import client.model.ChatModel;
import client.network.Client;
import shared.Message;

import java.util.List;

public class ChatModelManager implements ChatModel
{
  private Client client;

  public ChatModelManager(Client client)
  {
    this.client = client;
  }

  @Override public void sendMessage(String msg)
  {

  }

  @Override public List<String> getConnectedUsers()
  {
    return null;
  }

  @Override public List<Message> getMessages()
  {
    return null;
  }

  @Override public int getNumberOfConnectedUsers()
  {
    return 0;
  }
}
