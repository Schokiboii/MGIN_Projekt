module htl.m.templd_uebung {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    
    opens htl.m.templd_uebung to javafx.fxml;
    opens htl.m.templd_uebung.model to com.google.gson;
    
    exports htl.m.templd_uebung;
    exports htl.m.templd_uebung.model;
}


    

