package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 alexandro galvez-vega
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Interface {

    //This will be for the launching of the UI
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("List Operations");
        primaryStage.show();
    }

    //list of list variable will manage all lists in play
    //this is the application center
    //main will comme into existence here

    //the template of the UI will exist through this

    //This area will require a significant amount of research

    //main function

    //this area will keep track of the gui interface
    //and will be location that holds variables, specifically list variables
    //(single lists to lists of lists) that move between list management and list mov operations.

    //one function will represent making a new object that represent a new list
    //this function will make use of the listmanagement function

    //one function will represent the button that allows to add new items to the list
    //again, this will make sue of a listmanagement function


    //one function will represent the button that allows to store single+ list
    //this function will use a loop to check how many lists will be checked
    //single and multiple read to external storage will use same function
    //List Move Operations class will be called with this list
    //appropriate text file will be created
    //appropriate information will be displayed on UI

    //one function will represent the button that allows to receive single+ list
    //single and multiple read to external storage will use same function
    //two functions, same esssential logic
    //list receiving from multiple list will use loop that grabs from each object to properly receive correct information
    //this will all go into the same list
    //display will be through UI

    //List Move Operations class will be called with this list
    //function that calls function from list move operations
    //will draw from the appropriate text file
    //asking for the name of the text file will come from this side using scanner
    //scan in a new with a string variable,
    //this will be sent to list move operations when the function is called
    //appropriate information will be displayed on UI

    /*

    newList() will exist here
    //this will use the function from list management to make a new list but will act as the middle man between there and the user interface
    addtoList()
     //this will use the function from list management to make add to a list but will act as the middle man between there and the user interface
    remfromList()
    //this will use the function from list management to make remove from a list but will act as the middle man between there and the user interface
     */
}
