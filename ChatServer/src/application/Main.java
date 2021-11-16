package application;
	
import java.net.ServerSocket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static ExecutorService threadPool;
	public static Vector<Client> clients = new Vector<Client>();
	
	ServerSocket serverSocket;
	
	// 서버를 구동시켜 클라이언트의 연결을 기다리는 메소드
	public void startServer(String IP, int port) {}
	
	// 서버의 작동을 중지시키는 메소드
	public void stopServer() {}
	
	// UI를 생성하고 실직적으로 프로그램을 작동시키는 메소드
	@Override
	public void start(Stage primaryStage) {}
	
	
	// 프로그램의 진입점
	public static void main(String[] args) {
		launch(args);
	}
}
