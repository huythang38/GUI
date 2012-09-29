package GUI.admin.nav_panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.Color;

@SuppressWarnings("serial")
public class AccountChangeStatusPanel extends JPanel {
	private JTable tableShow;

	/**
	 * Create the panel.
	 */
	public AccountChangeStatusPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel searchPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) searchPanel.getLayout();
		flowLayout.setVgap(3);
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		searchPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		searchPanel.setPreferredSize(new Dimension(0, 30));
		add(searchPanel, BorderLayout.NORTH);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		searchPanel.add(lblSearch);
		
		JComboBox cbbxCourse = new JComboBox();
		cbbxCourse.setPreferredSize(new Dimension(150, 20));
		searchPanel.add(cbbxCourse);
		
		JComboBox cbbxClass = new JComboBox();
		cbbxClass.setPreferredSize(new Dimension(150, 20));
		searchPanel.add(cbbxClass);
		
		JComboBox cbbxStudent = new JComboBox();
		cbbxStudent.setPreferredSize(new Dimension(150, 20));
		searchPanel.add(cbbxStudent);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		JPanel contentPanel = new JPanel();
		splitPane.setLeftComponent(contentPanel);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBorder(new TitledBorder(null, "test", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane.setRightComponent(tablePanel);
		tablePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTable = new JScrollPane();
		tablePanel.add(scrollPaneTable, BorderLayout.CENTER);
		
		tableShow = new JTable();
		tableShow.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPaneTable.setViewportView(tableShow);
		splitPane.setDividerLocation(250);

	}
}
