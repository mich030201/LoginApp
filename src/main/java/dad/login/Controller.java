package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	
	private Model model = new Model();
	private View view = new View();
	
	public Controller() {
		
		//bindings
		view.getUsuarioProperty().textProperty().bindBidirectional(model.usuarioPropertyProperty());
		view.getPasswordProperty().textProperty().bindBidirectional(model.pswdPropertyProperty());
		view.getuseLdapCheckBox().selectedProperty().bindBidirectional(model.useLDAPProperty());
		
		//listeners
		view.getAccederButton().setOnAction(this::accederOnAction);
		view.getCancelarButton().setOnAction(this::cancelarOnAction);
		
	}
	
	public void accederOnAction(ActionEvent e) {
		
		AuthService auth = model.isUseLDAP() ? new LdapAuthService() : new FileAuthService();
		try {
			if(auth.login(model.getUsuarioProperty(), model.getPswdProperty())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciale de acceso son válidas");

				alert.showAndWait();
				LoginApp.primaryStage.close();
				
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o contraseñas no son validos");

				alert.showAndWait();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void cancelarOnAction(ActionEvent e) {
		LoginApp.primaryStage.close();
	}
	
	public View getView() {
		return view;
	}
}
