package dad.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty usuarioProperty = new SimpleStringProperty();
	private StringProperty pswdProperty = new SimpleStringProperty();
	private BooleanProperty useLDAP = new SimpleBooleanProperty();
	
	
	
	public final StringProperty usuarioPropertyProperty() {
		return this.usuarioProperty;
	}
	
	public final String getUsuarioProperty() {
		return this.usuarioPropertyProperty().get();
	}
	
	public final void setUsuarioProperty(final String usuarioProperty) {
		this.usuarioPropertyProperty().set(usuarioProperty);
	}
	
	
	
	public final StringProperty pswdPropertyProperty() {
		return this.pswdProperty;
	}
	
	public final String getPswdProperty() {
		return this.pswdPropertyProperty().get();
	}
	
	public final void setPswdProperty(final String pswdProperty) {
		this.pswdPropertyProperty().set(pswdProperty);
	}

	
	
	public final BooleanProperty useLDAPProperty() {
		return this.useLDAP;
	}
	

	public final boolean isUseLDAP() {
		return this.useLDAPProperty().get();
	}
	

	public final void setUseLDAP(final boolean useLDAP) {
		this.useLDAPProperty().set(useLDAP);
	}	
}
