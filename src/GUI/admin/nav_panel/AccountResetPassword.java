package GUI.admin.nav_panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class AccountResetPassword extends JPanel {

	/**
	 * Create the panel.
	 */
	public AccountResetPassword() {
		setLayout(new BorderLayout(0, 0));
		
		SearchPanel searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);

	}

}
