package Compress_Decompress;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

import comp_decomp_methods.compress;
import comp_decomp_methods.decompress;

public class AppFrame extends JFrame implements ActionListener {
	
	JButton compressButton;
	JButton decompressButton;
	
	AppFrame()

	{
		this.setLayout(null);// 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		compressButton = new JButton("Select file to compress"); // creates button and gives Text
		compressButton.setBounds(200, 200, 200, 30);
		compressButton.addActionListener(this);
		
		decompressButton = new JButton("Select file to decompress");//creates button and gives Text
		decompressButton.setBounds(600, 200, 200, 30);
		decompressButton.addActionListener(this);
		
		this.add(compressButton); // adds compress button to frame
		this.add(decompressButton); // adds decompress button to frame
		this.setSize(1000, 500); // sets size of frame
		this.getContentPane().setBackground(Color.GREEN);
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== compressButton)// if we press compress button / if action is listened compress button
		{
			JFileChooser filechooser = new JFileChooser();// code should display file chooser upon listening an action on button press
			int response = filechooser.showSaveDialog(null);//pops up save file chooser
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try
				{
					compress.method(file);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}

		}
		if(e.getSource()== decompressButton)// if we press compress button / if action is listened compress button
		{
			JFileChooser filechooser = new JFileChooser();// code should display file chooser upon listening an action on button press
			int response = filechooser.showSaveDialog(null);//pops up save file chooser
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try
				{
					decompress.method(file);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}

		}
	}
	

}

