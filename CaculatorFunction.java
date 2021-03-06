//U10416005林建宇
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CaculatorFunction extends Application{
	//Data field
	boolean emp = true;
	double ans;
	String t;
	boolean haveDot = true;
	int act;
	boolean numberIn = false;
	@Override
	
	public void start(Stage primaryStage){
		//create a pane
		Pane pane = new Pane();
		//create 28 action button by array
		Button btn[] = new Button[28];
		String btnIn[] = {"MC", "MR", "MS", "M+", "M-",
            "<-", "CE", "C", "±", "√", "7", "8", "9", "÷",
            "%", "4", "5", "6", "*", "1/x","1","2","3","-","=",
            "0",".","+"};
		//add the name in button
		for(int i = 0;i<28;++i){
			btn[i]=new Button(btnIn[i]);
		}
		//create a textfield to show caculate
		TextField cal = new TextField();
		pane.getChildren().add(cal);
        cal.setPrefSize(280, 70);
        cal.setLayoutX(10);
        cal.setLayoutY(30);
        cal.setEditable(false);
        cal.setText("0");
		//add the button in the pane
		for(int i = 0;i<28;++i){
			btn[i].setPrefSize(50, 60);
            if(i<=4) {
                btn[i].setLayoutX(10+60*i);
                btn[i].setLayoutY(116);
                pane.getChildren().add(btn[i]);
            }
            else if(i>4&&i<=9) {
                btn[i].setLayoutX(10+60*(i-5));
                btn[i].setLayoutY(179);
                pane.getChildren().add(btn[i]);
            }
            else if(i>9&&i<=14) {
                btn[i].setLayoutX(10+60*(i-10));
                btn[i].setLayoutY(242);
                pane.getChildren().add(btn[i]);
            }
            else if(i>14&&i<=19) {
                btn[i].setLayoutX(10+60*(i-15));
                btn[i].setLayoutY(305);
                pane.getChildren().add(btn[i]);
            }
            else if(i>19&&i<=23) {
                btn[i].setLayoutX(10+60*(i-20));
                btn[i].setLayoutY(378);
                pane.getChildren().add(btn[i]);
            }
            else if(i==24) {
                btn[i].setLayoutX(10+60*(i-20));
                btn[i].setLayoutY(378);
                btn[i].setPrefSize(50, 120);
                pane.getChildren().add(btn[i]);
            }
            else if(i==25) {
                btn[i].setLayoutX(10+60*(i-25));
                btn[i].setLayoutY(441);
                btn[i].setPrefSize(110, 60);
                pane.getChildren().add(btn[i]);
            }
            else {
                btn[i].setLayoutX(10+60*(i-24));
                btn[i].setLayoutY(441);
                pane.getChildren().add(btn[i]);
            }  
        }
		//create menubar
		MenuBar bar = new MenuBar();
		//create three menus
		Menu menu1 = new Menu("檢視(V)");
		Menu menu2 = new Menu("編輯(E)");
		Menu menu3 = new Menu("說明(H)");
		//create three menu item for each menu
		MenuItem item1[] = new MenuItem[10];
		MenuItem item2[] = new MenuItem[3];
		MenuItem item3[] = new MenuItem[2];
		String item1Name[] = {"標準型(T)","工程型(S)","程式設計師(P)","統計資料(A)",
        "歷程紀錄(Y)","數字分位(I)","基本(B)","單位換算(U)","日期計算(D)","工作表(W)"};
		String item2Name[] = {"複製(C)","貼上(P)","歷程紀錄(H)"};
		String item3Name[] = {"檢視說明(V)    F1","關於小算盤(A)"};
		//add the item in responce menu
		for(int i = 0;i<10;++i){
			item1[i] = new MenuItem(item1Name[i]);
            menu1.getItems().add(item1[i]);
		}
		for(int i = 0;i<3;++i){
			item2[i] = new MenuItem(item2Name[i]);
            menu2.getItems().add(item2[i]);
		}
		for(int i = 0;i<2;++i){
			item3[i] = new MenuItem(item3Name[i]);
            menu3.getItems().add(item3[i]);
		}
		//add the menus in menubar and add in the pane
		bar.getMenus().addAll(menu1,menu2,menu3);
		bar.setLayoutX(10);
		pane.getChildren().add(bar);
	
		//create the scene and add the pane
		Scene scene = new Scene(pane,300,500);
		primaryStage.setResizable(false);
        primaryStage.setTitle("U10416005's caculator");
        primaryStage.setScene(scene);
        primaryStage.show();
		//The number buttons action
		btn[10].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("7");
			}
			else{
				cal.appendText("7");
			}
		});
		btn[11].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("8");
			}
			else{
				cal.appendText("8");
			}
		});
		btn[12].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("9");
			}
			else{
				cal.appendText("9");
			}
		});
		btn[15].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("4");
			}
			else{
				cal.appendText("4");
			}
		});
		btn[16].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("5");
			}
			else{
				cal.appendText("5");
			}
		});
		btn[17].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("6");
			}
			else{
				cal.appendText("6");
			}
		});
		btn[20].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("1");
			}
			else{
				cal.appendText("1");
			}
		});
		btn[21].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("2");
			}
			else{
				cal.appendText("2");
			}
		});
		btn[22].setOnAction(e->{
			if(emp==true){
				cal.clear();
				emp = false;
				cal.setText("3");
			}
			else{
				cal.appendText("3");
			}
		});
		btn[25].setOnAction(e->{
			if(emp==false){
				cal.appendText("0");
			}	
		});
		//"<-" button action
		btn[5].setOnAction(e->{
			if(cal.getText().length()==1){
				cal.clear();
				cal.setText("0");
			}
			else{
				t = cal.getText();
				t = t.substring(0,t.length()-1);
				cal.setText(t);
			}
		});
		//"C" button action
		btn[7].setOnAction(e->{
			cal.clear();
			emp = true;
			ans = 0;
			cal.setText("0");
		});
		//"."button action
		btn[26].setOnAction(e->{
			for(int i = 0;i<cal.getText().length();i++){
				if(cal.getText().charAt(i)=='.'){
					haveDot=true;
				}
				else{
					haveDot=false;
				}
			}
			if(haveDot==false){
				cal.appendText(".");
			}
		});
		//"+/-" button action
		btn[8].setOnAction(e->{
			cal.setText(String.valueOf(-Double.valueOf(cal.getText())));
		});
		//"+" "-" "*" "/" buttons action
		btn[13].setOnAction(e->{
			if(numberIn==true){
				switch(act){
					case 1:
						ans = ans+Double.valueOf(cal.getText());
						break;
					case 2:
						ans = ans-Double.valueOf(cal.getText());
						break;
					case 3:
						ans = ans*Double.valueOf(cal.getText());
						break;
					case 4:
						ans = ans/Double.valueOf(cal.getText());
						break;
				}
				cal.setText(String.valueOf(ans));
				cal.appendText("/");
				emp = true;
				act = 4;
			}
			else{
				ans = Double.valueOf(cal.getText());
				cal.setText(String.valueOf(ans));
				cal.appendText("/");
				numberIn = true;
				emp = true;
				act = 4;
			}
		});
		btn[18].setOnAction(e->{
			if(numberIn==true){
				switch(act){
					case 1:
						ans = ans+Double.valueOf(cal.getText());
						break;
					case 2:
						ans = ans-Double.valueOf(cal.getText());
						break;
					case 3:
						ans = ans*Double.valueOf(cal.getText());
						break;
					case 4:
						ans = ans/Double.valueOf(cal.getText());
						break;
				}
				cal.setText(String.valueOf(ans));
				cal.appendText("*");
				emp = true;
				act = 3;
			}
			else{
				ans = Double.valueOf(cal.getText());
				cal.setText(String.valueOf(ans));
				cal.appendText("*");
				numberIn = true;
				emp = true;
				act = 3;
			}
		});
		btn[23].setOnAction(e->{
			if(numberIn==true){
				switch(act){
					case 1:
						ans = ans+Double.valueOf(cal.getText());
						break;
					case 2:
						ans = ans-Double.valueOf(cal.getText());
						break;
					case 3:
						ans = ans*Double.valueOf(cal.getText());
						break;
					case 4:
						ans = ans/Double.valueOf(cal.getText());
						break;
				}
				cal.setText(String.valueOf(ans));
				cal.appendText("-");
				emp = true;
				act = 2;
			}
			else{
				ans = Double.valueOf(cal.getText());
				cal.setText(String.valueOf(ans));
				cal.appendText("-");
				numberIn = true;
				emp = true;
				act = 2;
			}
		});
		btn[27].setOnAction(e->{
			if(numberIn==true){
				switch(act){
					case 1:
						ans = ans+Double.valueOf(cal.getText());
						break;
					case 2:
						ans = ans-Double.valueOf(cal.getText());
						break;
					case 3:
						ans = ans*Double.valueOf(cal.getText());
						break;
					case 4:
						ans = ans/Double.valueOf(cal.getText());
						break;
				}
				cal.setText(String.valueOf(ans));
				cal.appendText("+");
				emp = true;
				act = 1;
			}
			else{
				ans = Double.valueOf(cal.getText());
				cal.setText(String.valueOf(ans));
				cal.appendText("+");
				numberIn = true;
				emp = true;
				act = 1;
			}
		});
		//"=" button action
		btn[24].setOnAction(e->{
			if(numberIn==true){
				switch(act){
					case 1:
						ans = ans+Double.valueOf(cal.getText());
						break;
					case 2:
						ans = ans-Double.valueOf(cal.getText());
						break;
					case 3:
						ans = ans*Double.valueOf(cal.getText());
						break;
					case 4:
						ans = ans/Double.valueOf(cal.getText());
						break;
				}
				cal.setText(String.valueOf(ans));
				numberIn = false;
				emp = true;
			}
		});
	}
	 public static void main(String[] args) {
        launch(args);
    }
}