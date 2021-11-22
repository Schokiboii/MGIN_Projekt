package htl.m.templd_uebung;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import htl.m.templd_uebung.model.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class PrimaryController implements Initializable{

    @FXML
    private ImageView ivPicture;
    @FXML
    private ListView<String> lvData;
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
    private BarChart<String, Number> barchartBMIFFMI;
    @FXML
    private BarChart<String, Number> barchartHeigth;
    @FXML
    private BarChart<String, Number> barchartWeight;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ivPicture.setOnDragOver((DragEvent event) -> {
            if (event.getDragboard().hasFiles()){
                event.acceptTransferModes(TransferMode.ANY);
            }
            event.consume();
        });
        
        ivPicture.setOnDragDropped(new EventHandler<DragEvent>(){
            @Override
            public void handle(DragEvent event) {
                List<File> files = event.getDragboard().getFiles();
                File jsonFile = files.get(0);
                try {
                    ivPicture.setImage(new Image(new FileInputStream(jsonFile)));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
                }
                event.consume();
                
                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();
                Person p = null;
                try{
                    p = gson.fromJson(new FileReader(jsonFile), Person.class);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
                }
                lvData.getItems().add(p.getVn() + " " + p.getNn());
                
                XYChart.Series<String, Number> s = new XYChart.Series<String, Number>();
                ObservableList l = FXCollections.observableArrayList();
                l.add(new XYChart.Data<String, Number>("BMI", p.getBmi()));
                l.add(new XYChart.Data<String, Number>("FFMI", p.getFfmi()));
                s.setData(l);
                barchartBMIFFMI.getData().add(s);
                
                XYChart.Series<String, Number> s1 = new XYChart.Series<String, Number>();
                ObservableList l1 = FXCollections.observableArrayList();
                l1.add(new XYChart.Data<String, Number>("Gewicht", p.getGewicht()));
                s1.setData(l1);
                barchartWeight.getData().add(s1);
                
                XYChart.Series<String, Number> s2 = new XYChart.Series<String, Number>();
                ObservableList l2 = FXCollections.observableArrayList();
                l2.add(new XYChart.Data<String, Number>("Height", p.getHeight()));
                s2.setData(l2);
                barchartHeigth.getData().add(s2);
                
                lblFirstname.setText(p.getVn());
                lblLastname.setText(p.getNn());
                lblId.setText(p.getId()+"");
                lblBMI.setText(p.getBmi()+"");
                lblFFMI.setText(p.getFfmi()+"");
                lblHeight.setText(p.getGroesse()+"");
                lblWeight.setText(p.getGewicht()+"");
            }
        });
        
     
    }
    
}
