package org.example.Core.Logging;

public class MailLogger implements Logger
{
    public void log(String data)
    {
        System.out.println(data + " Mail ile Loglandi");
    }
}
