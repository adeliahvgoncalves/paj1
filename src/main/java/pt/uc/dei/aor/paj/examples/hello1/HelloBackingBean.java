package pt.uc.dei.aor.paj.examples.hello1;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class HelloBackingBean implements Serializable {

	private String name;

	public void logout() throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.invalidateSession();
		ec.redirect(ec.getRequestContextPath() + "/frontpage.xhtml");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
