package htl.m.templd_uebung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
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
                System.out.println("Got " + files.size() + " files");
                try {
                    ivPicture.setImage(new Image(new FileInputStream(files.get(0))));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
                }
                event.consume();
            }
            
        });
        
     
    }
    
}
