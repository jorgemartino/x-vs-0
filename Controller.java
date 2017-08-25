package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button Casilla1;

    @FXML
    public Button Casilla2;

    @FXML
    public Button Casilla3;

    @FXML
    public Button Casilla4;

    @FXML
    public Button Casilla5;

    @FXML
    public Button Casilla6;

    @FXML
    public Button Casilla7;

    @FXML
    public Button Casilla8;

    @FXML
    public Button Casilla9;

    @FXML
    public TextField player1;

    int a = 0;
    int b = 0;

    public void Limpiar(ActionEvent actionEvent) {
        Casilla1.setText("");
        Casilla2.setText("");
        Casilla3.setText("");
        Casilla4.setText("");
        Casilla5.setText("");
        Casilla6.setText("");
        Casilla7.setText("");
        Casilla8.setText("");
        Casilla9.setText("");


    }

    public void Salir(ActionEvent actionEvent) {

    }

    public void Colocarx(ActionEvent actionEvent) {
        Casilla1.setText("x");
        if(Casilla3.getText().equals("x") && Casilla5.getText().equals("x")) {
            Casilla9.setText("0");
        }else if (Casilla1.getText().equals("x")){
            Casilla2.setText(("0"));
        }


    }

    public void Colocarx1(ActionEvent actionEvent) {
        Casilla4.setText("x");
        if(Casilla4.getText().equals("x") && Casilla5.getText().equals("x")) {
            Casilla6.setText("0");
        } else if (Casilla4.getText().equals("x")) {
                Casilla7.setText(("0"));
        }
    }

    public void Colocarx2(ActionEvent actionEvent) {
        Casilla5.setText("x");
        if(Casilla5.getText().equals("x") && Casilla3.getText().equals("x")){
            Casilla7.setText("0");
           } else if (Casilla5.getText().equals("x"))
            Casilla9.setText(("0"));

        }


    public void Colocarx3(ActionEvent actionEvent) {
        Casilla8.setText("x");
        if (Casilla8.getText().equals("x")) {
            Casilla6.setText(("0"));
        }
    }

    public void Colocarx4(ActionEvent actionEvent) {
        Casilla3.setText("x");
        if(Casilla5.getText().equals("x") && Casilla3.getText().equals("x")) {
            Casilla7.setText("0");
        }else if (Casilla3.getText().equals("x") && Casilla2.getText().equals("0")){
                Casilla2.setText("0");
                     }else{
                         Casilla2.setText("0");
                        }

    }

    public void Colocarx7(ActionEvent actionEvent) {
        Casilla7.setText("x");
        if (Casilla1.getText().equals("x") && Casilla4.getText().equals("x") && Casilla7.getText().equals("x")) {
            a = a + 1;
            player1.setText(String.valueOf((a)));
        }

    }
}
