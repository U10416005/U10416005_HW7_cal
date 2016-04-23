//U10416005�L�ئt
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CaculatorFunction extends Application{
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Button btn[] = new Button[28];
		String btnIn[] = {"MC", "MR", "MS", "M+", "M-",
            "<-", "CE", "C", "��", "��", "7", "8", "9", "��",
            "%", "4", "5", "6", "*", "1/x","1","2","3","-","=",
            "0",".","+"};
		for(int i = 0;i<28;++i){
			btn[i]=new Button(btnIn[i]);
		}
		TextArea cal = new TextArea();
		pane.getChildren().add(cal);
        cal.setPrefSize(280, 70);
        cal.setLayoutX(10);
        cal.setLayoutY(30);
        cal.setEditable(false);
        cal.setText("0");
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
		MenuBar bar = new MenuBar();
		Menu menu1 = new Menu("�˵�(V)");
		Menu menu2 = new Menu("�s��(E)");
		Menu menu3 = new Menu("����(H)");
		MenuItem item1[] = new MenuItem[10];
		MenuItem item2[] = new MenuItem[3];
		MenuItem item3[] = new MenuItem[2];
		String item1Name[] = {"�зǫ�(T)","�u�{��(S)","�{���]�p�v(P)","�έp���(A)",
        "���{����(Y)","�Ʀr����(I)","��(B)","��촫��(U)","����p��(D)","�u�@��(W)"};
		String item2Name[] = {"�ƻs(C)","�K�W(P)","���{����(H)"};
		String item3Name[] = {"�˵�����(V)    F1","����p��L(A)"};
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
		bar.getMenus().addAll(menu1,menu2,menu3);
		bar.setLayoutX(10);
		pane.getChildren().add(bar);
	
		Scene scene = new Scene(pane,300,500);
		primaryStage.setResizable(false);
        primaryStage.setTitle("U10416005's caculator");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	 public static void main(String[] args) {
        launch(args);
    }
}