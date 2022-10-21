package dad.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {

	private GridPane gridPane;
	private Label usuarioLabel, passwordLabel;
	private TextField usuarioTextField;
	private PasswordField passwordField;
	private CheckBox useLdapCheckBox;
	private HBox botoneraHBox;
	private Button accederButton, cancelarButton;
	
	public View() {
		super();
		
		gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		usuarioLabel = new Label("Usuario:");
		usuarioTextField = new TextField();
		
		passwordLabel = new Label("Contraseña:");
		passwordField = new PasswordField();
		
		useLdapCheckBox = new CheckBox("Usar LDAP");
		
		botoneraHBox = new HBox();
		
		accederButton = new Button("Acceder");
		accederButton.setDefaultButton(true);
		
		cancelarButton = new Button("Cancelar");
		
		
		botoneraHBox.getChildren().addAll(accederButton, cancelarButton);
		botoneraHBox.setSpacing(5);
		
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.addRow(0, usuarioLabel, usuarioTextField);
		gridPane.addRow(1, passwordLabel, passwordField);
		
		//GridPane.setColumnIndex(useLdapCheckBox, 2);
		GridPane.setColumnSpan(useLdapCheckBox, 2);
		
		
		setAlignment(Pos.CENTER);
		setSpacing(5);
		setPadding(new Insets(5));
		setFillWidth(false);
		getChildren().addAll(gridPane, useLdapCheckBox, botoneraHBox);
	}
	
	public TextField getUsuarioProperty() {
		return this.usuarioTextField;
	}
	
	public TextField getPasswordProperty() {
		return this.passwordField;
	}
	
	public CheckBox getuseLdapCheckBox() {
		return this.useLdapCheckBox;
	}
	
	public Button getAccederButton() {
		return this.accederButton;
	}
	
	public Button getCancelarButton() {
		return this.cancelarButton;
	}
}
















