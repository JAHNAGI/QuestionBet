package application;
	
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import java.io.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.control.Alert;
//import javafx.scene.control.Optional;
import javafx.scene.control.ButtonType;

public class Main extends Application {
	public String userid;
	public String lb;
	public String path="C:/Users/"+System.getProperty("user.name");
	@Override
	
	public void start(Stage a) {
		Alert al=new Alert(AlertType.CONFIRMATION);
		ButtonType yes=new ButtonType("Yes");
		ButtonType no =new ButtonType("No");
		
		al.setContentText(lb);
//		ColumnConstraints p1=new ColumnConstraints();
//		p1.setPercentWidth(50);
//		ColumnConstraints p2=new ColumnConstraints();
//		p2.setPercentWidth(50);
//		pop.getColumnConstraints().addAll(p1,p2);
//		pop.add(yes, 0, 1);
//		pop.add(no, 2, 1);
//		pop.add(lb,0,0);
//		pop.setColumnSpan(lb, 2);
	
	a.initStyle(StageStyle.UNDECORATED);
	
		
	
	GridPane gp2=new GridPane();
	GridPane gp3=new GridPane();
	GridPane gp=new GridPane();
	Scene sc=new Scene(gp);
	Scene sc2=new Scene(gp2);
	Scene sc3=new Scene(gp3);
	a.setScene(sc2);
	
	try {
	Label h1=new Label("RGUKT EXAM");
	Label h2=new Label("welcome to rgukt exam");
	Label h3=new Label("enter credentials");
	Label h4=new Label("id");
	Label h5=new Label("password");
	TextField user=new TextField(),pass=new TextField();
	Button sb=new Button("Submit");
	ColumnConstraints u1=new ColumnConstraints();
	u1.setPercentWidth(50);
	ColumnConstraints u2=new ColumnConstraints();
	u2.setPercentWidth(50);
	gp2.getColumnConstraints().addAll(u1,u2);
	
	gp2.add(h1, 0, 0);
	gp2.setColumnSpan(h1, 2);
	gp2.add(h2, 0, 1);
	gp2.setColumnSpan(h2, 2);
	gp2.add(h3, 0, 2);
	gp2.setColumnSpan(h3, 2);
	gp2.add(h4, 0, 3);
	gp2.add(h5, 0, 4);
	gp2.add(user, 1, 3);
	gp2.add(pass, 1, 4);
	gp2.add(sb, 0, 5);
	gp2.setColumnSpan(sb, 2);
	gp2.setMaxWidth(250);
	gp2.setMaxHeight(250);
	sb.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			File f=new File("users.txt");
			FileReader f2;
			BufferedReader br;
			try{
				f2=new FileReader(f);
				br=new BufferedReader(f2);
				String sy;
				boolean chk=false;
				String str[]=new String[2];
				while ((sy=br.readLine()) !=null){
					
					
					
					if (sy.split(":")[0].equals(user.getText())) {
						
						if (sy.split(":")[1].equals(pass.getText())) {
							chk=true;
							
							userid=user.getText();
							break;
						}
						
					}
					
					
				};
				if (chk==false) {
					h3.setText("wrong credentials");
				}
				else {
					a.close();
					a.setScene(sc3);
					a.show();
				}
				br.close();
				f2.close();
			}
			catch (Exception jn6){
				System.out.println(jn6.getMessage());
			}
		}
	});
	
	}
	catch (Exception jn3) {
		System.out.println(jn3.getMessage());
	}

	
	
	try {
		Label h1=new Label("RGUKT EXAM");
		Label h2=new Label("welcome to rgukt exam");
		Label h3=new Label("enter credentials");
		
		Label h5=new Label("exam password");
		TextField pass=new TextField();
		Button sb=new Button("Submit");
		ColumnConstraints u1=new ColumnConstraints();
		u1.setPercentWidth(50);
		ColumnConstraints u2=new ColumnConstraints();
		u2.setPercentWidth(50);
		gp3.getColumnConstraints().addAll(u1,u2);
		gp3.add(h1, 0, 0);
		gp3.setColumnSpan(h1, 2);
		gp3.add(h2, 0, 1);
		gp3.setColumnSpan(h2, 2);
		gp3.add(h3, 0, 2);
		gp3.setColumnSpan(h3, 2);
		
		gp3.add(h5, 0, 4);
		
		gp3.add(pass, 1, 4);
		gp3.add(sb, 0, 5);
		gp3.setColumnSpan(sb, 2);
		gp3.setMaxWidth(250);
		gp3.setMaxHeight(250);
		sb.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			File f=new File(path+"/.gnome");
			
			if (!f.isDirectory()) {
				f.mkdir();
				if (pass.getText().equals("JAHNAVI") ) {
				a.close();
				a.setFullScreen(true);
				a.setScene(sc);
				a.show();
			}
			else {
				h3.setText("wrong credentials");
			}
		}
			else {
				h3.setText("YOU HAVE ALREADY TAKEN THE EXAM");
			}
		}
		});
	}
	catch (Exception jn4) {
		System.out.println(jn4.getMessage());
	}
	
	
	
	
	
	
	
	
	TextField tf=new TextField();
	ColumnConstraints c1=new ColumnConstraints();
	c1.setPercentWidth(10);
	ColumnConstraints c2=new ColumnConstraints();
	c2.setPercentWidth(20);
	ColumnConstraints c3=new ColumnConstraints();
	c3.setPercentWidth(20);
	ColumnConstraints c4=new ColumnConstraints();
	c4.setPercentWidth(20);
	ColumnConstraints c5=new ColumnConstraints();
	c5.setPercentWidth(20);
	ColumnConstraints c6=new ColumnConstraints();
	c6.setPercentWidth(10);
	gp.getColumnConstraints().addAll(c1,c2,c3,c4,c5,c6);
	gp.setVgap(20);
		File f=new File("Questions.txt");
		Jah jnv[]=new Jah[18];
		try {
			FileReader f2=new FileReader(f);
			BufferedReader f3=new BufferedReader(f2);
			
			gp.add(tf, 0, 0);
			gp.setColumnSpan(tf, 6);
			int k=1;
			
			for (int i=0;i<2;i++) {
				Jah j=new Jah(i,f3.readLine(),f3.readLine(),f3.readLine(),f3.readLine(),f3.readLine());
				jnv[i]=j;
				gp.add(j.q, 1, k++);
				gp.setColumnSpan(j.q, 4);
				
				gp.add(j.op1, 1, k++);
				gp.setColumnSpan(j.op1, 2);
				
				gp.add(j.op2, 1, k++);
				gp.setColumnSpan(j.op1, 2);
				
				gp.add(j.op3, 1, k++);
				gp.setColumnSpan(j.op1, 2);
				
				gp.add(j.op4, 1, k++);
				gp.setColumnSpan(j.op1, 2);
				
				gp.add(j.bt1, 1, k);
				gp.add(j.bt2, 2, k);
				gp.add(j.bt3, 3, k);
				gp.add(j.bt4, 4, k++);
				
			}
			
			Button bt=new Button("submit");
			gp.add(bt, 3, k);
			gp.setColumnSpan(bt, 2);
			bt.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					try {
					int s=0;
					for (int i=0;i<2;i++) {
						if ((ToggleButton)jnv[i].tg.getSelectedToggle()!=null) {
							s+=1;
						}
						
						
					}
					
					lb="you have answred"+s+"out of"+jnv.length;
					al.setContentText(lb);
					al.initStyle(StageStyle.UNDECORATED);
					al.setHeaderText(null);
					al.setGraphic(null);
					al.showAndWait();
					
					
					if (al.getResult()==ButtonType.OK) {
						File fj=new File(path+"/Desktop/"+userid+".txt");
						try {
							FileWriter fr=new FileWriter(fj);
							BufferedWriter bw=new BufferedWriter(fr);
							if (!fj.exists()) {
								fj.createNewFile();
								for (int i=0;i<2;i++) {
									bw.write(((ToggleButton)jnv[i].tg.getSelectedToggle()).getText()+"\n");
								}
								
								
							}
							else {
								for (int i=0;i<2;i++) {
									bw.write(((ToggleButton)jnv[i].tg.getSelectedToggle()).getText()+"\n");
								}
							}
							bw.close();
							fr.close();
						}
						catch (Exception ett) {
							System.out.println(ett.getMessage());
						}
						a.close();
					}
					
					
					}
					catch(Exception et) {
						System.out.println(et.getMessage());
					}
					
				}
			});
		}
		catch (Exception jn1) {
		System.out.println(jn1.getMessage());
		
		};
		
	
	a.show();	
	
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	};
	
	
};
class Jah{
	Label q=new Label(),op1=new Label(),op2=new Label(),op3=new Label(),op4=new Label();
	int id;
	ToggleButton bt1=new ToggleButton("A");
	ToggleButton bt2=new ToggleButton("B");
	ToggleButton bt3=new ToggleButton("C");
	ToggleButton bt4=new ToggleButton("D");
	ToggleGroup tg=new ToggleGroup();
	Jah(int id,String a,String opt1,String opt2,String opt3,String opt4){
		this.id=id;
		this.q.setText(a);
		this.op1.setText("A.  "+opt1);
		this.op2.setText("B.  "+opt2);
		this.op3.setText("C.  "+opt3);
		this.op4.setText("D.  "+opt4);
		bt1.setToggleGroup(tg);
		bt2.setToggleGroup(tg);
		bt3.setToggleGroup(tg);
		bt4.setToggleGroup(tg);
	}
	
	
//	public int check() {
//		File f=new File("Questions.txt");
//		
//		
//		if (!f.exists()) {
//			return 0;
//		}
//		else {
//		
//		try {
//		
//		FileReader fr=new FileReader(f);
//		
//		}
//		catch (Exception e2) {
//			System.out.println(e2.getMessage());
//		}
//		for (int i=0;i<2;i++) {
//			
//		}
//		}
//		return 1;
//	}
	

}
//class Btn{
//	Btn(){
//	ToggleButton bt1=new ToggleButton("A");
//	ToggleButton bt2=new ToggleButton("B");
//	ToggleButton bt3=new ToggleButton("C");
//	ToggleButton bt4=new ToggleButton("D");
//	ToggleGroup tg=new ToggleGroup();
//	bt1.setToggleGroup(tg);
//	bt2.setToggleGroup(tg);
//	bt3.setToggleGroup(tg);
//	bt4.setToggleGroup(tg);
//	
//	}
//}
	

