module com.example.parsingdesktop17 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.google.gson;
    requires java.net.http;
    requires org.apache.poi.poi;

    opens com.example.parsingdesktop17 to javafx.fxml;
    exports com.example.parsingdesktop17;
}