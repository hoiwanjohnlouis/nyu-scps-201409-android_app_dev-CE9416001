package com.nyuf2014.s03.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by computerlab on 9/20/14.
 */
public class TimeServer {

    int m_Port;
    int m_Backlog;
    ServerState m_serverState;
    ServerSocket m_serverSocket;
    Socket m_clientConection;
    String m_TimeStamp;
    ObjectOutputStream m_clientOutput;
    ObjectInputStream m_clientInput;


    public TimeServer (int port, int backlog) throws Exception {
        m_Port = port;
        m_Backlog = backlog;
        m_serverState = ServerState.CLOSED;
        m_serverSocket = new ServerSocket(m_Port, m_Backlog);
    }
    public void processServerQueue () {
        m_serverState = ServerState.RUNNING;

    }
    public void close () {
        try {
            if (m_serverSocket != null) {
                m_serverSocket.close();
            }
        } catch (IOException e2) {
            System.err.println(e2);
        } catch (Exception e1) {
            System.err.println(e1);
        } finally {

        }
    }
    public void waitConnection() throws IOException {
        System.out.println();
        m_clientConection = m_serverSocket.accept(); //

    }
    public void getStreams() throws IOException {
        m_clientOutput = new ObjectOutputStream(m_clientConection.getOutputStream());
        m_clientOutput.flush();
        m_clientInput = new ObjectInputStream(m_clientConection.getInputStream());

    }
    public void closeConnections() {

    }
    public void sendData() {

    }
    public String gateDateTime() {

        return "";
    }

}
