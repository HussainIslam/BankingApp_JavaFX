package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Account[] accountList = new Account[10];
        for(int i = 0; i < 10; i++){
            accountList[i] = new Account(i, 100);
        }
        /*for(int i = 0; i < 10; i++){
            System.out.println("Account " +i +" has balance of " +accountList[i].getBalance());
        }*/
        String fileName = "account.dat";

        //Serialization
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            for(int i = 0; i < 10; i++){
                out.writeObject(accountList[i]);
            }
            System.out.println("Objects has been serialized");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Account temp = null;
        //Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            for(int i = 0; i < 10; i++){
                temp = (Account) in.readObject();
                System.out.println("Account number " +temp.getId() +" has balance of " +temp.getBalance());
            }
        }


        Parent root = FXMLLoader.load(getClass().getResource("Custom.fxml"));
        primaryStage.setTitle("ATM");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
