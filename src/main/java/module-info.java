module com.example.sspgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.sspgui to javafx.fxml;
    exports com.example.sspgui;
}