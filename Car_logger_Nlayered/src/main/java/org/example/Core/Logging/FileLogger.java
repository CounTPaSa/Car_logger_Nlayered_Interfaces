package org.example.Core.Logging;

public class FileLogger implements Logger
{
    public void log(String data)
    {
        System.out.println(data + " Dosyaya Loglandi");
    }
}
