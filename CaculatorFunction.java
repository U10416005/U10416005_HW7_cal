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
		for(int i = 0;i<28;i++){
			btn[i]=new Button(btnIn[i]);
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