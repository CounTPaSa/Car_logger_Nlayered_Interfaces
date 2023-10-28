package org.example.Core.Logging;

public class DataBaseLogger implements Logger
{
    public void log(String data)
    {
        System.out.println(data + " Veritabanina Loglandi");
    }
}
