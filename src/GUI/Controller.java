package GUI;

import Code.SignalType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    //tabs
    public Tab kar1;
    public Tab kar2;
    public Tab kar3;

    //choiceboxes
    //public ChoiceBox signal;
    public ChoiceBox<SignalType> signal;
    public ChoiceBox<Integer> interval;


    //scores
    public Text score1;
    public Text score2;
    public Text score3;
    public Text score4;
    public Text score5;

    public Text score21;
    public Text score22;
    public Text score23;
    public Text score24;
    public Text score25;

    public Text score31;
    public Text score32;
    public Text score33;
    public Text score34;
    public Text score35;

    //parameters
    public TextField op;
    public TextField kw;
    public TextField A;
    public TextField t;
    public TextField d;

    Integer[] ig = {1,2,3,4,5};
    public void initialize(){
        ObservableList<SignalType> type = FXCollections.observableArrayList(SignalType.values());
        signal.setItems(type);
        signal.setValue(SignalType.type);
        ObservableList<Integer> val = FXCollections.observableArrayList(ig);
        interval.setItems(val);
        interval.setValue(1);

    }

    public void generateChart(ActionEvent actionEvent) {


    }

    public void generateHist(ActionEvent actionEvent) {
    }

    public void sum(ActionEvent actionEvent) {
    }

    public void subtraction(ActionEvent actionEvent) {
    }

    public void multiple(ActionEvent actionEvent) {
    }

    public void divide(ActionEvent actionEvent) {
    }
}
