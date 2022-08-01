package application;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.Group;
import java.io.File;
import java.lang.Thread;
import java.io.*;
public class Main extends Application {
	
	@Override
	public void start(Stage a) {
		try {
		Button yes=new Button("Yes");
		Button no =new Button("No");
		Label lb=new Label("you have answered 12 out of 10");
			
		Group pop=new Group();
		pop.getChildren().addAll(lb,yes,no);
		Group po=new Group();
		po.getChildren().addAll(lb,yes,no);
		
		Scene sc=new Scene(pop,500,150);
		Scene sb=new Scene(po,150,150);
		
		a.setScene(sc);
		
		a.show();
		a.setScene(sb);
	
		
		
		yes.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				
				File f=new File("users.txt");
				FileReader f2;
				BufferedReader br;
				try{
					f2=new FileReader(f);
					br=new BufferedReader(f2);
					String i="",sy;
					
//					while ((sy=br.readLine())!=null || i==""){
//						if (sy.split(";")==)
//					};
				}
				catch (Exception jn6){
					System.out.println(jn6.getMessage());
				}
			}
		});
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
