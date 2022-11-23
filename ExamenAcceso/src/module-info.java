module ExamenAcceso {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	requires jdk.compiler;
	requires java.xml;
	requires jdk.javadoc;
	requires javafx.base;
	
	
	opens application to javafx.graphics, javafx.fxml;
}
