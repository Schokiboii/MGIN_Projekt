package htl.m.templd_uebung;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController implements Initializable{

    @FXML
    private ImageView ivPicture;
    @FXML
    private ListView<?> lvData;
    @FXML
    private Label lblId;
    @FXML
    private Label lblFirstname;
    @FXML
    private Label lblLastname;
    @FXML
    private Label lblHeight;
    @FXML
    private Label lblWeight;
    @FXML
    private Label lblBMI;
    @FXML
    private Label lblFFMI;
    @FXML
    private BarChart<?, ?> barchartBMIFFMI;
    @FXML
    private BarChart<?, ?> barchartHeigth;
    @FXML
    private BarChart<?, ?> barchartWeight;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ivPicture.setOnDragOver(new EventHandler(){
            if
        });
    }
    
}
