package se.johanremes.gwtportfolio.client.view.desktop;

import se.johanremes.gwtportfolio.client.view.desktop.ProfileView.Presenter;

import com.google.gwt.user.client.ui.IsWidget;

public interface ProjectsView extends IsWidget{
	void setName(String temp);

	void setPresenter(Presenter presenter);
}
