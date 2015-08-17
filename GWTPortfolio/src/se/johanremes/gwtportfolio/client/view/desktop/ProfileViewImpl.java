package se.johanremes.gwtportfolio.client.view.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ProfileViewImpl extends Composite implements ProfileView {

	private static ProfileViewImplUiBinder uiBinder = GWT.create(ProfileViewImplUiBinder.class);

	interface ProfileViewImplUiBinder extends UiBinder<Widget, ProfileViewImpl> {}

	private Presenter presenter;
	private String name;
	
	public ProfileViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	

	@Override
	public void setName(String temp) {
		this.name = temp;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
