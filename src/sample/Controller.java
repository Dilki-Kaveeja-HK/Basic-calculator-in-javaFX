package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Label results;
    @FXML private TextField TFnumber1;
    @FXML private TextField TFnumber2;

    @FXML
    void Addition(ActionEvent event){
        double num1 = Double.parseDouble(TFnumber1.getText());
        double num2 = Double.parseDouble(TFnumber2.getText());
        results.setText(num1 + "+" + num2 + " = " + (num1+num2) );
    }
    @FXML
    void Subtraction(ActionEvent event){
        double num1 = Double.parseDouble(TFnumber1.getText());
        double num2 = Double.parseDouble(TFnumber2.getText());
        results.setText(num1 + "-" + num2 + " = " + (num1-num2) );
    }
    @FXML
    void Division(ActionEvent event){
        double num1 = Double.parseDouble(TFnumber1.getText());
        double num2 = Double.parseDouble(TFnumber2.getText());
        results.setText(num1 + "/" + num2 + " = " + (num1/num2) );
    }
    @FXML
    void Multiplication(ActionEvent event){
        double num1 = Double.parseDouble(TFnumber1.getText());
        double num2 = Double.parseDouble(TFnumber2.getText());
        results.setText(num1 + "*" + num2 + " = " + (num1*num2) );
    }
    @FXML
    void Exponent(ActionEvent event){
        double num1 = Double.parseDouble(TFnumber1.getText());
        results.setText("e^"+num1 +" = " + Math.exp(num1));
    }
    @FXML
    void Sin(ActionEvent event){
        int num1 = Integer.parseInt(TFnumber1.getText());
        double value = Math.toRadians(num1);
        results.setText("Sin("+num1+")" + " = " + Math.sin(value));
    }
    @FXML
    void Cos(ActionEvent event){
        int num1 = Integer.parseInt(TFnumber1.getText());
        double value = Math.toRadians(num1);
        results.setText("Cos("+num1+")" + " = " + Math.cos(value));
    }
    @FXML
    void Tan(ActionEvent event){
        int num1 = Integer.parseInt(TFnumber1.getText());
        double value = Math.toRadians(num1);
        results.setText("Tan("+num1+")" + " = " + Math.tan(value));
    }
    @FXML
    void clear(ActionEvent event){
        results.setText("0");
        TFnumber1.setText("");
        TFnumber2.setText("");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
