package GUI.admin.nav_menu;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import GUI.Button;
import GUI.NavGUI_Admin;

@SuppressWarnings("serial")
public class OtherTab extends JPanel {

	public OtherTab() {
		setAlignmentX(Component.RIGHT_ALIGNMENT);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));

		Button btCreateClass = new Button("lib/images/class_add.png",
				"Create Class");
		btCreateClass.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("createClass");
			}
		});
		btCreateClass.setPreferredSize(new Dimension(100, 90));
		add(btCreateClass);

		Button btChangeClass = new Button("lib/images/class_change.png",
				"Change Class");
		btChangeClass.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("changeClass");
			}
		});
		btChangeClass.setPreferredSize(new Dimension(110, 90));
		add(btChangeClass);

		JSeparator separator = new JSeparator();
		separator.setBorder(new EtchedBorder(EtchedBorder.LOWERED,
				SystemColor.textHighlight, null));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setPreferredSize(new Dimension(1, 50));
		add(separator);

		Button btCreateCourse = new Button("lib/images/course_add.png",
				"Create Course");
		btCreateCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("createCourse");
			}
		});
		btCreateCourse.setPreferredSize(new Dimension(110, 90));
		add(btCreateCourse);

		Button btChangeCourse = new Button("lib/images/course_change.png",
				"Change Course");
		btChangeCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("changeCourse");
			}
		});
		btChangeCourse.setPreferredSize(new Dimension(120, 90));
		add(btChangeCourse);

		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(1, 50));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED,
				SystemColor.textHighlight, null));
		add(separator_1);

		Button btCreateTuition = new Button("lib/images/tuition_add.png",
				"Create Tuition");
		btCreateTuition.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("createTuition");
			}
		});
		btCreateTuition.setPreferredSize(new Dimension(110, 90));
		add(btCreateTuition);

		Button btChangeTuition = new Button("lib/images/tuition_change.png",
				"Change Tuition");
		btChangeTuition.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("changeTuition");
			}
		});
		btChangeTuition.setPreferredSize(new Dimension(120, 90));
		add(btChangeTuition);

		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(1, 50));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED,
				SystemColor.textHighlight, null));
		add(separator_2);

		Button btCreateSubject = new Button("lib/images/subject_add.png",
				"Create Subject");
		btCreateSubject.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("createSubject");
			}
		});
		btCreateSubject.setPreferredSize(new Dimension(120, 90));
		add(btCreateSubject);

		Button btChangeSubject = new Button("lib/images/subject_change.png",
				"Change Subject");
		btChangeSubject.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				NavGUI_Admin.navPanel.showContent("changeSubject");
			}
		});
		btChangeSubject.setPreferredSize(new Dimension(120, 90));
		add(btChangeSubject);
	}
	
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon("lib/images/bak4.jpg").getImage();
		g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
	}
}
