package application;
import javafx.application.Application;


import javafx.scene.layout.ColumnConstraints;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
public class Index extends Application{
	public void start(Stage a) throws Exception {
		a.setFullScreen(true);
//		a.initStyle(StageStyle.UNDECORATED);
		
	GridPane gp=new GridPane();
	ColumnConstraints c=new ColumnConstraints();
	ColumnConstraints c1=new ColumnConstraints();
	ColumnConstraints c2=new ColumnConstraints();
	c.setPercentWidth(20);
	c1.setPercentWidth(40);
	c2.setPercentWidth(40);
	gp.getColumnConstraints().addAll(c,c1,c2);
	int j=0;
	Gen x[]=new Gen[18];
		for (int i=0;i<2;i++) {
			Gen g=new Gen(i+1);
			x[i]=g;
			gp.add(g.l,0 , j++);
			gp.add(g.q, 0, j++);
			gp.setColumnSpan(g.q, 3);
			
			gp.add(g.opt1, 0, j);
			gp.add(g.op1, 1, j++);
		
			gp.add(g.opt2, 0, j);
			gp.add(g.op2, 1, j++);
			
			gp.add(g.opt3, 0, j);
			gp.add(g.op3, 1, j++);
			
			gp.add(g.opt4, 0, j);
			gp.add(g.op4, 1, j++);
			
			
		}
		Button bt=new Button("Generate");
		bt.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
					int flag=0;
					for (int i=0;i<2;i++) {
						
							if ((x[i].q.getText()!="") & (x[i].op1.getText()!="")& (x[i].op2.getText()!="") & (x[i].op3.getText()!="") & (x[i].op4.getText()!="")) {
								flag=1;
							}
							else {
								flag=0;
								break;
							}
							
						
					}
					if (flag==1) {
						System.out.println("success");
						File f=new File("../Jar/Questions.txt");
						if (!f.exists()) {
							try {
							f.createNewFile();
							FileWriter fw=new FileWriter(f);
							BufferedWriter bw=new BufferedWriter(fw);
							for (int i=0;i<2;i++) {
								bw.write(x[i].q.getText()+"\n"+x[i].op1.getText()+"\n"+x[i].op2.getText()+"\n"+x[i].op3.getText()+"\n"+x[i].op4.getText()+"\n");
								
							}
							bw.close();
							fw.close();
							a.close();
							
							}
							catch (Exception ep) {
								System.out.println(ep.getMessage());
							}
							
						}
						else {
							try {
								
								FileWriter fw=new FileWriter(f);
								BufferedWriter bw=new BufferedWriter(fw);
								for (int i=0;i<2;i++) {
									bw.write(x[i].q.getText()+"\n"+x[i].op1.getText()+"\n"+x[i].op2.getText()+"\n"+x[i].op3.getText()+"\n"+x[i].op4.getText()+"\n");
									
								}
								bw.close();
								fw.close();
								a.close();
								
								}
								catch (Exception ep) {
									System.out.println(ep.getMessage());
								}
								
							
						}
//						try {
//						FileWriter a=new FileWriter("questions.txt");
//						BufferedWriter b=new BufferedWriter(a);
//						b.write("hello");
//						b.write("hi");
//						b.close();
//						a.close();
//						}
//						catch (IOEx) {
//							System.out.println(e.getMessage());
//						}
						
					}
					else {
						System.out.println("failure");
					}
			}
		});
		gp.add(bt, 1, j);
		gp.setVgap(10);
		Scene sc=new Scene(gp);
		a.setScene(sc);
		a.show();
		
			
		
		
		

	}
	public static void main(String args[]) {
		launch(args);
	}
	
}
class Gen{
	Label l=new Label();
	Gen(int i){
		this.l.setText("Question"+i);
	}
	
	Label opt1=new Label("option A");
	Label opt2=new Label("option B");
	Label opt3=new Label("option C");
	Label opt4=new Label("option D");
	TextField q=new TextField();
	TextField op1=new TextField();
	TextField op2=new TextField();
	TextField op3=new TextField();
	TextField op4=new TextField();
	
}
class Cre{
	
};
