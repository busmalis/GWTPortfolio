package se.johanremes.gwtportfolio.client.view.desktop;

import se.johanremes.gwtportfolio.client.view.desktop.ProfileView.Presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ProjectsViewImpl extends Composite implements ProjectsView {

	private static ProjectsUiBinder uiBinder = GWT
			.create(ProjectsUiBinder.class);

	interface ProjectsUiBinder extends UiBinder<Widget, ProjectsViewImpl> {
	}

	private Presenter presenter;
	private String name;

	public ProjectsViewImpl() {
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
