//U10416005ªL«Ø¦t
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
            "¡ö", "CE", "C", "¡Ó", "¡Ô", "7", "8", "9", "¡Ò",
            "%", "4", "5", "6", "¡Ñ", "1/x","1","2","3","-","=",
            "0",".","+"};
		for(int i = 0;i<28;++i){
			btn[i]=new Button(btnIn[i]);
		}
		TextArea cal = new TextArea();
		pane.getChildren().add(cal);
        cal.setPrefSize(280, 100);
        cal.setLayoutX(10);
        cal.setLayoutY(10);
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