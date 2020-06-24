import javafx.application.Application;
import static javafx.application.Application.launch; 
import javafx.event.EventHandler;

import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Order extends Application{
    @Override
    public void start(Stage stage) throws Exception{

       //put different elements of our GUI
        Text text1 = new Text("First Name");
        Text text2 =  new Text ("Last Name");
        Text text3 = new Text("Address");
        Text text4 = new Text("Phone number");
        Text text5 = new Text("Email address");
        Text text6 = new Text("Password");
        Text text7= new Text("Confirm Password");
        Text text8 = new Text("Confirm age:DOB");
        Text text9 = new Text("Sex");

        TextField textfield1 = new TextField();
        TextField textfield2  = new TextField();
        TextField textfield3 = new TextField();
        TextField textfield4 = new TextField();
        TextField textfield5 = new TextField();

        PasswordField password1 = new PasswordField();
        PasswordField password2 = new PasswordField();

        RadioButton radioButton1 = new RadioButton("Male");
        RadioButton radioButton2 = new RadioButton("Female");
        RadioButton radioButton3 = new RadioButton("Prefer not to say");

        HBox hbox = new HBox(radioButton1, radioButton2, radioButton3);

        DatePicker datePicker = new DatePicker();

        CheckBox checkBox1 = new CheckBox("I agree to adhere to the terms and policies of Conneckt!");
        Button button = new Button("Complete Registration");
        Label label1 = new Label("*A Good Password should contain 8 characters at least;Caps; small letters; one special character and numbers");

         // put the logo
        FileInputStream input = new FileInputStream("Conneckt.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        Label label2 = new Label (";Order any thing",imageView);
        Label label3 = new Label("Thank you for registering for Conneckt Application!!");

        //create GudPane
        GridPane gridPane = new GridPane();

        // set an event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
            label3.setStyle("-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
            gridPane.add(label3,1,12);
            System.out.println("Thank you for registering for Conneckt Application"); 
            button.setStyle("-fx-background-color: #c4b49c;-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
            gridPane.setStyle("-fx-background-color:grey;");
            label2.setStyle("-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
            label1.setStyle("-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
         } 
      };  
        //add the event to the button
        button.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler); 

        //style our gridpane and its different elements
        gridPane.setMinSize (400, 200);
        gridPane.setPadding(new Insets(10,15,10,15));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: #e0dacd;"); 
        gridPane.setVgap(8);
        gridPane.setHgap(8);

        button.setStyle("-fx-background-color:#fcb040; -fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
        label2.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        label1.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text1.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text2.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text3.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text4.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text5.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text6.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text7.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text8.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text9.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        checkBox1.setStyle("-fx-text-fill:black; -fx-font:normal bold 15px 'serif';");
        hbox.setStyle("-fx-text-fill:black; -fx-font:normal bold 15px 'serif';");
        datePicker.setMinSize(800,30);



        //put the elements to our gridpane
        gridPane.add(label2,1,0);
        gridPane.add(text1,0,1);
        gridPane.add(textfield1,1,1);
        gridPane.add(text2,0,2);
        gridPane.add(textfield2,1,2);
        gridPane.add(text3,0,3);
        gridPane.add(textfield3,1,3);
        gridPane.add(text4,0,4);
        gridPane.add(textfield4,1,4);
        gridPane.add(text5,0,5);
        gridPane.add(textfield5,1,5);
        gridPane.add(text6,0,6);
        gridPane.add(password1,1,6);
        gridPane.add(label1,1,7);
        gridPane.add(text7,0,8);
        gridPane.add(password2,1,8);
        gridPane.add(datePicker,1,9);
        gridPane.add(text8,0,9);
        gridPane.add(text9,0,10);
        gridPane.add(hbox,1,10);
        gridPane.add(checkBox1,1,11);
        gridPane.add(button,1,13);
        
        //Creating a scene object 
        Scene scene= new Scene(gridPane);

          //Setting title to the Stage 
        stage.setTitle("Conneckt Orders!");

          //Creating a scene object 
        stage.setScene(scene);
        //stage.setFullScreen(true);

          //Displaying the contents of the stage 
        stage.show();

    }
    public static void main(String args[]) { 
      launch(args); 
   } 
}




