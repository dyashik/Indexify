package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.NodeOrientation;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.event.*;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CourseController extends LoginController {
    @FXML
    Button addButton;
    @FXML
    Button renameConfirmB;
    @FXML
    Button RenameButton;
    @FXML
    Label renameLabel;
    @FXML
    Button courseBox;
    @FXML
    GridPane grid1Pane;
    @FXML
    Label warningLabel;
    @FXML
    TextField newName;
    @FXML
    TextField textField1;
    @FXML
    Integer indexRow = 0;
    @FXML
    Integer indexCol = 0;
    @FXML
    int counter = 0;
    @FXML
    Button logoutButton;




    /**
     * This class is used in order to grab nodes from the gridPane to make deletion possible, as GridPane doesn't have a delete method
     * inherently.
     * @param gridPane1 Any GridPane object
     * @param col The column that is iterated by Integer indexCol
     * @param row The row that is iterated by Integer indexRow
     * @return Returns the node(in this case a button/button bar) of the particular cell of GridPane
     */

    public Node getNode(GridPane gridPane1, Integer col, Integer row)
    {
        for (Node node : gridPane1.getChildren())
        {
            if (gridPane1.getColumnIndex(node) == col && gridPane1.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }


    @FXML
    /**
     * Method for the creation of courses, additionaly creates the buttons that provide deleting,
     * and renaming.  This method also gives functionality to the delete button and rename buttons.
     */
    protected void CreateClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        File courses = new File("userCourses.TXT");
        BufferedWriter myWriter = new BufferedWriter(new FileWriter("userCourses.TXT"));

    }



    @FXML
    public void logoutButton() {
        Parent root;
        try
        {
            usernameSaved = "";
            passwordSaved = "";
            root = FXMLLoader.load(Main.class.getResource("login.fxml"));
            Stage stage = (Stage) logoutButton.getScene().getWindow();
            stage.setTitle("Indexify");
            stage.setScene(new Scene(root,530, 400));
            stage.setResizable(false);
            stage.show();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}

