package assignment7.editStudent;

import assignment7.Main;
import assignment7.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditStudentController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public static Student editedStudent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setText(editedStudent.getName());
        txtEmail.setText(editedStudent.getEmail());
        txtMark.setText(Integer.toString(editedStudent.getMark()));
    }

    public void backToListPage(ActionEvent actionEvent) throws Exception{
        Parent addStudentPage = FXMLLoader.load(getClass().getResource("../studentList/studentList.fxml"));
        Scene sc = new Scene(addStudentPage, 400, 600);
        Main.rootStage.setTitle("Student list");
        Main.rootStage.setScene(sc);
    }


    public void submit(ActionEvent actionEvent) throws Exception{
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            Integer mark = Integer.parseInt(txtMark.getText());
            if(mark < 0 || mark > 10) throw new Exception("Invalid mark");

            editedStudent.setName(name);
            editedStudent.setEmail(email);
            editedStudent.setMark(mark);

            backToListPage(null);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}