package application;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controlador{
	
	 Connection con;

	@FXML
	private Label txtZona;
	
	@FXML
	private TextField campoZona;
	
	@FXML
	private Label txtOperacion;
	
	@FXML
	private RadioButton si;
	
	@FXML
	private RadioButton no;
	
	@FXML 
	private ComboBox<String> comboOperacion;
	/*private ArrayList<String> tipos = new ArrayList<>();
	public static void fillTipos(ArrayList<String> tipos) {
		tipos.add("Alquiler");
		tipos.add("Compra");
	}*/
	
	@FXML 
	private Label txtMetros;
	
	@FXML 
	private TextField campoMetros;
	
	@FXML
	private Label txtNombre;
	
	@FXML 
	private TextField campoNombre;
	
	@FXML 
	private Label txtTelefono;
	
	@FXML
	private TextField campoTelefono;
	
	@FXML
	private Label txtPrecio;
	
	@FXML
	private TextField campoPrecio;
	
	@FXML
	private Label txtPiso;
	
	@FXML
	private TextField campoPiso;
	
	@FXML 
	private Label txtReservado;
	
	//HACER ID PISO
	
	@FXML
	private TableView<Piso> tabla;
	
	@FXML 
    private TableColumn<Piso, String> columnPiso;
	
	@FXML 
    private TableColumn<Piso, String> columnMetros;
	
	@FXML 
    private TableColumn<Piso, String> columnNombre;
	
	@FXML 
    private TableColumn<Piso, String> columnTelefono;
	
	@FXML 
    private TableColumn<Piso, String> columnPrecio;
	
	@FXML 
    private TableColumn<Piso, String> columnReservado;
	
	
	
	 
	
	
	
	
	
	
	@FXML
	private Button limpiarCampos;
	
	@FXML
	private Button altaJDBC;
	
	@FXML 
	private Button altaHibernate;
	
	@FXML 
	private Button pisosEnVenta;
	
	@FXML
	private Button reservar;
	
	@FXML 
	private Button borrar;
	
	
	
	
	@FXML
	public void altaPiso (ActionEvent Event) {
		boolean reservado;
		if (si.isSelected()) {
			reservado = true;
		} else {
			reservado = false;
		}
		
		if (Integer.parseInt(campoZona.getText()) > 0 & Integer.parseInt(campoZona.getText()) < 7) {
			Piso piso = new Piso(Integer.parseInt(campoPiso.getText()),Integer.parseInt(campoZona.getText()), comboOperacion.getValue().toString(), Integer.parseInt(campoMetros.getText()), campoNombre.getText(), Integer.parseInt(campoTelefono.getText()), Integer.parseInt(campoPrecio.getText()), reservado);
			CRUD.altaPiso(con, piso);
		} else {
			System.out.println("Zona no existente");
		}
	}
	
	
	@FXML
	public void borrarPiso (ActionEvent Event) {
		CRUD.borrarPiso(con, Integer.parseInt(campoPiso.getText()));
	}




	/*@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fillTipos(tipos);
		
		for (int i = 0; i<tipos.size();i++) {
            comboOperacion.getItems().add(tipos.get(i));
        }
	}*/
	
	
	
	
}
